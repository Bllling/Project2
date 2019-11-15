package dao.impl;

import dao.DBHelper;
import dao.ICommentDao;

public class CommentDaoImpl  implements ICommentDao{

	@Override
	public int add(Integer id, Integer uid, String content, Integer praise) {
		DBHelper db = new DBHelper();
		String sql="insert into comment values(0,?,now(),?,?,?)";
		return db.update(sql, id,uid,content,praise);
	}

}
