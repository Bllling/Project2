package servlet;

import java.io.IOException;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.jsp.JspFactory;
import javax.servlet.jsp.PageContext;
import javax.websocket.Session;

import biz.ICollectionBiz;
import biz.IUsrBiz;
import biz.impl.CollectionBizImpl;
import biz.impl.UsrBizImpl;
import entity.Usr;
import util.EmailSend;
import util.FileUploadUtil;


@WebServlet("/usr")
public class UsrServlet extends BasicServlet{
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("utf-8");
		resp.setCharacterEncoding("utf-8");
		String op = req.getParameter("op");
		System.out.println(op);
		if ("sendemail".equals(op)) {
			try {
				sendemail(req,resp);
			} catch (Exception e) {
				e.printStackTrace();
			}
		} else if ("register".equals(op)) {
			register(req,resp);
		} else if ("login".equals(op)) {
			login(req,resp);
		} else if ("update".equals(op)) {
			update(req,resp);
		} else if("collection".equals(op)){
			collection(req,resp);
		} else if("findByID".equals(op)){
			findByID(req,resp);
		} else if ("findByUsrName".equals(op)) {
			findByUsrName(req, resp);
		} else if ("findAllByID".equals(op)) {
			findAllByID(req, resp);
		} else if ("findAddrsById".equals(op)) {
			findAddrsById(req, resp);
		} else if ("updateUsrInfo".equals(op)) {
			updateUsrInfo(req, resp);
		} 

	}
	
	/**
	 * 用户信息修改
	 * @param req
	 * @param resp
	 */
	private void updateUsrInfo(HttpServletRequest req, HttpServletResponse resp) {
		String uid = req.getParameter("uid");
		System.out.println(uid);
		Map<String, String> map = fileUpload(req, resp);
		System.out.println(map);
		this.send(resp, -1);
	}

	
	
	/**
	 * 通过用户ID查询地址表 查找该用户的 所有地址
	 * @param req
	 * @param resp
	 */
	private void findAddrsById(HttpServletRequest req, HttpServletResponse resp) {
		int uid = Integer.parseInt(req.getParameter("uid"));
		IUsrBiz usrBiz = new UsrBizImpl();
		this.send(resp, usrBiz.findAddrsById(uid));
	}

	/**
	 * 通过ID在用户表查询所有
	 * @param req
	 * @param resp
	 */
	private void findAllByID(HttpServletRequest req, HttpServletResponse resp) {
		int uid = Integer.parseInt(req.getParameter("uid"));
		IUsrBiz usrBiz = new UsrBizImpl();
		this.send(resp, usrBiz.findAllByID(uid));
		
	}

	/**
	 * 通过用户名查询，检查是否用户名已经被使用
	 * @param req
	 * @param resp
	 */
	private void findByUsrName(HttpServletRequest req, HttpServletResponse resp) {
		String uname = req.getParameter("usrName");
		IUsrBiz usrBiz = new UsrBizImpl();
		this.send(resp, usrBiz.findByName(uname));
	}
	
	/**
	 *  在收藏夹表中根据用户ID查找配置单号
	 * @param req
	 * @param resp
	 */

	private void findByID(HttpServletRequest req, HttpServletResponse resp) {
		int uid = Integer.parseInt(req.getParameter("uid"));
		System.out.println(uid);
		ICollectionBiz collectionBiz = new CollectionBizImpl();
		this.send(resp, collectionBiz.findByID(uid));
		
		
	}

	/**
	 * 用户收藏
	 * @param req
	 * @param resp
	 */
	private void collection(HttpServletRequest req, HttpServletResponse resp) {
		int id = Integer.parseInt(req.getParameter("id"));
		int uid = Integer.parseInt(req.getParameter("uid"));
		ICollectionBiz collectionBiz = new CollectionBizImpl();
		this.send(resp, collectionBiz.add(id, uid));
	}

	private void update(HttpServletRequest req, HttpServletResponse resp) {
		String pwd=req.getParameter("upwd");
		String uemail=req.getParameter("email");
		IUsrBiz usrBiz = new UsrBizImpl();
		this.send(resp, usrBiz.updatepwd(pwd, uemail));
		
	}

	private void login(HttpServletRequest req, HttpServletResponse resp) {
		// TODO 用户登录
		String uname = req.getParameter("uname");
		String upwd = req.getParameter("upwd");
		IUsrBiz usrBiz = new UsrBizImpl();
		int result = -1;
		Usr usr=usrBiz.login(uname, upwd);
		if(usr !=null){
			req.getSession().setAttribute("currentAdmin", usr);
			req.getSession().setMaxInactiveInterval(10);
	
			result = 1;
		}else{
			result=0;
		}
        this.send(resp, result);
	}

	private void register(HttpServletRequest req, HttpServletResponse resp) {
		// TODO 用户注册
		String uname=req.getParameter("uname");
		String upwd=req.getParameter("upwd");
		String uemail=req.getParameter("uemail");
		String utel=req.getParameter("utel");
		IUsrBiz usrBiz = new UsrBizImpl();
		this.send(resp, usrBiz.register(uname, upwd, uemail, utel, null));
		
	}

	private void sendemail(HttpServletRequest req, HttpServletResponse resp) throws Exception  {
		String email=req.getParameter("email");
		EmailSend emailSend = new EmailSend(email);
		emailSend.send();
		this.send(resp, emailSend.getCoding());
	}
	
	//数据保存到map
	private Map<String, String> fileUpload(HttpServletRequest request, HttpServletResponse response) {
		FileUploadUtil fuu = new FileUploadUtil();
		PageContext pagecontext = JspFactory.getDefaultFactory().getPageContext(this, request, response, null, true, 8192, true);
		Map<String, String> map = fuu.upload(pagecontext);
		return map;
	}
}
