package dao;

import java.util.List;

import entity.Collection;

public interface ICollectionDao {
  public int add(Integer id ,Integer uid);
  
  /**
   * 根据用户ID查找一条配置单号
   * @param uid
   * @return
   */
  public  Collection findByID(Integer uid);
  
/**
 * 根据用户ID查找多条配置单号
 * @param uid
 * @return
 */
  public List<Collection> findsByID(Integer uid);
  
  
}
