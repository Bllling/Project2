package dao;

import java.util.List;

import entity.RorderDetail;

public interface IOrderDao {
	public List<RorderDetail> findOrderInfo();
}
