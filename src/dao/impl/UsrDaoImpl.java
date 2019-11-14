package dao.impl;

import dao.DBHelper;
import dao.IUsrDao;
import entity.Usr;
import util.StringUtil;

public class UsrDaoImpl implements IUsrDao {

	

	@Override
	public int register(String uname,String upwd,String uemail,String utel,String upics) {
//		if(StringUtil.CheckNull(upics)){
//			upics="../../WebContent/images";
//		}
		DBHelper db = new DBHelper();
		String sql = "insert into usr values (0,?,?,?,?,?)";
		return db.update(sql, uname, upwd, uemail, utel, upics);
	}

	@Override
	public Usr login(String uname, String upwd) {
		DBHelper db = new DBHelper();
		String sql = "select uid,uname,upwd,uemail from usr where (utel=? or uemail=?) and upwd= ?";
		return db.find(sql, Usr.class,uname,uname,upwd);
		
	}

	@Override
	public int updatepwd(String newpwd,String uemail) {
		DBHelper db = new DBHelper();
		String sql = "update usr set upwd = ? where uemail = ?";
		return db.update(sql, newpwd,uemail);
	}

}
