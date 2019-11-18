package biz.impl;

import java.util.List;
import java.util.Map;

import biz.ICommentBiz;
import dao.ICommentDao;
import dao.impl.CommentDaoImpl;
import entity.Comment;
import util.StringUtil;

public class CommentBizImpl  implements ICommentBiz{

	@Override
	public int add(Integer id, Integer uid, String content, Integer praise) {
		if(id==null||uid==null){
			return -1;
		}
		if(praise==null){
			praise=0;
		}
		ICommentDao commentDao = new CommentDaoImpl();
		return commentDao.add(id, uid, content, praise);
	}

	
	//查询所有评论
	@Override
	public List<Comment> findAllComment(Integer computerID, String sortType) {
		if (computerID == null) {
			return null;
		}
		if (StringUtil.CheckNull(sortType)) {
			return null;
		}
		ICommentDao commentDao = new CommentDaoImpl();
		return commentDao.findAllComment(computerID, sortType);
	}


	@Override
	public int praise(Integer id) {
		if (id == null) {
			return 0;
		}
		ICommentDao commentDao = new CommentDaoImpl();
		return commentDao.praise(id);
	}

}
