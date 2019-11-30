package dao.impl;

import java.util.List;

import dao.DBHelper;
import dao.IOrderDao;
import entity.Rorder;

public class OrderDaoImpl implements IOrderDao{

	//查询订单信息
	@Override
	public List<Rorder> findOrderInfo(Integer uid, String condition, String type) {
		DBHelper dbHelper = new DBHelper();
		if ("noCondition".equals(type)) {
			String sql = " select r.rorderid, date_format(r.rtime, '%Y-%m-%d') rtime, u.uname, c.cname, c.detail, r.total, r.state, cpu.pics pics, mb.pics pics1, me.pics pics2, d.pics pics3, s.pics pics4, gra.pics pics5, b.pics pics6 from rorder r, usr u, computer c, cpu, motherboard mb, memory me, disk d, source s, graphics gra, box b where r.uid = u.uid and r.id = c.id and c.cpuid = cpu.cpuid and c.motherboardid = mb.motherboardid and c.memoryid = me.memoryid and c.diskid = d.diskid and c.sourceid = s.sourceid and c.graphicsid = gra.graphicsid and c.boxid = b.boxid and r.uid = ? ";
			return dbHelper.finds(sql, Rorder.class, uid);
		} else if ("hasCondition".equals(type)) {
			String sql = " select r.rorderid, date_format(r.rtime, '%Y-%m-%d') rtime, u.uname, c.cname, c.detail, r.total, r.state, cpu.pics pics, mb.pics pics1, me.pics pics2, d.pics pics3, s.pics pics4, gra.pics pics5, b.pics pics6 from rorder r, usr u, computer c, cpu, motherboard mb, memory me, disk d, source s, graphics gra, box b where r.uid = u.uid and r.id = c.id and c.cpuid = cpu.cpuid and c.motherboardid = mb.motherboardid and c.memoryid = me.memoryid and c.diskid = d.diskid and c.sourceid = s.sourceid and c.graphicsid = gra.graphicsid and c.boxid = b.boxid and r.uid = ? and (r.rorderid = ? or c.cname = ?) ";
			return dbHelper.finds(sql, Rorder.class, uid, condition, condition);
		} else {
			return null;
		}
		
		
	}
	
	public int addOrder(String rorderid,Integer id,Integer uid,Integer state,Double total ){
		DBHelper dbHelper = new DBHelper();
		String sql = "insert into rorder  values(?,?,?,now(),?,?)";
		return dbHelper.update(sql, rorderid,id,uid,state,total);
	}

	/**
	 * 更新订单的状态
	 */
	@Override
	public int updateOrderState(Double rorderid, Integer state) {
		DBHelper dbHelper = new DBHelper();
		String sql = "update rorder set state = ? where rorderid = ?";
		return dbHelper.update(sql, state, rorderid);
	}

}
