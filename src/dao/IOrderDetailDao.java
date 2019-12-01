package dao;

import java.util.List;

import entity.RorderDetail;

public interface IOrderDetailDao {

    public RorderDetail findOrderDetailInfoByid (Double rorderid);

    int add(String  rorderid,Integer arid,Double cpuprice,Double motherboardprice,Double memoryprice,Double diskprice,Double sourceprice,Double graphicsprice,Double boxprice);

}
