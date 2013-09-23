<%@ page language="java" import="java.util.*" pageEncoding="GBK"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ page import="cn.edu.njust.Session.UserSession" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
   <title><s:text name="登录成功页面"></s:text></title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
    <style type="text/css">
        #menu{ width:300px;}
        .has_children{ background:#555;color:#fff;cursor:pointer;}
        .highlight{ color:#fff;background:green;}
        div{padding:0;margin:10px 0;}
        div a{background:#888;display:none;float:left;width:300px;}
    </style>
    <script src="js/jquery-1.3.1.js" type="text/javascript">
    </script>
  </head>
  
  <body>
	<center>
		<h2>欢迎登陆</h2>
	</center>
	<% UserSession userSession=(UserSession) session.getAttribute("userSession");
	   if(userSession!=null&&userSession.getPoewer()==1){
     %>
               当前用户是超级用户，<s:a href="super/modify.jsp">超级用户管理</s:a>
                <s:a href="amaList.action">系统用户管理</s:a>
    <%}else if(userSession!=null&&userSession.getPoewer()==2){%>
                当前用户是系统管理用户，<s:a href="amaList.action">系统用户管理</s:a>
    <%}else {%>
                 当前用户是普通用户，
    <%} %>
	<br> 当前登录用户：
	<s:property value="userName" />
	<br> 当前登录用户密码：
	<s:property value="password" />	
	<s:a href="adduser.jsp">系统管理员添加用户</s:a>
	<s:a href="smaList.action">超级管理员添加用户</s:a>
	<s:a href="ModifyPWD.jsp">修改登录密码</s:a>
	<a href="userlist.action?page=1">查看用户</a>
	<a href="managerlist.action?page=1">查看管理员</a>
	<br>
	<!--  <s:a href="list.action?page=1">查看用户</s:a>-->
	<s:a href="logoutAction.action">注销登录</s:a>
	<a href="ckeditor.jsp">CKEditor</a>
	<a href="AcPaper.jsp">年度科研成果申报</a>
	<a href="#">个人基本信息</a>
	<a href="#">学历信息</a>
	<a href="#">工作经历</a>
	<a href="#">兼职情况</a>
	<a href="#">学术荣誉</a>
	<br><br><br>
	<hr>
	<div id="menu">
	      <div class="has_children">
	          <span>人员信息管理</span>
	           <a href="MyJsp.jsp">基本信息</a>
	           <a href="">工作信息</a>
	           <a href="">兼职信息</a>
	           <a href="">学历信息</a>  
	           <a href="">学术荣誉</a>        
	      </div>
	       <div class="has_children">
	          <span>年度科研成果申报</span>
	          <a href="">添加</a>
	          <a href="">查看</a>       
	      </div>
	       <div class="has_children">
	          <span>修改密码</span>	      
	      </div>
	      <div class="has_children">
	         <span>注销登录</span>
	          <a href="logoutAction.action">注销</a>	      
	      </div>
	</div>
	<script type="text/javascript">
	   $(".has_children").click(function(){
		   $(this).addClass("highlight").children("a").show().end().siblings().removeClass("highlight").children("a").hide();
	   })
	</script>
</body>

</html>
