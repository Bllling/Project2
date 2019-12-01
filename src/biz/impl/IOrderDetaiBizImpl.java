package biz.impl;

import biz.IOrderDetailBiz;
import dao.DBHelper;
import dao.IOrderDetailDao;
import dao.impl.IOrderDetaiDaoImpl;
import entity.RorderDetail;

public class IOrderDetaiBizImpl implements IOrderDetailBiz {

	@Override
	public int add(String rorderid, Integer arid, Double cpuprice, Double motherboardprice, Double memoryprice,
			Double diskprice,  Double sourceprice, Double graphicsprice, Double boxprice) {
		IOrderDetailDao dao = new IOrderDetaiDaoImpl();
		return dao.add(rorderid, arid, cpuprice, motherboardprice, memoryprice, diskprice, sourceprice, graphicsprice, boxprice);
	}

	//查详情
	@Override
	public RorderDetail findOrderDetailInfoByid(Double rorderid) {
		if (rorderid == null) {
			return null;
		}
		IOrderDetailDao orderDetailDao = new IOrderDetaiDaoImpl();
		return orderDetailDao.findOrderDetailInfoByid(rorderid);
	}



}
