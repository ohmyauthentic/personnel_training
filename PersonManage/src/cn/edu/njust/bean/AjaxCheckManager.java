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

public class AjaxCheckManager extends HttpServlet {
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

		this.userId = request.getParameter("userId").trim();
		if ("".equals(userId)) {
			out.println("<div class='reds' align='left'>用户名不能为空！</div>");
		} else if (userId.length() < 4 || userId.length() > 20) {
			out.println("<div class='reds' align='left'>用户名"
					+ userId + "不合法！(长度为4到20位，且不能使用?#=等特殊字符)</div>");
		} 
		else{
			ServletContext   servletContext=this.getServletContext();
			WebApplicationContext wac=WebApplicationContextUtils.getWebApplicationContext(servletContext); 
			UserinfoDAO   userinfoDAO=(UserinfoDAO)wac.getBean( "ManagerDAO");
			@SuppressWarnings("unchecked")
			List<Userinfo> list=userinfoDAO.findByUserId(userId);
			if(list==null||list.size()==0){
		      	out.println("您的用户名可用");	
			}
			else{
				out.println("该用户名"+userId+"已存在,请使用其他用户名！");
			}
		}
	}

}
