package cn.edu.njust.interceptor;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.swing.JOptionPane;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.interceptor.ServletRequestAware;
import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

public class CheckInterceptor extends AbstractInterceptor  {
	@Override
	public String intercept(ActionInvocation arg0) throws Exception {
		ActionContext actionContext=ActionContext.getContext();
			Map<?, ?> session=actionContext.getSession();
            HttpServletRequest request=ServletActionContext.getRequest();
			String url=request.getRequestURI();
			System.out.println(url);
			url = url.substring(url.lastIndexOf("/") + 1, url.length());
			System.out.println(url);
			if(url.equals("loginAction.action")){
				return arg0.invoke();
			}
			if(session.get("userSession")!=null){
				return arg0.invoke(); 
			}  
			else {
				actionContext.put("tip", "101");
				return Action.INPUT;
			}
	}
	
}


