package biz.impl;

import java.util.List;

import biz.IOrderBiz;
import dao.IOrderDao;
import dao.impl.OrderDaoImpl;
import entity.Rorder;
import util.StringUtil;

public class OrderBizImpl implements IOrderBiz {

	//查询订单详细信息
	@Override
	public List<Rorder> findOrderInfo(Integer uid, String condition, String type) {
		if (uid == null) {
			return null;
		}
		
		IOrderDao orderDao = new OrderDaoImpl();
		return orderDao.findOrderInfo(uid, condition, type);
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

	/**
	 * 更新订单的状态
	 */
	@Override
	public int updateOrderState(Double rorderid, Integer state) {
		if (rorderid == null || state == null) {
			return 0;
		}
		IOrderDao orderDao = new OrderDaoImpl();
		return orderDao.updateOrderState(rorderid, state);
	}

	//管理员查询订单信息
	@Override
	public List<Rorder> findOrderInfoByAdmin(String condition, String type) {
		if (StringUtil.CheckNull(type)) {
			return null;
		}
		IOrderDao orderDao = new OrderDaoImpl();
		return orderDao.findOrderInfo(null, condition, type);
	}

}
