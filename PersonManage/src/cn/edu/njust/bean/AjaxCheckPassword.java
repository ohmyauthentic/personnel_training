package cn.edu.njust.bean;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;
import com.opensymphony.xwork2.ActionContext;
import com.sun.org.apache.bcel.internal.generic.AALOAD;

import cn.edu.njust.DAO.ManagerDAO;
import cn.edu.njust.DAO.SupuserDAO;
import cn.edu.njust.DAO.UserinfoDAO;
import cn.edu.njust.PO.Manager;
import cn.edu.njust.PO.Supuser;
import cn.edu.njust.PO.Userinfo;
import cn.edu.njust.Session.UserSession;
import cn.edu.njust.encrypt.MD5;

public class AjaxCheckPassword extends HttpServlet {
	private static final long serialVersionUID = 1L;	
	private String password;

	protected void doGet(HttpServletRequest request,HttpServletResponse response)
			throws ServletException,IOException{
		doPost(request, response);		
	}
	protected void doPost(HttpServletRequest request,HttpServletResponse response)
			throws ServletException,IOException{
		request.setCharacterEncoding("GBK");
		response.setContentType("text/html;charset=GBK");
		PrintWriter out = response.getWriter();

		password = request.getParameter("password").trim();
		if ("".equals(password)) {
			out.print("no");
		}
		else{
			ActionContext actionContext=ActionContext.getContext();
			UserSession userSession=(UserSession) actionContext.getSession().get("userSession");
			int power=userSession.getPoewer();
			String userID=userSession.getUserID();
			ServletContext   servletContext=this.getServletContext(); 	
			WebApplicationContext wac=WebApplicationContextUtils.getWebApplicationContext(servletContext);
			MD5 md5=new MD5();
			if(power==1){
				SupuserDAO supuserDAO=(SupuserDAO) wac.getBean("SupuserDAO");
				@SuppressWarnings("unchecked")
				List<Supuser> list=supuserDAO.findByUseId(userID);
				Supuser supuser=list.get(0);
				if(!md5.checkPWD(supuser.getPassword(),password)){
					out.print("no");
				}
				else {
					out.print("ok");
				}
			}
			else if(power==2){
				ManagerDAO  managerDAO=(ManagerDAO)wac.getBean("ManagerDAO");
				@SuppressWarnings("unchecked")
				List<Manager> list=managerDAO.findByUserId(userID);
				Manager manager=list.get(0);
				if(!md5.checkPWD(manager.getPassword(),password)){
					out.print("no");
				}
				else{
					out.print("ok");
				}
			}
			else{
				UserinfoDAO   userinfoDAO=(UserinfoDAO)wac.getBean("UserinfoDAO");
				@SuppressWarnings("unchecked")
				List<Userinfo> list=userinfoDAO.findByUserId(userID);
				Userinfo userinfo=list.get(0);
				if(!md5.checkPWD(userinfo.getPassword(),password)){
					out.print("no");
				}else {
					out.print("ok");
				}
			}
		}
	}
}
