package cn.edu.njust.Service;

import com.opensymphony.xwork2.ActionContext;

public class LogoutService {
	
	public boolean Logout(){
		ActionContext ac = ActionContext.getContext();
		if (ac.getSession().get("userSession") != null) {
			ac.getSession().put("userSession", null);
			return true;
		} else
			return false;
	}
}
