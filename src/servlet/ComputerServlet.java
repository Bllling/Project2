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
import biz.IHardwareBiz;
import biz.impl.ComputerBizImpl;
import biz.impl.HardwareBizImpl;
import entity.Computer;


@WebServlet("/computer")
public class ComputerServlet extends BasicServlet{
private static final long serialVersionUID = 1L;
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String op = request.getParameter("op");
		if("findAll".equals(op)){
			findAll(request,response);
		}else if("findById".equals(op)){
			findById(request,response);
		}else if("findHardWare".equals(op)){
			findHardWare(request,response);
		}else if("findByPart".equals(op)){
			findByPart(request,response);
		}
		
	}

	private void findByPart(HttpServletRequest request, HttpServletResponse response) {

		String sumpriceMin=request.getParameter("sumpriceMin");
		String sumpriceMax=request.getParameter("sumpriceMax");
		String rtime=request.getParameter("rtime");
		System.out.println(rtime);
		String type = request.getParameter("type");
		IComputerBiz computerBiz = new ComputerBizImpl();
		this.send(response, computerBiz.findPart(type, sumpriceMin, sumpriceMax, rtime));
	}

	private void findHardWare(HttpServletRequest request, HttpServletResponse response) {

		int id = Integer.parseInt(request.getParameter("id"));
		IHardwareBiz hardwareBiz  = new HardwareBizImpl();
		this.send(response, hardwareBiz.findHardWareById(id));
		
		
	}

	private void findById(HttpServletRequest request, HttpServletResponse response) {
		int id = Integer.parseInt(request.getParameter("id"));
		IComputerBiz computerBiz = new ComputerBizImpl();
		this.send(response, computerBiz.findById(id));
		
	}

	private void findAll(HttpServletRequest request, HttpServletResponse response) {
		String type = request.getParameter("type");
		IComputerBiz computerBiz = new ComputerBizImpl();
		this.send(response, computerBiz.findAll(type));
		
	}
}
