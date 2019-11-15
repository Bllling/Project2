package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import biz.IHardwareBiz;
import biz.impl.HardwareBizImpl;
import dao.IHardwareDao;
import dao.impl.HardwareDaoImpl;
import entity.Box;
import entity.Cpu;
import entity.Disk;
import entity.Graphics;
import entity.Memory;
import entity.MotherBoard;
import entity.Source;

@WebServlet("/hardwareinfo")
public class HardWareInfo extends BasicServlet {
	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String op = request.getParameter("op");
		if ("findCpuByPage".equals(op)) {   //分页查询数据
			findCpuByPage(request, response);
		} else if ("findMotherBoardByPage".equals(op)) {
			findMotherBoardByPage(request, response);
		} else if ("findMemoryByPage".equals(op)) {
			findMemoryByPage(request, response);
		} else if ("finddiskByPage".equals(op)) {
			finddiskByPage(request, response);
		} else if ("findSourceByPage".equals(op)) {
			findSourceByPage(request, response);
		} else if ("findGraphicsByPage".equals(op)) {
			findGraphicsByPage(request, response);
		} else if ("findBoxByPage".equals(op)) {
			findBoxByPage(request, response);
		} else if ("findCPUInfo".equals(op)) {   //查询详细信息
			findCPUInfo(request, response); 
		} else if ("findMotherBoardInfo".equals(op)) {
			findMotherBoardInfo(request, response);
		} else if ("findMemoryInfo".equals(op)) {
			findMemoryInfo(request, response);
		} else if ("findDiskInfo".equals(op)) {
			findDiskInfo(request, response);
		} else if ("findSourceInfo".equals(op)) {
			findSourceInfo(request, response);
		} else if ("findGraphicsInfo".equals(op)) {
			findGraphicsInfo(request, response);
		} else if ("findBoxInfo".equals(op)) {
			findBoxInfo(request, response);
		} else if ("delCpu".equals(op)) {
			delCpu(request, response);  //删除cpu
		} else if ("delMotherBoard".equals(op)) {
			delMotherBoard(request, response);
		} else if ("delMemory".equals(op)) {
			delMemory(request, response);
		} else if ("delDisk".equals(op)) {
			delDisk(request, response);
		} else if ("delSource".equals(op)) {
			delSource(request, response);
		} else if ("delGraphics".equals(op)) {
			delGraphics(request, response);
		} else if ("delBox".equals(op)) {
			delBox(request, response);
		}
	}
	
	//删除机箱
	private void delBox(HttpServletRequest request, HttpServletResponse response) {
		int id = Integer.parseInt(request.getParameter("id"));
		IHardwareBiz hardwareBiz = new HardwareBizImpl();
		this.send(response, hardwareBiz.delHardWare(id, "boxid", "box"));
	}

	//删除显卡
	private void delGraphics(HttpServletRequest request, HttpServletResponse response) {
		int id = Integer.parseInt(request.getParameter("id"));
		IHardwareBiz hardwareBiz = new HardwareBizImpl();
		this.send(response, hardwareBiz.delHardWare(id, "graphicsid", "graphics"));
	}

	//删除电源
	private void delSource(HttpServletRequest request, HttpServletResponse response) {
		int id = Integer.parseInt(request.getParameter("id"));
		IHardwareBiz hardwareBiz = new HardwareBizImpl();
		this.send(response, hardwareBiz.delHardWare(id, "sourceid", "source"));
	}

	//删除硬盘
	private void delDisk(HttpServletRequest request, HttpServletResponse response) {
		int id = Integer.parseInt(request.getParameter("id"));
		IHardwareBiz hardwareBiz = new HardwareBizImpl();
		this.send(response, hardwareBiz.delHardWare(id, "diskid", "disk"));
	}

	//删除内存
	private void delMemory(HttpServletRequest request, HttpServletResponse response) {
		int id = Integer.parseInt(request.getParameter("id"));
		IHardwareBiz hardwareBiz = new HardwareBizImpl();
		this.send(response, hardwareBiz.delHardWare(id, "memoryid", "memory"));
	}

	//删除主板
	private void delMotherBoard(HttpServletRequest request, HttpServletResponse response) {
		int id = Integer.parseInt(request.getParameter("id"));
		IHardwareBiz hardwareBiz = new HardwareBizImpl();
		this.send(response, hardwareBiz.delHardWare(id, "motherboardid", "motherboard"));
	}

	//删除cpu
	private void delCpu(HttpServletRequest request, HttpServletResponse response) {
		int id = Integer.parseInt(request.getParameter("id"));
		IHardwareBiz hardwareBiz = new HardwareBizImpl();
		this.send(response, hardwareBiz.delHardWare(id, "cpuid", "cpu"));
	}

	//查询机箱的详细信息
	private void findBoxInfo(HttpServletRequest request, HttpServletResponse response) {
		int id = Integer.parseInt(request.getParameter("id"));
		IHardwareBiz hardwareBiz = new HardwareBizImpl();
		this.send(response, hardwareBiz.findBox(id));
	}

	//查询显卡的详细信息
	private void findGraphicsInfo(HttpServletRequest request, HttpServletResponse response) {
		int id = Integer.parseInt(request.getParameter("id"));
		IHardwareBiz hardwareBiz = new HardwareBizImpl();
		this.send(response, hardwareBiz.findGraphics(id));
	}

	//查询电源的详细信息
	private void findSourceInfo(HttpServletRequest request, HttpServletResponse response) {
		int id = Integer.parseInt(request.getParameter("id"));
		IHardwareBiz hardwareBiz = new HardwareBizImpl();
		this.send(response, hardwareBiz.findSource(id));
	}

	//查询硬盘的详细信息
	private void findDiskInfo(HttpServletRequest request, HttpServletResponse response) {
		int id = Integer.parseInt(request.getParameter("id"));
		IHardwareBiz hardwareBiz = new HardwareBizImpl();
		this.send(response, hardwareBiz.findDisk(id));
	}

	//查询内存的详细信息
	private void findMemoryInfo(HttpServletRequest request, HttpServletResponse response) {
		int id = Integer.parseInt(request.getParameter("id"));
		IHardwareBiz hardwareBiz = new HardwareBizImpl();
		this.send(response, hardwareBiz.findMemory(id));
	}

	//查询主板的详细信息
	private void findMotherBoardInfo(HttpServletRequest request, HttpServletResponse response) {
		int id = Integer.parseInt(request.getParameter("id"));
		IHardwareBiz hardwareBiz = new HardwareBizImpl();
		this.send(response, hardwareBiz.findMotherboard(id));
	}

	//查询CPU的详细信息
	private void findCPUInfo(HttpServletRequest request, HttpServletResponse response) {
		int id = Integer.parseInt(request.getParameter("id"));
		IHardwareBiz hardwareBiz = new HardwareBizImpl();
		this.send(response, hardwareBiz.findCPU(id));
	}

	private void findBoxByPage(HttpServletRequest request, HttpServletResponse response) {
		findByPage(request, response, "boxid", "boxprice", "box", Box.class);
	}

	private void findGraphicsByPage(HttpServletRequest request, HttpServletResponse response) {
		findByPage(request, response, "graphicsid", "graphicsprice", "graphics", Graphics.class);
	}

	private void findSourceByPage(HttpServletRequest request, HttpServletResponse response) {
		findByPage(request, response, "sourceid", "sourceprice", "source", Source.class);
	}

	private void finddiskByPage(HttpServletRequest request, HttpServletResponse response) {
		findByPage(request, response, "diskid", "diskprice", "disk", Disk.class);
	}

	private void findMemoryByPage(HttpServletRequest request, HttpServletResponse response) {
		findByPage(request, response, "memoryid", "memoryprice", "memory", Memory.class);
	}

	private void findMotherBoardByPage(HttpServletRequest request, HttpServletResponse response) {
		findByPage(request, response, "motherboardid", "motherboardprice", "motherboard", MotherBoard.class);
	}

	private void findCpuByPage(HttpServletRequest request, HttpServletResponse response) {
		findByPage(request, response, "cpuid", "cpuprice", "cpu", Cpu.class);
	}
	
	private void findByPage (HttpServletRequest request, HttpServletResponse response, String id, String priceName, String formName, Class<?> c) {
		IHardwareBiz hardwareBiz = new HardwareBizImpl();
		int page = Integer.parseInt(request.getParameter("page"));
		int rows = Integer.parseInt(request.getParameter("rows"));
		this.send(response, hardwareBiz.findByPage(page, rows, id, formName, priceName, c));
	}
	

}
