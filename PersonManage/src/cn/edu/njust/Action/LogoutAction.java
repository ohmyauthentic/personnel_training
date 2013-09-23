package cn.edu.njust.Action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class LogoutAction extends ActionSupport {
	
	public String execute() throws Exception{
		ActionContext ac = ActionContext.getContext();
		ac.getSession().clear();
		return SUCCESS;
	}

}
