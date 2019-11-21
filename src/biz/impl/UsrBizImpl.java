package biz.impl;

import java.util.List;

import biz.IUsrBiz;
import dao.IUsrDao;
import dao.impl.UsrDaoImpl;
import entity.Address;
import entity.Usr;
import util.StringUtil;

public class UsrBizImpl implements IUsrBiz {

	@Override
	public Usr login(String uname, String upwd) {
		if(StringUtil.CheckNull(uname,upwd)){
			return null;
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

	@Override
	public Usr findByName(String uname) {
		if (StringUtil.CheckNull(uname)) {
			return null;
		}
		IUsrDao usrDao = new UsrDaoImpl();
		return usrDao.findByName(uname);
	}

	@Override
	public Usr findAllByID(Integer uid) {
		if (uid == null) {
			return null;
		}
		IUsrDao usrDao = new UsrDaoImpl();
		return usrDao.findAllByID(uid);
	}

	@Override
	public List<Address> findAddrsById(Integer uid) {
		if (uid == null) {
			return null;
		}
		IUsrDao usrDao = new UsrDaoImpl();
		return usrDao.findAddrsById(uid);
	}

	

}
