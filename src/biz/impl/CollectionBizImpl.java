package biz.impl;

import java.util.List;

import biz.ICollectionBiz;
import dao.ICollectionDao;
import dao.impl.CollectionDaoImpl;
import entity.Collection;
public class CollectionBizImpl implements ICollectionBiz {
	@Override
	public int add(Integer id, Integer uid) {
		if(id==null || uid==null){
			return -1;
		}
		ICollectionDao collectionDao = new CollectionDaoImpl();
		return collectionDao.add(id, uid);
	}

	@Override
	public Collection findByID(Integer uid) {
		if (uid==null){
			return null;
		}
		ICollectionDao collectionDao = new CollectionDaoImpl();
		return collectionDao.findByID(uid);
	}

	@Override
	public List<Collection> findsByID(Integer uid) {
		if (uid==null){
			return null;
		}
		ICollectionDao collectionDao = new CollectionDaoImpl();
		return collectionDao.findsByID(uid);
	}
}
