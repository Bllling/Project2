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
		}
	}

	/**
	 * 查询订单详细信息
	 * @param request
	 * @param response
	 */
	private void findOrderInfo(HttpServletRequest request, HttpServletResponse response) {
		IOrderBiz orderBiz = new OrderBizImpl();
		this.send(response, orderBiz.findOrderInfo());
	}

}
