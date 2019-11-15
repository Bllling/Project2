package servlet;

import java.io.IOException;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.jsp.JspFactory;
import javax.servlet.jsp.PageContext;


import biz.IHardwareBiz;
import biz.impl.HardwareBizImpl;
import util.FileUploadUtil;


@WebServlet("/hardware")
public class AddHardwareServlet extends BasicServlet{
	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String op = request.getParameter("op");
		if ("addCPU".equals(op)) {
			addCPU(request, response);
		} else if ("addDisk".equals(op)) {
			addDisk(request, response);
		} else if ("addBox".equals(op)) {
			addBox(request, response);
		} else if ("addGraphics".equals(op)) {
			addGraphics(request, response);
		} else if ("addMemory".equals(op)) {
			addMemory(request, response);
		} else if ("addMotherBoard".equals(op)) {
			addMotherBoard(request, response);
		} else if ("addSource".equals(op)) {
			addSource(request, response);
		}
	}
	
	//添加电源
	private void addSource(HttpServletRequest request, HttpServletResponse response) {
		Map<String, String> map = fileUpload(request, response);
		IHardwareBiz hardwareBiz = new HardwareBizImpl();
		this.send(response, hardwareBiz.addSource(map));
	}

	//添加主板
	private void addMotherBoard(HttpServletRequest request, HttpServletResponse response) {
		Map<String, String> map = fileUpload(request, response);
		IHardwareBiz hardwareBiz = new HardwareBizImpl();
		this.send(response, hardwareBiz.addMotherboard(map));
		
	}

	//添加内存
	private void addMemory(HttpServletRequest request, HttpServletResponse response) {
		Map<String, String> map = fileUpload(request, response);
		IHardwareBiz hardwareBiz = new HardwareBizImpl();
		this.send(response, hardwareBiz.addMemory(map));
		
	}

	//添加显卡
	private void addGraphics(HttpServletRequest request, HttpServletResponse response) {
		Map<String, String> map = fileUpload(request, response);
		IHardwareBiz hardwareBiz = new HardwareBizImpl();
		this.send(response, hardwareBiz.addGraphics(map));
		
	}

	//添加机箱
	private void addBox(HttpServletRequest request, HttpServletResponse response) {
		Map<String, String> map = fileUpload(request, response);
		IHardwareBiz hardwareBiz = new HardwareBizImpl();
		this.send(response, hardwareBiz.addBox(map));
		
	}

	//添加硬盘
	private void addDisk(HttpServletRequest request, HttpServletResponse response) {
		Map<String, String> map = fileUpload(request, response);
		IHardwareBiz hardwareBiz = new HardwareBizImpl();
		this.send(response, hardwareBiz.addDisk(map));
		
	}
	
	//添加CPU
	private void addCPU(HttpServletRequest request, HttpServletResponse response) {
		Map<String, String> map = fileUpload(request, response);
		IHardwareBiz hardwareBiz = new HardwareBizImpl();
		this.send(response, hardwareBiz.addCPU(map));
	}
	
	//数据保存到map
	private Map<String, String> fileUpload(HttpServletRequest request, HttpServletResponse response) {
		FileUploadUtil fuu = new FileUploadUtil();
		PageContext pagecontext = JspFactory.getDefaultFactory().getPageContext(this, request, response, null, true, 8192, true);
		Map<String, String> map = fuu.upload(pagecontext);
		return map;
	}
}
