package biz;

import java.util.List;

import entity.Rorder;

public interface IOrderBiz {
	public List<Rorder> findOrderInfo(Integer uid, String condition, String type);
	public List<Rorder> findOrderInfoByAdmin(String condition, String type);
	public int addOrder(String rorderid,Integer id,Integer uid,Integer state,Double total );
	public int updateOrderState(Double rorderid, Integer state);
}
