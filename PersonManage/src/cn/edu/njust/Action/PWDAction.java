package cn.edu.njust.Action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import cn.edu.njust.Service.ModifyPWD;
import cn.edu.njust.Session.UserSession;

public class PWDAction extends ActionSupport{
	private String new_password;	
	private ModifyPWD modifyPWD;
	
	public String getNew_password() {
		return new_password;
	}
	public void setNew_password(String new_password) {
		this.new_password = new_password;
	}
	public ModifyPWD getModifyPWD() {
		return modifyPWD;
	}
	public void setModifyPWD(ModifyPWD modifyPWD) {
		this.modifyPWD = modifyPWD;
	}
	public String  execute() throws Exception{
		UserSession userSession=(UserSession) ActionContext.getContext().getSession().get("userSession");
		String userId=userSession.getUserID();
		int power=userSession.getPoewer();
		System.out.println(new_password);
		modifyPWD.Modify(userId, new_password, power);
		ActionContext.getContext().put("tip", "201");
		return SUCCESS;
	}

}
