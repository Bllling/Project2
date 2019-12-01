package dao;

public interface IOrderDetailDao {
    int add(String  rorderid,Integer arid,Double cpuprice,Double motherboardprice,Double memoryprice,Double diskprice,Double sourceprice,Double graphicsprice,Double boxprice);
}
