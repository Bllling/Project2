package biz;

import entity.RorderDetail;

public interface IOrderDetailBiz {


    public RorderDetail findOrderDetailInfoByid (Double rorderid);

    int add(String  rorderid,Integer arid,Double cpuprice,Double motherboardprice,Double memoryprice,Double diskprice,Double sourceprice,Double graphicsprice,Double boxprice);


}
