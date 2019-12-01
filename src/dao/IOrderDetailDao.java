package dao;

import java.util.List;

import entity.RorderDetail;

public interface IOrderDetailDao {
    int add(String  rorderid,Integer arid,Double cpuprice,Double motherboardprice,Double memoryprice,Double diskprice,Double ssdprice,Double sourceprice,Double graphicsprice,Double boxprice);
    public RorderDetail findOrderDetailInfoByid (Double rorderid);
}
