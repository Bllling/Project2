package dao.impl;

import dao.DBHelper;
import dao.IOrderDetailDao;

public class IOrderDetaiDaoImpl implements IOrderDetailDao {

	@Override
	public int add(String rorderid, Integer arid, Double cpuprice, Double motherboardprice, Double memoryprice,
			Double diskprice,  Double sourceprice, Double graphicsprice, Double boxprice) {
		DBHelper db= new DBHelper();
		String sql="insert into rorderdetail values(?,?,?,?,?,?,?,?,?)";
		return db.update(sql, rorderid,arid,cpuprice,motherboardprice,memoryprice,diskprice,sourceprice,graphicsprice,boxprice);
	}

}
