package listener;

import java.io.File;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

import util.FileUploadUtil;


@WebListener
public class InitListener implements ServletContextListener {
	private String path = "files";
	
	@Override
	public void contextDestroyed(ServletContextEvent arg0) {
		
	}

	@Override
	public void contextInitialized(ServletContextEvent arg0) {
		ServletContext sc = arg0.getServletContext();
		String temp = sc.getInitParameter("uploadPic");
		if (temp != null && !"".equals(temp)) {
			path = temp;
		}
		
		//判断这个路径是否存在
		String basepath = sc.getRealPath("/");  //当前项目在服务器的绝对路径
		File fl = new File(new File(basepath).getParentFile(), path);
		if (!fl.exists()) {
			fl.mkdir();
		}
		
		FileUploadUtil.PICPATH = "../" + path;
	}

}
