package biz.impl;

import biz.ICommentBiz;
import dao.ICommentDao;
import dao.impl.CommentDaoImpl;

public class CommetBizImpl  implements ICommentBiz{

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

}
