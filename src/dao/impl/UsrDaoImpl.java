package dao.impl;

import java.util.List;

import dao.DBHelper;
import dao.IUsrDao;
import entity.Address;
import entity.Usr;
import util.StringUtil;

public class UsrDaoImpl implements IUsrDao {

	

	@Override
	public int register(String uname,String upwd,String uemail,String utel,String upics) {
//		if(StringUtil.CheckNull(upics)){
//			upics="../../WebContent/images";
//		}
		DBHelper db = new DBHelper();
		String sql = "insert into usr values (0,?,password(?),?,?,?)";
		return db.update(sql, uname, upwd, uemail, utel, upics);
	}

	@Override
	public Usr login(String uname, String upwd) {
		DBHelper db = new DBHelper();
		String sql = "select uid,uname,upwd,uemail from usr where (utel=? or uemail=?) and upwd=password(?)";
		return db.find(sql, Usr.class,uname,uname,upwd);
		
	}

	@Override
	public int updatepwd(String newpwd,String uemail) {
		DBHelper db = new DBHelper();
		String sql = "update usr set upwd = password(?) where uemail = ?";
		return db.update(sql, newpwd,uemail);
	}

	/**
	 * 通过用户名查询是否重名
	 */
	@Override
	public Usr findByName(String uname) {
		DBHelper dbHelper = new DBHelper();
		String sql = "select uname from usr where uname = ?";
		return dbHelper.find(sql, Usr.class, uname);
	}

	/**
	 * 通过用户ID查询所有
	 */
	@Override
	public Usr findAllByID(Integer uid) {
		DBHelper dbHelper = new DBHelper();
		String sql = "select uname, uemail, utel, upics from usr where uid = ?";
		return dbHelper.find(sql, Usr.class, uid);
	}

	/**
	 * 通过用户ID查询地址表 查找该用户的 所有地址
	 */
	@Override
	public List<Address> findAddrsById(Integer uid) {
		DBHelper dbHelper = new DBHelper();
		String sql = "select province, city, county, raddress, addrname, addrtel, postcode from address where uid = ?";
		return dbHelper.finds(sql, Address.class, uid);
	}

	@Override
	public Usr findUemailByUid(Integer uid) {
		DBHelper dbHelper = new DBHelper();
		String sql="select uemail from usr where uid = ?";
		return dbHelper.find(sql, Usr.class, uid);
	}

}
