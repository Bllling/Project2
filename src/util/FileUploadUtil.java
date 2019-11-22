package util;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Collection;
import java.util.Date;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.jsp.PageContext;

import com.jspsmart.upload.File;
import com.jspsmart.upload.Files;
import com.jspsmart.upload.Request;
import com.jspsmart.upload.SmartUpload;
import com.jspsmart.upload.SmartUploadException;

@SuppressWarnings("unchecked")
public class FileUploadUtil {
	public static String PICPATH = "pics";
	private static final String DENIED = "exe,bat,jsp,html";  //不许上传文件的后缀
	private static final int SINGLEFILESIZE = 1024*1024*10;   //单个文件最大大小
	private static final int TOTALMAXSIZE = 1024*1024*100;    //每次上传的文件最大总大小
	
	public Map<String, String> upload(PageContext pagecontext) {
		Map<String, String> map = new HashMap<String, String>();
		
		//实例化一个SmartUpload对象
		SmartUpload su = new SmartUpload();
		
		try {
			//初始化
			su.initialize(pagecontext);
			
			//设置参数
			su.setCharset("utf-8");
			su.setDeniedFilesList(DENIED);  //不允许上传的文件后缀
			su.setTotalMaxFileSize(TOTALMAXSIZE);
			su.setMaxFileSize(SINGLEFILESIZE);
			
			//开始上传
			su.upload();
			
			//获取请求中的参数
			Request request = su.getRequest();
			
			//取出请求中的所有非文本域参数
			Enumeration<String> enms = request.getParameterNames();
			String name = null;
			
			while(enms.hasMoreElements()) {
				name = enms.nextElement();
				map.put(name, request.getParameter(name));
			}
			
			
			//处理请求中的文件
			Files files = su.getFiles();
			if (files == null || files.getCount() <= 0) {
				System.out.println("没有文件");
				return map;
			}
			
			String fieldName = null;  //上传时的文本域的name属性的属性值
			String fileName = null;
			String preName = null;
			String pathStr = "";
			String temp = PICPATH;
			
			// 取出当前项目在服务器中的绝对路径
			String basePath = pagecontext.getServletContext().getRealPath("/");
			System.out.println(basePath);
			
			Collection<File> fls = files.getCollection();
			for (File fl : fls) {
				if (!fl.isMissing()) {  //文件没有丢失
					fileName = new Date().getTime() + "_" + fl.getFileName();  //取出上传的文件的文件名
					fieldName = fl.getFieldName();    // pics   video
					
					if (preName == null || preName.equals(fieldName)) {
						preName = fieldName;  //preName = pics
					} else {  //说明第一个文件域中的内容已经读取完成
						map.put(preName, pathStr);
						preName = fieldName;
						pathStr = "";
					}
					
					System.out.println(basePath + "" + temp + "\\" + fileName);
					//将图片保存到服务器
					fl.saveAs(basePath + "" + temp + "\\" + fileName); 
					if (!"".equals(pathStr)) {
						pathStr += ";";
					}
					pathStr += temp + "/" + fileName;
				}
			}
			map.put(preName, pathStr);
			
		} catch (ServletException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (SmartUploadException e) {
			e.printStackTrace();
		}
		return map;
	}
}
