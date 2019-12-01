package servlet;

import java.io.IOException;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import biz.IAdminBiz;
import biz.impl.AdminBizImpl;
import dao.DBHelper;
import entity.Admin;

@WebServlet("/admin")
public class AdminServlet extends BasicServlet {
	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//获取操作
		String op = request.getParameter("op");
		if ("login".equals(op)) {
			login(request, response);
		}
	}

	/**
	 * 管理员登录的方法
	 * @param request
	 * @param response
	 */
	private void login(HttpServletRequest request, HttpServletResponse response) {
		String aname = request.getParameter("aname");
		String pwd = request.getParameter("pwd");
		
		IAdminBiz adminBiz = new AdminBizImpl();
		Admin admin = adminBiz.login(aname, pwd);
		DBHelper db = new DBHelper();
		Map<String, Object> map =  db.get("select * from admin");
	
		int result = -1;
		if (admin != null) {  //根据给定的账号和密码能够查到数据
			//说明登录成功  则把管理员信息存入session， 方便以后的界面获取
			request.getSession().setAttribute("admin", admin);
			result = 1;
		} else {
			result = 0;
		}
		//回送信息给前端  因为到时候前端会以ajax方法访问 所以回送一个状态值即可
		this.send(response, result);
	}
}
