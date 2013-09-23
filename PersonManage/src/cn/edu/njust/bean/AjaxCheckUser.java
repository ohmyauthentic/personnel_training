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
import cn.edu.njust.DAO.UserinfoDAO;
import cn.edu.njust.PO.Userinfo;

public class AjaxCheckUser extends HttpServlet {

	private static final long serialVersionUID = 1L;	
	private String userId;

	protected void doGet(HttpServletRequest request,HttpServletResponse response)
			throws ServletException,IOException{
		doPost(request, response);		
	}
	protected void doPost(HttpServletRequest request,HttpServletResponse response)
			throws ServletException,IOException{
		request.setCharacterEncoding("GBK");
		response.setContentType("text/html;charset=GBK");
		PrintWriter out = response.getWriter();
		userId= request.getParameter("userId").trim();
		if ("".equals(userId)) {
			out.print("null");
		} else if (userId.length() < 5 || userId.length() > 20) {
			out.print("error");
		} 
		else{
			ServletContext   servletContext=this.getServletContext(); //request.getSession().getServletContext();
			WebApplicationContext wac=WebApplicationContextUtils.getWebApplicationContext(servletContext); 
			UserinfoDAO   userinfoDAO=(UserinfoDAO)wac.getBean( "UserinfoDAO");
			@SuppressWarnings("unchecked")
			List<Userinfo> list=userinfoDAO.findByUserId(userId);
			if(list==null||list.size()==0){
		      	out.print("success");	
			}
			else{
				out.print("exist");
			}
		}
	}

}
