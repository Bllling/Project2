package biz.impl;

import java.util.List;

import biz.IOrderBiz;
import dao.IOrderDao;
import dao.impl.OrderDaoImpl;
import entity.RorderDetail;

public class OrderBizImpl implements IOrderBiz {

	//查询订单详细信息
	@Override
	public List<RorderDetail> findOrderInfo() {
		IOrderDao orderDao = new OrderDaoImpl();
		return orderDao.findOrderInfo();
	}

}
