package servlet;

import java.util.Map;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.jsp.JspFactory;
import javax.servlet.jsp.PageContext;

import util.VerificationCode;

@WebServlet("/vcode")
public class VCodeServlet extends BasicServlet{
	protected void doPost(HttpServletRequest request, HttpServletResponse response) {
		VerificationCode vcode = new VerificationCode();
		PageContext pageContext = JspFactory.getDefaultFactory().getPageContext(this, request, response, null, true, 8192, true);
		Map<String, String> rMap = vcode.getVCode(pageContext);
		System.out.println(rMap);
		this.send(response, rMap);
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) {
		doPost(request, response);
	}
}
