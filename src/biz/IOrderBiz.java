package biz;

import java.util.List;

import entity.RorderDetail;

public interface IOrderBiz {
	public List<RorderDetail> findOrderInfo();
	public int addOrder(String rorderid,Integer id,Integer uid,Integer state,Double total );

}
