package biz.impl;

import java.util.List;
import java.util.Map;

import biz.ICommentBiz;
import biz.IComputerBiz;
import dao.IComputerDao;
import dao.impl.ComputerDaoImpl;
import entity.Collection;
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
	public List<Computer> findPart(String type, String sumpriceMin, String sumpriceMax, String rtime,int page,int rows) {
		IComputerDao  computerDao = new ComputerDaoImpl();
		return computerDao.findPart(type, sumpriceMin, sumpriceMax, rtime,page,rows);
	}

	@Override
	public int getTotalPart(String sumpriceMin, String sumpriceMax, String rtime) {
		IComputerDao  computerDao = new ComputerDaoImpl();
		return computerDao.getTotalPart(sumpriceMin, sumpriceMax, rtime);
	}

	@Override
	public List<Computer> findByUid(Integer uid) {
		IComputerDao  computerDao = new ComputerDaoImpl();
		return computerDao.findByUid(uid);
	}

	@Override
	public List<Computer> findAllByMoreId(List<Collection> list) {
		if(list==null||list.size()<0){
			return null;
		}
		IComputerDao computerDao = new ComputerDaoImpl();
		return computerDao.findAllByMoreId(list);
	}

	@Override
	public int updateBnumber(Integer id) {
		if(id == null){
			return -1;
		}
		IComputerDao computerDao = new ComputerDaoImpl();
		return computerDao.updateBnumber(id);
	}

	@Override
	public Computer findDetailByID(Integer id) {
		if (id == null) {
			return null;
		}
		IComputerDao computerDao = new ComputerDaoImpl();
		return computerDao.findDetailByID(id);
	}

	@Override
	public int getTotalByUid(Integer uid) {
		if (uid == null) {
			return -1;
		}
		IComputerDao computerDao = new ComputerDaoImpl();
		return computerDao.getTotalByUid(uid);
	}

	@Override
	public int getBnumebrByUid(Integer uid) {
		if (uid == null) {
			return -1;
		}
		IComputerDao computerDao = new ComputerDaoImpl();
		return computerDao.getBnumebrByUid(uid);
	}

	@Override
	public int getZnumebrByUid(Integer uid) {
		if (uid == null) {
			return -1;
		}
		IComputerDao computerDao = new ComputerDaoImpl();
		return computerDao.getZnumebrByUid(uid);
	}



	

}
