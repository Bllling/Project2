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
		}else if("findBnumber".equals(op)){
			findBnumber(request, response);
		}else if("findZnumber".equals(op)){
			findZnumber(request, response);
		}else if("getTotalByUid".equals(op)){
			getTotalByUid(request, response);
		}else if("isExist".equals(op)){
			isExist(request,response);
		}else if("findIdByCname".equals(op)){
			findIdByCname(request,response);
		}else if("add".equals(op)){
			add(request,response);
		}else if("findHardWardIdById".equals(op)){
			findHardWardIdById(request,response);
		}
		
		
		
		
	}

	private void findHardWardIdById(HttpServletRequest request, HttpServletResponse response) {
		int id = Integer.parseInt(request.getParameter("id"));
		IComputerBiz computerBiz = new ComputerBizImpl();
		this.send(response, computerBiz.findHardWardIdById(id));
		
	}

	private void add(HttpServletRequest request, HttpServletResponse response) {
		Integer id = Integer.parseInt(request.getParameter("id"));
		Integer uid = Integer.parseInt(request.getParameter("uid"));
		String cname = request.getParameter("cname");
		String detail = request.getParameter("detail");
		Integer cpuid = Integer.parseInt(request.getParameter("cpuid"));
		Integer motherboardid = Integer.parseInt(request.getParameter("motherboardid"));
		Integer memoryid = Integer.parseInt(request.getParameter("memoryid"));
		Integer diskid = Integer.parseInt(request.getParameter("diskid"));
		Integer sourceid = Integer.parseInt(request.getParameter("sourceid"));
		Integer graphicsid = Integer.parseInt(request.getParameter("graphicsid"));
		Integer boxid = Integer.parseInt(request.getParameter("boxid"));
		Double sumprice = Double.parseDouble(request.getParameter("sumprice"));
		IComputerBiz computerBiz = new ComputerBizImpl();
		this.send(response,computerBiz.add(id, uid, cname, detail, cpuid, motherboardid, memoryid, diskid, sourceid, graphicsid, boxid, sumprice));
	}

	private void isExist(HttpServletRequest request, HttpServletResponse response) {
		int id = Integer.parseInt(request.getParameter("id"));
		IComputerBiz computerBiz = new ComputerBizImpl();
		this.send(response, computerBiz.findID(null, id));
	}
	private void findIdByCname(HttpServletRequest request, HttpServletResponse response) {
		String cname = request.getParameter("cname");
		IComputerBiz computerBiz = new ComputerBizImpl();
		this.send(response, computerBiz.findID(cname, null));
	}

	private void getTotalByUid(HttpServletRequest request, HttpServletResponse response) {
		Integer uid = Integer.parseInt(request.getParameter("uid"));
		IComputerBiz computerBiz = new ComputerBizImpl();
		this.send(response, computerBiz.getTotalByUid(uid));
		
	}

	private void findZnumber(HttpServletRequest request, HttpServletResponse response) {
		Integer uid = Integer.parseInt(request.getParameter("uid"));
		IComputerBiz computerBiz = new ComputerBizImpl();
		this.send(response, computerBiz.getZnumebrByUid(uid));
		
	}

	private void findBnumber(HttpServletRequest request, HttpServletResponse response) {
		Integer uid = Integer.parseInt(request.getParameter("uid"));
		IComputerBiz computerBiz = new ComputerBizImpl();
		this.send(response, computerBiz.getBnumebrByUid(uid));
		
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
