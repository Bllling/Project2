package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import biz.IUsrBiz;
import biz.impl.UsrBizImpl;

@WebServlet("/usr")
public class UsrServlet extends BasicServlet{
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("utf-8");
		resp.setCharacterEncoding("utf-8");
		String op = req.getParameter("op");
		if ("sendemail".equals(op)) {
			sendemail(req,resp);
		} else if ("register".equals(op)) {
			register(req,resp);
		} else if ("login".equals(op)) {
			login(req,resp);
		} else if ("update".equals(op)) {
			update(req,resp);
		} 

	}

	private void update(HttpServletRequest req, HttpServletResponse resp) {
		// TODO 用户更新密码
		
	}

	private void login(HttpServletRequest req, HttpServletResponse resp) {
		// TODO 用户登录
		String uname = req.getParameter("uname");
		String upwd = req.getParameter("upwd");
		IUsrBiz usrBiz = new UsrBizImpl();
		this.send(resp, usrBiz.login(uname, upwd));
	}

	private void register(HttpServletRequest req, HttpServletResponse resp) {
		// TODO 用户注册
		
	}

	private void sendemail(HttpServletRequest req, HttpServletResponse resp) {
	//TODO:发送邮箱验证码到用户邮箱
		
	}
}
