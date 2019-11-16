package biz;

import entity.Collection;

public interface ICollectionBiz {
	 public int add(Integer id ,Integer uid);
	 public Collection findByID(Integer uid);
}
