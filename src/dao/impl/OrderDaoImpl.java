package dao.impl;

import java.util.List;

import dao.DBHelper;
import dao.IOrderDao;
import entity.RorderDetail;

public class OrderDaoImpl implements IOrderDao{

	//查询订单详细信息
	@Override
	public List<RorderDetail> findOrderInfo() {
		DBHelper dbHelper = new DBHelper();
		//String sql = " select r.rorderid, date_format(r.rtime, '%Y-%m-%d') rtime, u.uname, c.cname, c.detail, c.sumprice, cpu.pics cpupics, mb.pics mbpics, me.pics mepics, d.pics dpics, s.pics spics, gra.pics grapics, b.pics bpics from rorder r, usr u, computer c, cpu, motherboard mb, memory me, disk d, source s, graphics gra, box b, rorderdetail rd where r.uid = u.uid and r.id = c.id and rd.cpuid = cpu.cpuid and rd.motherboardid = mb.motherboardid and rd.memoryid = me.memoryid and rd.diskid = d.diskid and rd.sourceid = s.sourceid and rd.graphicsid = gra.graphicsid and rd.boxid = b.boxid and r.rorderid = rd.rorderid";
		//return dbHelper.finds(sql, RorderDetail.class);
		return null;
	}

}
