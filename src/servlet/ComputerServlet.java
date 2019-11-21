package servlet;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import biz.ICollectionBiz;
import biz.IComputerBiz;
import biz.IHardwareBiz;
import biz.impl.CollectionBizImpl;
import biz.impl.ComputerBizImpl;
import biz.impl.HardwareBizImpl;
import entity.Collection;
import entity.Computer;


@WebServlet("/computer")
public class ComputerServlet extends BasicServlet{
private static final long serialVersionUID = 1L;
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String op = request.getParameter("op");
		System.out.println(op);
		if("findAll".equals(op)){
			findAll(request,response);
		}else if("findById".equals(op)){
			findById(request,response);
		}else if("findHardWare".equals(op)){
			findHardWare(request,response);
		}else if("findByPart".equals(op)){
			findByPart(request,response);
		}else if(("getTotalPart").equals(op)){
			getTotalPart(request,response);
		}else if("findByCollection".equals(op)){
			findByCollection(request,response);
		}else if("findByUid".equals(op)){
			findByUid(request,response);
		}else if("updateBnumber".equals(op)){
			updateBnumber(request,response);
		}else if ("findDetailByID".equals(op)) {
			findDetailByID(request, response);
		}
		
	}

	//通过配置单ID查配置单的描述信息
	private void findDetailByID(HttpServletRequest request, HttpServletResponse response) {
		Integer id = Integer.parseInt(request.getParameter("id"));
		IComputerBiz computerBiz = new ComputerBizImpl();
		this.send(response, computerBiz.findDetailByID(id));
	}

	private void updateBnumber(HttpServletRequest request, HttpServletResponse response) {
		Integer id = Integer.parseInt(request.getParameter("id"));
		IComputerBiz computerBiz = new ComputerBizImpl();
		this.send(response, computerBiz.updateBnumber(id));
		
	}

	private void findByCollection(HttpServletRequest request, HttpServletResponse response) {
		Integer uid = Integer.parseInt(request.getParameter("uid"));
		ICollectionBiz collectionBiz = new CollectionBizImpl();
		List<Collection> collection = collectionBiz.findsByID(uid);
		IComputerBiz computerBiz = new ComputerBizImpl();
		this.send(response, computerBiz.findAllByMoreId(collection));
		
	}

	private void findByUid(HttpServletRequest request, HttpServletResponse response) {
		Integer uid = Integer.parseInt(request.getParameter("uid"));
		IComputerBiz computerBiz = new ComputerBizImpl();
		this.send(response, computerBiz.findByUid(uid));
	}

	private void getTotalPart(HttpServletRequest request, HttpServletResponse response) {
		String sumpriceMin=request.getParameter("sumpriceMin");
		
		String sumpriceMax=request.getParameter("sumpriceMax");
		String rtime=request.getParameter("rtime");
		IComputerBiz computerBiz = new ComputerBizImpl();
		this.send(response, computerBiz.getTotalPart(sumpriceMin, sumpriceMax, rtime));
		
	}

	private void findByPart(HttpServletRequest request, HttpServletResponse response) {
		String sumpriceMin=request.getParameter("sumpriceMin");
		String sumpriceMax=request.getParameter("sumpriceMax");
		String rtime=request.getParameter("rtime");
		String type = request.getParameter("type");
		int page=Integer.parseInt(request.getParameter("page"));
		int rows=Integer.parseInt(request.getParameter("rows"));
		IComputerBiz computerBiz = new ComputerBizImpl();
		this.send(response, computerBiz.findPart(type, sumpriceMin, sumpriceMax, rtime,page,rows));
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
		System.out.println("11111");
		IComputerBiz computerBiz = new ComputerBizImpl();
		this.send(response, computerBiz.findAll(type));
		
	}
}
