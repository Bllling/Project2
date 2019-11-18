package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import biz.ICommentBiz;
import biz.impl.CommentBizImpl;
import dao.ICommentDao;

@WebServlet("/comment")
public class CommentServlet extends BasicServlet{
	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String op = request.getParameter("op");
		if ("addComment".equals(op)){
			addComment(request, response);
		} else if ("findAllComent".equals(op)) {
			findAllComent(request, response);
		} else if ("updatePraise".equals(op)) {
			updatePraise(request, response);
		}
	}
	
	//点赞
	private void updatePraise(HttpServletRequest request, HttpServletResponse response) {
		int id = Integer.parseInt(request.getParameter("id"));
		ICommentBiz commentBiz = new CommentBizImpl();
		this.send(response, commentBiz.praise(id));
	}

	//查询评论
	private void findAllComent(HttpServletRequest request, HttpServletResponse response) {
	    int conputerID = Integer.parseInt(request.getParameter("conputerID"));
	    String sortType = request.getParameter("sortType");
		ICommentBiz commentBiz = new CommentBizImpl();
		if ("praise".equals(sortType)) {  //按最热门排序
			this.send(response, commentBiz.findAllComment(conputerID, "praise"));
		} else if ("commenttime".equals(sortType)) {  //按最新排序
			this.send(response, commentBiz.findAllComment(conputerID, "commenttime"));
		}
		
	}

	//添加评论
	private void addComment(HttpServletRequest request, HttpServletResponse response) {
		int conputerId = Integer.parseInt(request.getParameter("conputerID")); 
		int uid = Integer.parseInt(request.getParameter("uid"));
		String comment = request.getParameter("comment");
		ICommentBiz commentBiz = new CommentBizImpl();
		this.send(response, commentBiz.add(conputerId, uid, comment, 0));
	}
}
