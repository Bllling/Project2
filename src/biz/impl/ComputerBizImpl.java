package biz.impl;

import java.util.List;
import java.util.Map;

import biz.ICommentBiz;
import biz.IComputerBiz;
import dao.IComputerDao;
import dao.impl.ComputerDaoImpl;
import entity.Computer;
import util.StringUtil;


public class ComputerBizImpl implements IComputerBiz{

	@Override
	public int add(Map<String, String> map) {
		
		return 1;
	}

	@Override
	public List<Computer> findAll(String type) {
		if(StringUtil.CheckNull(type)){
			return null;
		}
		IComputerDao  computerDao = new ComputerDaoImpl();
		return  computerDao.findAll(type);
	}



	

	

}
