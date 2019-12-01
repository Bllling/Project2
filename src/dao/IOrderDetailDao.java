package dao;

import java.util.List;

import entity.RorderDetail;

public interface IOrderDetailDao {
<<<<<<< HEAD
    int add(String  rorderid,Integer arid,Double cpuprice,Double motherboardprice,Double memoryprice,Double diskprice,Double ssdprice,Double sourceprice,Double graphicsprice,Double boxprice);
    public RorderDetail findOrderDetailInfoByid (Double rorderid);
=======
    int add(String  rorderid,Integer arid,Double cpuprice,Double motherboardprice,Double memoryprice,Double diskprice,Double sourceprice,Double graphicsprice,Double boxprice);
>>>>>>> 1dde7e6adb4dc8abb85a05f2338c10772e373882
}
