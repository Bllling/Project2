package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import biz.IOrderBiz;
import biz.IOrderDetailBiz;
import biz.impl.IOrderDetaiBizImpl;
import biz.impl.OrderBizImpl;

@WebServlet("/order")
public class OrderServlet extends BasicServlet {
	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String op = request.getParameter("op");
		
		if ("findOrderInfo".equals(op)) {
			findOrderInfo(request, response);
		}else if("addOrder".equals(op)){
			addOrder(request, response);
		}else if ("updateOrder".equals(op)) {
			updateOrder(request, response);
		}else if ("findOrderInfoByAdmin".equals(op)) {
			findOrderInfoByAdmin(request, response);
		}else if ("getTotal".equals(op)) {
			getTotal(request, response);
		}else if ("addDetail".equals(op)){
			addDetail(request, response);
		}else if ("findOrderDetailById".equals(op)) {
			findOrderDetailById(request, response);
		}
	}
	private void findOrderDetailById(HttpServletRequest request, HttpServletResponse response) {
		double rorderid = Double.parseDouble(request.getParameter("rorderid"));
		IOrderDetailBiz orderDetailBiz = new IOrderDetaiBizImpl();
		this.send(response, orderDetailBiz.findOrderDetailInfoByid(rorderid));
	}
	private void addDetail(HttpServletRequest request, HttpServletResponse response) {
		IOrderDetailBiz rBiz = new IOrderDetaiBizImpl();
		String rorderid=request.getParameter("rorderid");
		Integer arid = Integer.parseInt(request.getParameter("arid"));
		Double cpuprice=Double.parseDouble(request.getParameter("cpuprice"));
		Double motherboardprice=Double.parseDouble(request.getParameter("motherboardprice"));
		Double memoryprice=Double.parseDouble(request.getParameter("memoryprice"));
		Double diskprice=Double.parseDouble(request.getParameter("diskprice"));
		Double sourceprice=Double.parseDouble(request.getParameter("sourceprice"));
		Double graphicsprice=Double.parseDouble(request.getParameter("graphicsprice"));
		Double boxprice=Double.parseDouble(request.getParameter("boxprice"));
		this.send(response, rBiz.add(rorderid, arid, cpuprice, motherboardprice, memoryprice, diskprice, sourceprice, graphicsprice, boxprice));
		
	}
	private void getTotal(HttpServletRequest request, HttpServletResponse response) {
		int uid = Integer.parseInt(request.getParameter("uid"));
		String type = request.getParameter("type");
		String condition = request.getParameter("condition");
		IOrderBiz orderBiz = new OrderBizImpl();
		this.send(response, orderBiz.getTotal(uid, type, condition));
	}

	//管理员查询订单信息
	private void findOrderInfoByAdmin(HttpServletRequest request, HttpServletResponse response) {
		String type = request.getParameter("type");
		String condition = request.getParameter("condition");
		int page = Integer.parseInt(request.getParameter("page"));
		IOrderBiz orderBiz = new OrderBizImpl();
		this.send(response, orderBiz.findOrderInfoByAdmin(condition, type, page));
	}

	//修改订单状态
	private void updateOrder(HttpServletRequest request, HttpServletResponse response) {
		int state = Integer.parseInt(request.getParameter("state"));
		double rorderid = Double.parseDouble(request.getParameter("rorderid"));
		IOrderBiz orderBiz = new OrderBizImpl();
		this.send(response, orderBiz.updateOrderState(rorderid, state));
	}

	private void addOrder(HttpServletRequest request, HttpServletResponse response) {
		IOrderBiz orderBiz = new OrderBizImpl();
		String rorderid=request.getParameter("rorderid");
        Integer id=Integer.parseInt(request.getParameter("id"));
        Integer uid=Integer.parseInt(request.getParameter("uid"));
        Integer state=Integer.parseInt(request.getParameter("state"));
        Double total=Double.parseDouble(request.getParameter("total"));
		this.send(response, orderBiz.addOrder(rorderid, id, uid, state, total));
		
	}

	/**
	 * 查询订单信息
	 * @param request
	 * @param response
	 */
	private void findOrderInfo(HttpServletRequest request, HttpServletResponse response) {
		int uid = Integer.parseInt(request.getParameter("uid"));
		String type = request.getParameter("type");
		String condition = request.getParameter("condition");
		int page = Integer.parseInt(request.getParameter("page"));
		IOrderBiz orderBiz = new OrderBizImpl();
		if ("noCondition".equals(type)) {
			this.send(response, orderBiz.findOrderInfo(uid, null, type, page));
		} else {
			this.send(response, orderBiz.findOrderInfo(uid, condition, type, page));
		}
		
	}

}
