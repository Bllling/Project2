package biz.impl;

import biz.IUsrBiz;
import dao.IUsrDao;
import dao.impl.UsrDaoImpl;
import util.StringUtil;

public class UsrBizImpl implements IUsrBiz {

	@Override
	public int login(String uname, String upwd) {
		if(StringUtil.CheckNull(uname,upwd)){
			return -1;
		}
		IUsrDao dao = new UsrDaoImpl();
		return dao.login(uname, upwd);
	}

	@Override
	public int updatepwd(String newpwd, String uemail) {
		if(StringUtil.CheckNull(newpwd,uemail)){
			return -1;
		}
		IUsrDao dao = new UsrDaoImpl();
		return dao.updatepwd(newpwd, uemail);
	}

	@Override
	public int register(String uname, String upwd, String uemail, String utel, String upics) {
		if(StringUtil.CheckNull(uname,upwd,uemail,utel)){
			return -1;
		}
		IUsrDao dao = new UsrDaoImpl();
		return dao.register(uname, upwd, uemail, utel, upics);
	}

	

}
