<%@ page language="java" import="java.util.*" pageEncoding="GBK"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ page import="cn.edu.njust.Session.UserSession" %>
<%@ taglib prefix="decorator" uri="http://www.opensymphony.com/sitemesh/decorator" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">    
    <title><decorator:title default="�û�������ҳ"></decorator:title></title>    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">	
	<link href="bootstrap-datetimepicker-master/sample/bootstrap/css/bootstrap.min.css" rel="stylesheet" media="screen">
	<link rel="stylesheet" type="text/css" href="css/xxgl_form.css" media="screen" />
	<link type="text/css" href="css/xxgl_style.css" rel="stylesheet" media="screen">	
	<decorator:head></decorator:head>
  </head>  
  <body>
   <aside id="sidebar">
	    <nav><a class="logo"  id="nav-logo"><span>�û�����<br><br></span>���ܵ���</a>
	      <ul>
	        <li class="active"><a href="manage/index.jsp">��&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;ҳ</a></li>
	        <% UserSession userSession=(UserSession) session.getAttribute("userSession");
	           if(userSession!=null&&userSession.getPoewer()==1){
             %>   
            <li><a id="nav_user">��ͨ�û�</a></li> 
		        <li class="pslia"><a class="psactive" href="userlist.action?page=1" style="color:#fff;">�û��б�</a></li>
		        <li class="pslia"><a class="psactive" href="smaList.action" >����û�</a></li>
		        <li class="pslia"><a class="psactive" href="manage/QueryUser.jsp" >��ѯ�û�</a></li>		        
	        <li><a id="nav_manager">ϵͳ����Ա</a></li>	 
	            <li class="psli"><a class="psactive" href="managerlist.action?page=1" style="color:#fff;">����Ա�б�</a></li>
		        <li class="psli"><a class="psactive" href="amaList.action" >��ӹ���Ա</a></li>
		        <li class="psli"><a class="psactive" href="manage/QueryManager.jsp" >��ѯ����Ա</a></li> 	              
	        <%} else{%>	  
	         <li><a href="userlist.action?page=1">�û�����</a></li> 
	        <%} %>      
	        <li><a href="manage/modifyPWD.jsp">�޸�����</a></li>
	        <li><a href="logoutAction.action">ע����¼</a></li>        
	      </ul>
	      <div class="bg_bottom"></div>
	    </nav>
	</aside>	
	
	   
	   <decorator:body></decorator:body>  
	   
	   
	<script type="text/javascript" src="bootstrap-datetimepicker-master/sample/jquery/jquery-1.8.3.min.js" charset="UTF-8"></script>
	<script type="text/javascript" src="js/jquery.js"></script>
	<script type="text/javascript">
	$(document).ready(function(){
		/*
	    $("a").click(function()
	    {
	    	$("li").filter(".active").removeClass("active"); 
	    	$("li").not(".psli").has(this).addClass("active");
	    	
	    });*/
	    $("#nav_user").click(function(){
	    	$(".psli").slideUp(800);
	    	$(".pslia").slideToggle(800);
	    });
	    $("#nav_manager").click(function(){
	    	$(".pslia").slideUp(800);
	    	$(".psli").slideToggle(800);
	    });
	    
	 });
	</script>
  </body>
 </html>