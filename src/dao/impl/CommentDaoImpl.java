package dao.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import dao.DBHelper;
import dao.ICommentDao;
import entity.Comment;

public class CommentDaoImpl  implements ICommentDao{

	@Override
	public int add(Integer id, Integer uid, String content, Integer praise) {
		DBHelper db = new DBHelper();
		String sql="insert into comment values(0,?,now(),?,?,?)";
		return db.update(sql, id,uid,content,praise);
	}

	
	
	/**
	 * 查询所有评论
	 */
	@Override
	public List<Comment> findAllComment(Integer computerID, String sortType) {
		System.out.println("123");
		DBHelper dbHelper = new DBHelper();
		String sql = "";
		if ("commenttime".equals(sortType)) {
			sql = "select commentid, id, c.uid, date_format(commenttime,'%Y-%m-%d %H:%i:%s') commenttime , c.content, c.praise, u.uname from comment c, usr u where c.uid = u.uid and c.id = ?"
					+ " order by commenttime desc";   //最新排序
		} else if ("praise".equals(sortType)) {
			sql = "select commentid, id, c.uid, date_format(commenttime,'%Y-%m-%d %H:%i:%s') commenttime , c.content, c.praise, u.uname from comment c, usr u where c.uid = u.uid and c.id = ?"
					+ " order by praise desc";   //最热排序
		}
		return dbHelper.finds(sql, Comment.class, computerID);
	}



	@Override
	public int praise(Integer id) {
		DBHelper dbHelper = new DBHelper();
		String sql = "update comment set praise = praise + 1 where commentid = ?";
		return dbHelper.update(sql, id);
	}

}
