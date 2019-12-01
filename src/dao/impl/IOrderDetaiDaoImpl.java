package dao.impl;

import java.util.List;

import dao.DBHelper;
import dao.IOrderDetailDao;
import entity.RorderDetail;

public class IOrderDetaiDaoImpl implements IOrderDetailDao {

	@Override
	public int add(String rorderid, Integer arid, Double cpuprice, Double motherboardprice, Double memoryprice,
			Double diskprice,  Double sourceprice, Double graphicsprice, Double boxprice) {
		DBHelper db= new DBHelper();
		String sql="insert into rorderdetail values(?,?,?,?,?,?,?,?,?)";
		return db.update(sql, rorderid,arid,cpuprice,motherboardprice,memoryprice,diskprice,sourceprice,graphicsprice,boxprice);
	}

	//查询订单详情
	@Override
	public RorderDetail findOrderDetailInfoByid(Double rorderid) {
		DBHelper dbHelper = new DBHelper();
		String sql = "select adr.province, adr.city, adr.county, adr.raddress, adr.addrtel, adr.addrname, r.rorderid, date_format(r.rtime,'%Y-%m-%d %H:%i:%s') rtime, r.state, cpu.pics pics, motherboard.pics pics1,  memory.pics pics2, disk.pics pics3, source.pics pics4, graphics.pics pics5, box.pics pics6, cpu.name name, motherboard.name name1,  memory.name name2, disk.name name3, source.name name4, graphics.name name5, box.name name6, rde.cpuprice cpuprice, rde.motherboardprice motherboardprice, rde.memoryprice memoryprice, rde.diskprice diskprice, rde.sourceprice sourceprice, rde.graphicsprice graphicsprice, rde.boxprice boxprice, cpu.score score, motherboard.score score1, memory.score score2, disk.score score3, source.score score4, graphics.score score5, box.score score6, r.total from rorder r, rorderdetail rde, address adr, computer c, cpu, motherboard, memory, disk, source, graphics, box where r.rorderid = rde.rorderid and r.id = c.id and rde.arid = adr.arid and c.cpuid = cpu.cpuid and c.motherboardid = motherboard.motherboardid and c.memoryid = memory.memoryid and c.diskid = disk.diskid and c.sourceid = source.sourceid and c.graphicsid = graphics.graphicsid and c.boxid = box.boxid and rde.rorderid = ?";
		
		return dbHelper.find(sql, RorderDetail.class, rorderid);
	}
	
	

}
