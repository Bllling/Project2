package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class UsrServlet extends BasicServlet{
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("utf-8");
		resp.setCharacterEncoding("utf-8");
		String op = req.getParameter("op");
		if ("sendemail".equals(op)) {
			sendemail(req,resp);
		} 

	}

	private void sendemail(HttpServletRequest req, HttpServletResponse resp) {
	//DOTO:发送邮箱验证码
		
	}
}
