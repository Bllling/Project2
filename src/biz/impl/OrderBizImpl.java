package biz.impl;

import java.util.List;

import biz.IOrderBiz;
import dao.IOrderDao;
import dao.impl.OrderDaoImpl;
import entity.RorderDetail;
import util.StringUtil;

public class OrderBizImpl implements IOrderBiz {

	//查询订单详细信息
	@Override
	public List<RorderDetail> findOrderInfo() {
		IOrderDao orderDao = new OrderDaoImpl();
		return orderDao.findOrderInfo();
	}

	@Override
	public int addOrder(String rorderid, Integer id, Integer uid, Integer state, Double total) {
		if(StringUtil.CheckNull(rorderid)){
			return 0;
		}
		if(id==null||uid==null||state==null||total==null){
			return 0;
		}
		IOrderDao orderDao = new OrderDaoImpl();
		return orderDao.addOrder(rorderid, id, uid, state, total);
	}

}
