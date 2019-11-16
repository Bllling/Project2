package biz;

import java.util.List;

import entity.Collection;

public interface ICollectionBiz {
	 public int add(Integer id ,Integer uid);
	 public Collection findByID(Integer uid);
	 List<Collection> findsByID(Integer uid);
}
