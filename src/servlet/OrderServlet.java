package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import biz.IOrderBiz;
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
		}
	}

	//修改订单状态
	private void updateOrder(HttpServletRequest request, HttpServletResponse response) {
		int state = Integer.parseInt(request.getParameter("state"));
		int rorderid = Integer.parseInt(request.getParameter("rorderid"));
		IOrderBiz orderBiz = new OrderBizImpl();
		this.send(response, orderBiz.updateOrderState(rorderid, state));
	}

	private void addOrder(HttpServletRequest request, HttpServletResponse response) {
		IOrderBiz orderBiz = new OrderBizImpl();
		String rorderid=request.getParameter("rorderid");
        Integer id=Integer.parseInt(request.getParameter("id"));
        Integer uid=Integer.parseInt(request.getParameter("uid"));
        Integer state=Integer.parseInt(request.getParameter("state"));
        Double total=Double.parseDouble(request.getParameter("state"));
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
		IOrderBiz orderBiz = new OrderBizImpl();
		if ("noCondition".equals(type)) {
			this.send(response, orderBiz.findOrderInfo(uid, null, type));
		} else {
			this.send(response, orderBiz.findOrderInfo(uid, condition, type));
		}
		
	}

}
