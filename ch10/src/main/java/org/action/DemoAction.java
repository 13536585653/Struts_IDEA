package org.action;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.commons.io.FileUtils;
import org.apache.struts2.ServletActionContext;

import java.io.File;
import java.io.IOException;

/**
 * Created by langye on 2017/2/9.
 * 文件上传实例
 */
public class DemoAction extends ActionSupport {
	//1.
	//表单文本数据
	private String readme;
	//表单文件
	private File uploadFile;
	//上传的文件名，格式必须是File名称加上FileName
	private String uploadFileFileName;
	//上传的文件类型，格式必须是File名称+ContentType
	private String uploadFileContentType;

	//显示上传成功的字符串
	private String message;

public String getMessage() {
	return message;
}

public void setMessage(String message) {
	this.message = message;
}

public String getReadme() {
	return readme;
}

public void setReadme(String readme) {
	this.readme = readme;
}

public File getUploadFile() {
	return uploadFile;
}

public void setUploadFile(File uploadFile) {
	this.uploadFile = uploadFile;
}

public String getUploadFileFileName() {
	return uploadFileFileName;
}

public void setUploadFileFileName(String uploadFileFileName) {
	this.uploadFileFileName = uploadFileFileName;
}

public String getUploadFileContentType() {
	return uploadFileContentType;
}

public void setUploadFileContentType(String uploadFileContentType) {
	this.uploadFileContentType = uploadFileContentType;
}


//上传
public String upload() throws IOException {
	//2.
	//获取上传绝对路径
	String uploadPath = ServletActionContext.getServletContext().getRealPath("/files");
	//3.
	//如果提交过来的File不为null，才执行上传操作
	if(uploadFile != null){
		System.out.println("上传文件文件名："+uploadFileFileName);
		System.out.println("上传文件类型："+uploadFileContentType);
		//根据文件名以及上传的路径构建一个新的File对象
		File saveFile = new File(uploadPath,uploadFileFileName);
		//先判断上传的目录是否存在，如果不存在则创建出来
		if(!saveFile.getParentFile().exists()){
			saveFile.getParentFile().mkdirs();
		}
		//使用文件复制执行上传
		FileUtils.copyFile(uploadFile,saveFile);
		//提示成功信息
		message =  "上传成功！";
	}
		return "success";
	}
}
