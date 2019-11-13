package biz.impl;

import biz.IAdminBiz;
import dao.IAdminDao;
import dao.impl.AdminDaoImpl;
import entity.Admin;
import util.StringUtil;

public class AdminBizImpl implements IAdminBiz {

	@Override
	public Admin login(String aname, String pwd) {
		//先进行业务判断
		if (StringUtil.CheckNull(aname, pwd)) {
			return null;
		}
		IAdminDao adminDao = new AdminDaoImpl();
		return adminDao.login(aname, pwd);
	}
	
}
