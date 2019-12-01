package biz;

import entity.RorderDetail;

public interface IOrderDetailBiz {
    int add(String  rorderid,Integer arid,Double cpuprice,Double motherboardprice,Double memoryprice,Double diskprice,Double ssdprice,Double sourceprice,Double graphicsprice,Double boxprice);
    public RorderDetail findOrderDetailInfoByid (Double rorderid);
}
