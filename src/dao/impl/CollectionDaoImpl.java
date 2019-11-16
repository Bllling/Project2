package dao.impl;

import java.util.List;

import dao.DBHelper;
import dao.ICollectionDao;
import entity.Collection;

public class CollectionDaoImpl implements ICollectionDao {

	@Override
	public int add(Integer id, Integer uid) {
		DBHelper db = new DBHelper();
		String sql="insert into collection values(0,?,now(),?)";
		return db.update(sql, id,uid);
	}

	@Override
	public Collection findByID(Integer uid) {
		DBHelper db = new DBHelper();
		String  sql = "select id from collection where uid = ?";
		return db.find(sql, Collection.class, uid);
	}
	public List<Collection> findsByID(Integer uid) {
		DBHelper db = new DBHelper();
		String  sql = "select id from collection where uid = ?";
		return db.finds(sql, Collection.class, uid);
	}
}
