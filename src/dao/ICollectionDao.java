package dao;

import entity.Collection;

public interface ICollectionDao {
  public int add(Integer id ,Integer uid);
  
  /**
   * 根据用户ID查找配置单号
   * @param uid
   * @return
   */
  public  Collection findByID(Integer uid);
  
  
}
