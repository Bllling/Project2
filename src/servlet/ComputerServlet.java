package servlet;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import biz.IComputerBiz;
import biz.impl.ComputerBizImpl;
import entity.Computer;


@WebServlet("/computer")
public class ComputerServlet extends BasicServlet{
private static final long serialVersionUID = 1L;
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String op = request.getParameter("op");
		if("findAll".equals(op)){
			findAll(request,response);
		}
		
	}

	private void findAll(HttpServletRequest request, HttpServletResponse response) {
		String type = request.getParameter("type");
		IComputerBiz computerBiz = new ComputerBizImpl();
		this.send(response, computerBiz.findAll(type));
		
	}
}
