package dao;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

public class DBHelper {
	/**
	 * 加载静态类
	 */
	/*static {
		try {
			Class.forName(ReadPro.getInstance().getProperty("driverClassName"));
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}*/

	/**
	 * 获取连接
	 * 
	 * @return
	 */
	private Connection getConnection() {
		Connection con = null;
		try {
		//	con = DriverManager.getConnection(ReadPro.getInstance().getProperty("url"), ReadPro.getInstance());
			Context ctx = new InitialContext();
			DataSource dataSource = (DataSource) ctx.lookup("java:comp/env/project2");
			con=dataSource.getConnection();
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (NamingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return con;
	}

	/**
	 * 给预编译执行语句中的占位符赋值
	 * 
	 * @param pstmt
	 *            要赋值的编译对象
	 * @param params
	 *            对应占位符的值
	 */
	private void setParams(PreparedStatement pstmt, Object... params) {
		if (params == null || params.length <= 0) {
			return;
		}
		for (int i = 0; i < params.length; i++) {
			try {
				pstmt.setObject(i + 1, params[i]);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}

	private void setParams(PreparedStatement pstmt, List<Object> params) {
		if (params == null || params.size() <= 0) {
			return;
		}
		for (int i = 0; i < params.size(); i++) {
			try {
				pstmt.setObject(i + 1, params.get(i));
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}

	/**
	 * 关闭资源的方法
	 * 
	 * @param rs
	 *            结果集
	 * @param pstmt
	 *            预编译执行语句块
	 * @param con
	 *            连接
	 */
	private void close(ResultSet rs, PreparedStatement pstmt, Connection con) {
		if (rs != null)
			try {
				rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		if (pstmt != null)
			try {
				pstmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		if (con != null)
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
	}

	/**
	 * 更新表
	 * 
	 * @param sql
	 *            要执行的语句
	 * @param params
	 *            占位符的值
	 * @return
	 */
	public int update(String sql, Object... params) {
		int result = -1;
		Connection con = null;
		PreparedStatement pstmt = null;
		con = this.getConnection();
		try {
			pstmt = con.prepareStatement(sql);
			this.setParams(pstmt, params);
			result = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			this.close(null, pstmt, con);
		}
		return result;
	}

	private String[] getColumnNames(ResultSet rs) {
		String[] colNames = null;
		try {
			ResultSetMetaData rsmd = rs.getMetaData();
			int colCount = rsmd.getColumnCount();
			colNames = new String[colCount];
			for (int i = 0; i < colCount; ++i) {
				colNames[i] = rsmd.getColumnLabel(i + 1).toLowerCase();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return colNames;
	}

	public Map<String, Object> get(String sql, Object... params) {
		ResultSet rs = null;
		Connection con = null;
		PreparedStatement pstmt = null;
		Map<String, Object> map = new HashMap<String, Object>();
		try {
			con = this.getConnection();
			pstmt = con.prepareStatement(sql);
			this.setParams(pstmt, params);
			rs = pstmt.executeQuery();
			String[] colNames = this.getColumnNames(rs);
			if (rs.next()) {
				String name = null;
				Object object = null;
				for (String colName : colNames) {

					object = rs.getObject(colName);
					if (object != null) {
						name = object.getClass().getSimpleName();

						if ("blob".equalsIgnoreCase(name)) {
							Blob blob = rs.getBlob(colName);
							byte[] bt = blob.getBytes(1, (int) blob.length());
							map.put(colName, bt);
						} else {
							map.put(colName, object);
						}
					} else {
						map.put(colName, object);
					}
				}
			}
		} catch (SQLException e) {

			e.printStackTrace();
		} finally {
			this.close(rs, pstmt, con);
		}
		return map;
	}

	public List<Map<String, Object>> gets(String sql, Object... params) {
		ResultSet rs = null;
		Connection con = null;
		PreparedStatement pstmt = null;
		List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
		try {
			con = this.getConnection();
			pstmt = con.prepareStatement(sql);
			this.setParams(pstmt, params);
			rs = pstmt.executeQuery();
			String[] colNames = this.getColumnNames(rs);
			Map<String, Object> map = null;
			while (rs.next()) {
				String name = null;
				Object object = null;
				map = new HashMap<String, Object>();
				for (String colName : colNames) {

					object = rs.getObject(colName);
					if (object != null) {
						name = object.getClass().getSimpleName();

						if ("blob".equalsIgnoreCase(name)) {
							Blob blob = rs.getBlob(colName);
							byte[] bt = blob.getBytes(1, (int) blob.length());
							map.put(colName, bt);
						} else {
							map.put(colName, object);
						}
					} else {
						map.put(colName, object);
					}
				}
				list.add(map);
			}
		} catch (SQLException e) {

			e.printStackTrace();
		} finally {
			this.close(rs, pstmt, con);
		}
		return list;
	}

	/**
	 * 更新表
	 * 
	 * @param sql
	 *            要执行的语句
	 * @param params
	 *            占位符的值
	 * @return
	 */
	public int update(String sql, List<Object> params) {
		int result = -1;
		Connection con = null;
		PreparedStatement pstmt = null;
		con = this.getConnection();
		try {
			pstmt = con.prepareStatement(sql);
			this.setParams(pstmt, params);
			result = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			this.close(null, pstmt, con);
		}
		return result;
	}

	public Map<String, Object> get(String sql, List<Object> params) {
		ResultSet rs = null;
		Connection con = null;
		PreparedStatement pstmt = null;
		Map<String, Object> map = new HashMap<String, Object>();
		try {
			con = this.getConnection();
			pstmt = con.prepareStatement(sql);
			this.setParams(pstmt, params);
			rs = pstmt.executeQuery();
			String[] colNames = this.getColumnNames(rs);
			if (rs.next()) {
				String name = null;
				Object object = null;
				for (String colName : colNames) {

					object = rs.getObject(colName);
					if (object != null) {
						name = object.getClass().getSimpleName();

						if ("blob".equalsIgnoreCase(name)) {
							Blob blob = rs.getBlob(colName);
							byte[] bt = blob.getBytes(1, (int) blob.length());
							map.put(colName, bt);
						} else {
							map.put(colName, object);
						}
					} else {
						map.put(colName, object);
					}
				}
			}
		} catch (SQLException e) {

			e.printStackTrace();
		} finally {
			this.close(rs, pstmt, con);
		}
		return map;
	}

	public List<Map<String, Object>> gets(String sql, List<Object> params) {
		ResultSet rs = null;
		Connection con = null;
		PreparedStatement pstmt = null;
		List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
		try {
			con = this.getConnection();
			pstmt = con.prepareStatement(sql);
			this.setParams(pstmt, params);
			rs = pstmt.executeQuery();
			String[] colNames = this.getColumnNames(rs);
			Map<String, Object> map = null;
			while (rs.next()) {
				String name = null;
				Object object = null;
				map = new HashMap<String, Object>();
				for (String colName : colNames) {

					object = rs.getObject(colName);
					if (object != null) {
						name = object.getClass().getSimpleName();

						if ("blob".equalsIgnoreCase(name)) {
							Blob blob = rs.getBlob(colName);
							byte[] bt = blob.getBytes(1, (int) blob.length());
							map.put(colName, bt);
						} else {
							map.put(colName, object);
						}
					} else {
						map.put(colName, object);
					}
				}
				list.add(map);
			}
		} catch (SQLException e) {

			e.printStackTrace();
		} finally {
			this.close(rs, pstmt, con);
		}
		return list;
	}

	public int getTotal(String sql, Object... params) {
		Connection con = null;
		PreparedStatement psmt = null;
		ResultSet rs = null;
		int result = 0;
		try {
			con = this.getConnection();
			psmt = con.prepareStatement(sql);
			this.setParams(psmt, params);
			rs = psmt.executeQuery();
			if (rs.next()) {
				result = rs.getInt(1);

			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			this.close(rs, psmt, con);
		}
		return result;
	}

	public int getTotal(String sql, List<Object> params) {
		Connection con = null;
		PreparedStatement psmt = null;
		ResultSet rs = null;
		int result = 0;
		try {
			con = this.getConnection();
			psmt = con.prepareStatement(sql);
			this.setParams(psmt, params);
			rs = psmt.executeQuery();
			if (rs.next()) {
				result = rs.getInt(1);

			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			this.close(rs, psmt, con);
		}
		return result;
	}

	/**
	 *	泛型查询  对象的集合
	 * @param sql		要执行的查询语句
	 * @param c			
	 * @param params	查询语句中 对应占位符的值
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public <T>List<T> finds (String sql,  Class <?> c, Object ... params){
		List<T> list = new ArrayList<T>();
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			con = this.getConnection();
			pstmt = con.prepareStatement(sql);
			setParams(pstmt, params);
			rs = pstmt.executeQuery();
			//获取所有列名
			String[] columnNames = getColumnNames(rs);
			//声明一个对象
			T t = null;
			Object obj = null;
			String typeName = null;
			//通过反射获取所有的Method方法
			Method[] methods = c.getDeclaredMethods();
	
			while(rs.next()){
				
				//创建一个对象
				t = (T) c.newInstance();//相当于调用无参数的构造方法 可等于UserInfoBean users = new UserInfoBean()
				//循环列
				for(String columnName :columnNames){
					obj = rs.getObject(columnName);//获取对应的值
					//循环所有的方法
					for(Method m : methods){
						String name = "set"+columnName;
						if(name.equalsIgnoreCase(m.getName())){//是否对应的setXXX方法
							if(obj == null){
								continue;
							}
							//获取值的类型
							typeName = obj.getClass().getName();
							if("java.math.BigDecimal".equals(typeName)){
								try {
									m.invoke(t, rs.getInt(columnName));
								} catch (Exception e) {
									m.invoke(t, rs.getDouble(columnName));
								} 
							}else if("java.lang.Integer".equals(typeName)){
								m.invoke(t, rs.getInt(columnName));
							}else if("java.lang.Double".equals(typeName)){
								m.invoke(t, rs.getDouble(columnName));
							}else if("java.lang.String".equals(typeName)){
								m.invoke(t, rs.getString(columnName));
							}else if("java.lang.CLOB".equals(typeName)){
								Reader in = rs.getCharacterStream(columnName);
								BufferedReader br = new BufferedReader(in);
								StringBuffer sb = new StringBuffer();
								String str = br.readLine();//每次读取一行数据
								while(str != null){
									sb.append(str);
									str = br.readLine();
								}
								m.invoke(t, sb.toString());
							}else{
								//后期扩展
							}
						}
					}
				}
				list.add(t);//设置对象到List集合中
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}finally{
			close(rs, pstmt, con);
		}
		return list;
	}
	@SuppressWarnings("unchecked")
	public <T> T find (String sql,  Class <?> c, Object ... params){
		List<T> list = new ArrayList<T>();
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		T t = null;
		
		try {
			con = this.getConnection();
			pstmt = con.prepareStatement(sql);
			setParams(pstmt, params);
			rs = pstmt.executeQuery();
			//获取所有列名
			String[] columnNames = getColumnNames(rs);
			//声明一个对象
			
			Object obj = null;
			String typeName = null;
			//通过反射获取所有的Method方法
			Method[] methods = c.getDeclaredMethods();
	
			while(rs.next()){
				
				//创建一个对象
				t = (T) c.newInstance();//相当于调用无参数的构造方法 可等于UserInfoBean users = new UserInfoBean()
				//循环列
				for(String columnName :columnNames){
					obj = rs.getObject(columnName);//获取对应的值
					//循环所有的方法
					for(Method m : methods){
						String name = "set"+columnName;
						if(name.equalsIgnoreCase(m.getName())){//是否对应的setXXX方法
							if(obj == null){
								continue;
							}
							//获取值的类型
							typeName = obj.getClass().getName();
														if("java.math.BigDecimal".equals(typeName)){
								try {
									m.invoke(t, rs.getInt(columnName));
								} catch (Exception e) {
									m.invoke(t, rs.getDouble(columnName));
								} 
							}else if("java.lang.Integer".equals(typeName)){
								m.invoke(t, rs.getInt(columnName));
							}else if("java.lang.Double".equals(typeName)){
								m.invoke(t, rs.getDouble(columnName));
							}else if("java.lang.String".equals(typeName)){
								m.invoke(t, rs.getString(columnName));
							}else if("java.lang.CLOB".equals(typeName)){
								Reader in = rs.getCharacterStream(columnName);
								BufferedReader br = new BufferedReader(in);
								StringBuffer sb = new StringBuffer();
								String str = br.readLine();//每次读取一行数据
								while(str != null){
									sb.append(str);
									str = br.readLine();
								}
								m.invoke(t, sb.toString());
							}else{
								//后期扩展
							}
						}
					}
				}
				list.add(t);//设置对象到List集合中
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}finally{
			close(rs, pstmt, con);
		}
		return t;
	}
	@SuppressWarnings("unchecked")
	public <T>List<T> finds (String sql,  Class <?> c, List<Object> params){
		List<T> list = new ArrayList<T>();
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			con = this.getConnection();
			pstmt = con.prepareStatement(sql);
			setParams(pstmt, params);
			rs = pstmt.executeQuery();
			//获取所有列名
			String[] columnNames = getColumnNames(rs);
			//声明一个对象
			T t = null;
			Object obj = null;
			String typeName = null;
			//通过反射获取所有的Method方法
			Method[] methods = c.getDeclaredMethods();
	
			while(rs.next()){
				
				//创建一个对象
				t = (T) c.newInstance();//相当于调用无参数的构造方法 可等于UserInfoBean users = new UserInfoBean()
				//循环列
				for(String columnName :columnNames){
					obj = rs.getObject(columnName);//获取对应的值
					//循环所有的方法
					for(Method m : methods){
						String name = "set"+columnName;
						if(name.equalsIgnoreCase(m.getName())){//是否对应的setXXX方法
							if(obj == null){
								continue;
							}
							//获取值的类型
							typeName = obj.getClass().getName();
							
							if("java.math.BigDecimal".equals(typeName)){
								try {
									m.invoke(t, rs.getInt(columnName));
								} catch (Exception e) {
									m.invoke(t, rs.getDouble(columnName));
								} 
							}else if("java.lang.Integer".equals(typeName)){
								m.invoke(t, rs.getInt(columnName));
							}else if("java.lang.Double".equals(typeName)){
								m.invoke(t, rs.getDouble(columnName));
							}else if("java.lang.String".equals(typeName)){
								m.invoke(t, rs.getString(columnName));
							}else if("java.lang.CLOB".equals(typeName)){
								Reader in = rs.getCharacterStream(columnName);
								BufferedReader br = new BufferedReader(in);
								StringBuffer sb = new StringBuffer();
								String str = br.readLine();//每次读取一行数据
								while(str != null){
									sb.append(str);
									str = br.readLine();
								}
								m.invoke(t, sb.toString());
							}else{
								//后期扩展
							}
						}
					}
				}
				list.add(t);//设置对象到List集合中
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}finally{
			close(rs, pstmt, con);
		}
		return list;
	}
	@SuppressWarnings("unchecked")
	public <T> T find (String sql,  Class <?> c, List<Object> params){
		List<T> list = new ArrayList<T>();
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		T t = null;
		
		try {
			con = this.getConnection();
			pstmt = con.prepareStatement(sql);
			setParams(pstmt, params);
			rs = pstmt.executeQuery();
			//获取所有列名
			String[] columnNames = getColumnNames(rs);
			//声明一个对象
			
			Object obj = null;
			String typeName = null;
			//通过反射获取所有的Method方法
			Method[] methods = c.getDeclaredMethods();
	
			while(rs.next()){
				
				//创建一个对象
				t = (T) c.newInstance();//相当于调用无参数的构造方法 可等于UserInfoBean users = new UserInfoBean()
				//循环列
				for(String columnName :columnNames){
					obj = rs.getObject(columnName);//获取对应的值
					//循环所有的方法
					for(Method m : methods){
						String name = "set"+columnName;
						if(name.equalsIgnoreCase(m.getName())){//是否对应的setXXX方法
							if(obj == null){
								continue;
							}
							//获取值的类型
							typeName = obj.getClass().getName();
							
							if("java.math.BigDecimal".equals(typeName)){
								try {
									m.invoke(t, rs.getInt(columnName));
								} catch (Exception e) {
									m.invoke(t, rs.getDouble(columnName));
								} 
							}else if("java.lang.Integer".equals(typeName)){
								m.invoke(t, rs.getInt(columnName));
							}else if("java.lang.Double".equals(typeName)){
								m.invoke(t, rs.getDouble(columnName));
							}else if("java.lang.String".equals(typeName)){
								m.invoke(t, rs.getString(columnName));
							}else if("java.lang.CLOB".equals(typeName)){
								Reader in = rs.getCharacterStream(columnName);
								BufferedReader br = new BufferedReader(in);
								StringBuffer sb = new StringBuffer();
								String str = br.readLine();//每次读取一行数据
								while(str != null){
									sb.append(str);
									str = br.readLine();
								}
								m.invoke(t, sb.toString());
							}else{
								//后期扩展
							}
						}
					}
				}
				list.add(t);//设置对象到List集合中
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}finally{
			close(rs, pstmt, con);
		}
		return t;
	}
}
