package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AdminServlet extends BasicServlet{
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("utf-8");
		resp.setCharacterEncoding("utf-8");
		String op = req.getParameter("op");
		 if ("login".equals(op)) {
			login(req,resp);
		} 

	}

	private void login(HttpServletRequest req, HttpServletResponse resp) {
		// TODO 管理员登录
		
	}

}
