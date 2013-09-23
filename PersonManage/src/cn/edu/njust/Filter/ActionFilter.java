package cn.edu.njust.Filter;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import cn.edu.njust.Session.UserSession;

public class ActionFilter implements Filter {
	private FilterConfig filterConfig;      
	private HttpServletRequest request;  
	private HttpServletResponse response; 
	
	@Override
	public void destroy() {
		this.filterConfig=null;

	}

	@Override
	public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse,
			FilterChain chain) throws IOException, ServletException {

		this.request=(HttpServletRequest)servletRequest;
		this.response=(HttpServletResponse)servletResponse;		
		String url = request.getRequestURI();  
		// �˴���ȡ��urlΪ��login.jsp  
		url = url.substring(url.lastIndexOf("/") + 1, url.length());  
		try {  
			HttpSession session = request.getSession();   
			// ��ȡ�û���¼��֤��Ϣ  
			UserSession st = (UserSession) session.getAttribute("userSession");  
			if (noFileUrl(url)) {  
				// ����Ҫ�ж�Ȩ�޵��������¼ҳ�棬������  
				chain.doFilter(request, response);// ����ִ������  
			} else if (st == null) {  
				PrintWriter out=response.getWriter();
				out.println(" <script language='javascript'>alert('�㻹δ��¼,���ȵ�¼��'); " +
						"location.href='http://localhost:8080/PersonManage/login.jsp'</script>"); 
				//response.sendRedirect(accessPath + "/login.jsp");  
				// δ��¼��ʱ�����ص�½ҳ��  
			} else {  
				chain.doFilter(request, response);// ����ִ������  
				//verifyUrl(url, st);// �жϵ�ǰuser�Ƿ�ӵ�з��ʴ�url��Ȩ��  
			}  
		} catch (Exception sx) {  
			sx.printStackTrace();  
		}  
	}
	
	public void init(FilterConfig filterConfig) throws ServletException {  
		this.filterConfig = filterConfig;  
	}  
	protected boolean noFileUrl(String url) {  
		//����ҪȨ����֤��ҳ�涯����  
		String exclude = "loginAction.action";  
		//�ж�����ҳ���Ƿ�������ҳ��  
		if (exclude.indexOf(url) >= 0) {  
			return true;  
		}  
		return false;  
	}  
}
