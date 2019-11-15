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

	@Override
	public Computer findById(Integer id) {
		if(id == null){
			return null;
		}
		IComputerDao  computerDao = new ComputerDaoImpl();
		return computerDao.findById(id);
	}

	@Override
	public Computer findHardWardIdById(Integer id) {
		IComputerDao  computerDao = new ComputerDaoImpl();
		return computerDao.findHardWardIdById(id);
	}

	@Override
	public List<Computer> findPart(String type, String sumpriceMin, String sumpriceMax, String rtime) {
		IComputerDao  computerDao = new ComputerDaoImpl();
		return computerDao.findPart(type, sumpriceMin, sumpriceMax, rtime);
	}



	

	

}