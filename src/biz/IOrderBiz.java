package biz;

import java.util.List;

import entity.RorderDetail;

public interface IOrderBiz {
	public List<RorderDetail> findOrderInfo();
}
