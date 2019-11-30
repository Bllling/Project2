package dao;

import java.util.List;

import entity.Rorder;

public interface IOrderDao {
	public List<Rorder> findOrderInfo(Integer uid, String condition, String type, Integer page);
	public int addOrder(String rorderid,Integer id,Integer uid,Integer state,Double total );
	public int updateOrderState(Double rorderid, Integer state);
	public int getTotal(Integer uid, String type, String condition);
}
