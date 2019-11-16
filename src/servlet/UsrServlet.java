package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.websocket.Session;

import biz.ICollectionBiz;
import biz.IUsrBiz;
import biz.impl.CollectionBizImpl;
import biz.impl.UsrBizImpl;
import entity.Usr;

@WebServlet("/usr")
public class UsrServlet extends BasicServlet{
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("utf-8");
		resp.setCharacterEncoding("utf-8");
		String op = req.getParameter("op");
		System.out.println(op);
		if ("sendemail".equals(op)) {
			sendemail(req,resp);
		} else if ("register".equals(op)) {
			register(req,resp);
		} else if ("login".equals(op)) {
			login(req,resp);
		} else if ("update".equals(op)) {
			update(req,resp);
		} else if("collection".equals(op)){
			collection(req,resp);
		} else if("findByID".equals(op)){
			findByID(req,resp);
		}

	}
	/**
	 *  在收藏夹表中根据用户ID查找配置单号
	 * @param req
	 * @param resp
	 */

	private void findByID(HttpServletRequest req, HttpServletResponse resp) {
		int uid = Integer.parseInt(req.getParameter("uid"));
		System.out.println(uid);
		ICollectionBiz collectionBiz = new CollectionBizImpl();
		this.send(resp, collectionBiz.findByID(uid));
		
		
	}

	/**
	 * 用户收藏
	 * @param req
	 * @param resp
	 */
	private void collection(HttpServletRequest req, HttpServletResponse resp) {
		int id = Integer.parseInt(req.getParameter("id"));
		int uid = Integer.parseInt(req.getParameter("uid"));
		ICollectionBiz collectionBiz = new CollectionBizImpl();
		this.send(resp, collectionBiz.add(id, uid));
	}

	private void update(HttpServletRequest req, HttpServletResponse resp) {
		// TODO 用户更新密码
		
	}

	private void login(HttpServletRequest req, HttpServletResponse resp) {
		// TODO 用户登录
		String uname = req.getParameter("uname");
		String upwd = req.getParameter("upwd");
		IUsrBiz usrBiz = new UsrBizImpl();
		int result = -1;
		Usr usr=usrBiz.login(uname, upwd);
		if(usr !=null){
			req.getSession().setAttribute("currentAdmin", usr);
			req.getSession().setMaxInactiveInterval(10);
	
			result = 1;
		}else{
			result=0;
		}
        this.send(resp, result);
	}

	private void register(HttpServletRequest req, HttpServletResponse resp) {
		// TODO 用户注册
		
	}

	private void sendemail(HttpServletRequest req, HttpServletResponse resp) {
	//TODO:发送邮箱验证码到用户邮箱
		
	}
}
