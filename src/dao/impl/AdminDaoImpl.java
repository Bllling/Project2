package dao.impl;

import dao.DBHelper;
import dao.IAdminDao;
import entity.Admin;

public class AdminDaoImpl implements IAdminDao{

	/**
	 * 管理员登录可通过用户名，邮箱，电话号码登录
	 */
	@Override
	public Admin login(String aname, String pwd) {
		DBHelper dbHelper = new DBHelper();
		String sql = "select aid, aname, apwd, aemail from admin where (aname = ? or aemail = ? or atel = ?) and apwd = password(?)";
		return dbHelper.find(sql, Admin.class, aname, aname, aname, pwd);
	}

}
