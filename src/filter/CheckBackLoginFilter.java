package filter;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebFilter("/back/manager/*")
public class CheckBackLoginFilter implements Filter{

	@Override
	public void destroy() {
		
	}

	@Override
	public void doFilter(ServletRequest arg0, ServletResponse arg1, FilterChain arg2) throws IOException, ServletException {
		HttpServletRequest request = (HttpServletRequest) arg0;
		HttpServletResponse response = (HttpServletResponse) arg1;
		
		//判断用户是否登录， 如果登录了 ，则session中会有当前登录用户的信息
		if (request.getSession().getAttribute("admin") == null) {
			//说明没有登录  则直接返回
			response.setContentType("text/html;charset=utf-8");
			//提示用户登录
			PrintWriter out = response.getWriter();
			out.print("<script>alert('请先登录...');location.href='"+ request.getContextPath() +"/back/back-login-page.html';</script>");
			out.flush();
			return;
		}
		
		//否则说明登录成功， 登录成功则交给下一个过滤器
		arg2.doFilter(request, response);
	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		
	}

}
