package dao;

import java.util.List;

import entity.RorderDetail;

public interface IOrderDao {
	public List<RorderDetail> findOrderInfo();
	public int addOrder(String rorderid,Integer id,Integer uid,Integer state,Double total );
}
