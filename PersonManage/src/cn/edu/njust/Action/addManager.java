package cn.edu.njust.Action;
import com.opensymphony.xwork2.ActionSupport;

import cn.edu.njust.DAO.*;
import cn.edu.njust.PO.*;
import cn.edu.njust.Service.ManageOperate;
public class addManager extends ActionSupport{
	
	private String user_id;
	private String userName;
	private int   academy;
	private ManageOperate manageOperate;	
	
	public String getUser_id() {
		return user_id;
	}
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public int getAcademy() {
		return academy;
	}
	public void setAcademy(int academy) {
		this.academy = academy;
	}
	public ManageOperate getManageOperate() {
		return manageOperate;
	}
	public void setManageOperate(ManageOperate manageOperate) {
		this.manageOperate = manageOperate;
	}
	public void validate(){
		if(getUser_id()==null||getUser_id().trim().equals("")){
			this.addFieldError(user_id, "用户名不能为空");
		}
		if(getUserName()==null||getUserName().trim().equals("")){
			this.addFieldError(userName, "姓名不能为空");
		}
	}
	public String execute() throws Exception{
		manageOperate.AddManager(getUser_id(), getUserName(), getAcademy());
		return SUCCESS;
	}
}
