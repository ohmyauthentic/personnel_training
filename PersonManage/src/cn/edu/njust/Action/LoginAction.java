package cn.edu.njust.Action;

import cn.edu.njust.Service.LoginService;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport {	
	private String userName;
	private String password;
	private int logintype;
	private LoginService loginService;	
	public int getLogintype() {
		return logintype;
	}

	public void setLogintype(int logintype) {
		this.logintype = logintype;
	}
	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}	
	
	public LoginService getLoginService() {
		return loginService;
	}

	public void setLoginService(LoginService loginService) {
		this.loginService = loginService;
	}
    public String execute() throws Exception{
    	int flag=loginService.loginCheck(getUserName(), getPassword(),getLogintype());
    	if (flag==2) {
    		return "userinfo";
    	} 
    	else if(flag==1){
    		return "manage";    		
    	}
    	else{
    		System.out.println("用户名或密码不正确");
    		ActionContext actionContext=ActionContext.getContext();
    		actionContext.put("tip", "用户名或密码不正确!");
    		return LOGIN;
    	}
    }
}
