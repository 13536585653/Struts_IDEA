package org.action;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.ServletActionContext;

import java.io.*;

/**
 * Created by langye on 2017/2/10.
 */
public class DownloadAction extends ActionSupport {
	//要下载的文件名
private String fileName;

public String getFileName() {
	//解决下载文件时中文名出现乱码

	try {
		fileName = new String(fileName.getBytes("utf-8"),
				"ISO8859-1");
	} catch (UnsupportedEncodingException e) {
		e.printStackTrace();
	}
	return fileName;
}

public void setFileName(String fileName) {
	this.fileName = fileName;
}
//我们需要提供一个方法，这个方法是一个标准的get方法，如getXxx
//并通过这个方法创建并创建并返回一个InputStream给struts
//struts就会根据这个输入流读取文件，并写会给客户端
public InputStream getInputStream() throws FileNotFoundException {
	//获取文件上传的目录
	String uploadPath = ServletActionContext.getServletContext().getRealPath("/files");
	//根据路径结合提交过来的文件名，创建一个file对象
	File file = new File(uploadPath,fileName);
	//创建inputSteam对象
	BufferedInputStream inputStream = new BufferedInputStream(new FileInputStream(file));
	//返回这个输入流给struts
	return inputStream;
}


//下载的方法
public String download(){
	return "success";
}
}
