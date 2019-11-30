package dao.impl;

import java.util.List;
import java.util.Map;

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
	 * 通过用户名或邮箱或号码查询是否重名
	 */
	@Override
	public Usr findByName(String uname) {
		DBHelper dbHelper = new DBHelper();
		String sql = "select uname from usr where uname = ? or uemail = ? or utel = ?";
		return dbHelper.find(sql, Usr.class, uname, uname, uname);
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
		String sql = "select arid, province, city, county, raddress, addrname, addrtel, postcode, isdefault from address where uid = ?";
		return dbHelper.finds(sql, Address.class, uid);
	}

	@Override
	public Usr findUemailByUid(Integer uid) {
		DBHelper dbHelper = new DBHelper();
		String sql="select uemail from usr where uid = ?";
		return dbHelper.find(sql, Usr.class, uid);
	}

	@Override
	public int updateUsrInfo(Map<String, String> map, Integer uid) {
		DBHelper dbHelper = new DBHelper();
		if (map.containsKey("pics")){
			String sql = "update usr set uname = ?, uemail = ?, utel = ?, upics = ? where uid = ?";
			return dbHelper.update(sql, map.get("p_usrName"), map.get("p_email"), map.get("p_phone"), map.get("pics"), uid);
		}
		String sql = "update usr set uname = ?, uemail = ?, utel = ? where uid = ?";
		return dbHelper.update(sql, map.get("p_usrName"), map.get("p_email"), map.get("p_phone"), uid);
	}

}
