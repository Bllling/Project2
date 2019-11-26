package dao;


import java.util.List;
import java.util.Map;

import entity.Collection;
import entity.Computer;

public interface IComputerDao {
	/**
	 * 添加配置单
	 * @param map
	 * @return
	 */
     public int add(Map<String, String> map);
     
     
     /**
      * 查找配置单表所有信息和各硬件的名字图片和用户名称 ，根据type属性排序
      * @param type
      * @return
      */
     public List<Computer> findAll(String type);
     
     
     /**
      * 通过ID查找配置单各硬件ID
      * @param id
      * @return
      */
     public Computer findById(Integer id);
  
     
     /**
      * 通过配置单ID查找配置单
      * @param id
      * @return
      */
     public Computer findHardWardIdById(Integer id);
     
     /**
      * 条件查询，排序属性，最小价格，最高价格，攒机年份
      * @param id
      * @return
      */
     public List<Computer> findPart(String type,String sumpriceMin,String sumpriceMax,String rtime,int page,int rows);
     
     public int getTotalPart(String sumpriceMin,String sumpriceMax,String rtime);
     
     /**
      * 通过用户ID查询所有
      * @param uid
      * @return
      */
     public List<Computer> findByUid(Integer uid);
     
     /**
      *  通过多个用户ID查询所有
      * @param list
      * @return
      */
     public List<Computer> findAllByMoreId(List<Collection> list);
     
     /**
      * 更新浏览次数
      * @param id
      * @return
      */
     public int updateBnumber(Integer id);
     
     /**
      * 通过配置单ID查配置描述
      * @param id
      * @return
      */
     public Computer findDetailByID(Integer id);
     /**
      * 根据Uid查找订单总数
      */
     public int getTotalByUid(Integer uid);
     
     /**
      * 根据Uid查找所有订单的浏览数
      */
     public int getBnumebrByUid(Integer uid);
     /**
      * 根据Uid查找所有订单的点赞数
      */
     public int getZnumebrByUid(Integer uid);
}
