package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import biz.IAddressBiz;
import biz.impl.AddressBizImpl;

@WebServlet("/address")
public class addressServlet extends BasicServlet{
	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String op = request.getParameter("op");
		if ("addAddress".equals(op)) {
			addAddress(request, response);
		} else if ("updateAddress".equals(op)) {
			updateAddress(request, response);
		} else if("findAllByUid".equals(op)){
			findAllByUid(request, response);
		} else if ("updateAddrState".equals(op)) {
			updateAddrState(request, response);
		}
	}
	private void updateAddrState(HttpServletRequest request, HttpServletResponse response) {
		int state = Integer.parseInt(request.getParameter("state"));
		int id = Integer.parseInt(request.getParameter("id"));
		String idName = request.getParameter("idName");
		IAddressBiz addressBiz = new AddressBizImpl();
		this.send(response, addressBiz.updateAddrState(state, id, idName));
		
	}
	/**
	 * 通过Uid 查找所有地址
	 * @param request
	 * @param response
	 */
	private void findAllByUid(HttpServletRequest request, HttpServletResponse response) {
		int uid = Integer.parseInt(request.getParameter("uid"));
		IAddressBiz addressBiz = new AddressBizImpl();
		this.send(response, addressBiz.findAllByUid(uid));
	}

	/**
	 * 修改地址信息
	 * @param request
	 * @param response
	 */
	private void updateAddress(HttpServletRequest request, HttpServletResponse response) {
		
		String province = request.getParameter("province");
		String city = request.getParameter("city");
		String county = request.getParameter("county");
		String raddress = request.getParameter("raddress");
		Integer isdefault = Integer.parseInt(request.getParameter("isDefault"));
		Integer arid = Integer.parseInt(request.getParameter("arid"));
		String addrname = request.getParameter("consigneeName");
		String addtel = request.getParameter("adPhone");
		String postcode = request.getParameter("p_num");
		if (postcode == null || postcode == "") {
			postcode = "000000";
		}
		IAddressBiz addressBiz = new AddressBizImpl();
		this.send(response, addressBiz.updateAddress(province, city, county, raddress, isdefault, arid, addrname, addtel, postcode));
		
	}

	/**
	 * 新增地址信息
	 * @param request
	 * @param response
	 */
	private void addAddress(HttpServletRequest request, HttpServletResponse response) {
		String province = request.getParameter("province");
		String city = request.getParameter("city");
		String county = request.getParameter("county");
		String raddress = request.getParameter("raddress");
		Integer isdefault = Integer.parseInt(request.getParameter("isDefault"));
		Integer uid = Integer.parseInt(request.getParameter("uid"));
		String addrname = request.getParameter("consigneeName");
		String addtel = request.getParameter("adPhone");
		String postcode = request.getParameter("p_num");
		if (postcode == null || postcode == "") {
			postcode = "000000";
		}
		IAddressBiz addressBiz = new AddressBizImpl();
		this.send(response, addressBiz.addAddress(province, city, county, raddress, isdefault, uid, addrname, addtel, postcode));
	}
}
