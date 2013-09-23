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
    <title>用户管理</title>    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<link href="bootstrap-datetimepicker-master/sample/bootstrap/css/bootstrap.min.css" rel="stylesheet" media="screen">
	<link rel="stylesheet" type="text/css" href="css/xxgl_form.css" media="screen" />
	<link type="text/css" href="css/xxgl_style.css" rel="stylesheet" media="screen">
	<link href="css/tableList.css" rel="stylesheet" media="screen">
  </head>
  
  <body>
	<div class="xxgl-z-rq" id="rqdiv">	
		<br><br><br><br>
		<center><h1>用户列表</h1></center>
		<br><br>
		<table class="table table-bordered">
			<tr >
			    <th>选中</th>
				<th >用户名</th>
				<th>用户姓名</th>
				<th>部门</th>
				<th>类型</th>
				<th>学院</th>
			</tr>
			<s:iterator value="pageBean.list" status="st">
				<tr <s:if test="#st.odd"> class="warning"</s:if> <s:else> class="info"</s:else>>
					<td><input style="width: 20;" type="checkbox" name="choice" value="<s:property value="userId" />"></td>
					<td><s:property value="userId" /></td>
					<td><s:property value="name" /></td>
					<td><s:property value="dep" /></td>
					<td><s:property value="type" />
					</td>
					<td><s:property value="academy.name" /></td>
				</tr>
			</s:iterator>
		</table>
		<center>
		 共<s:property value="pageBean.allRow" />	条记录
		 共<s:property value="pageBean.totalPage"/>页 
		 当前第<s:property value="pageBean.currentPage" />页<br /><br>
		<s:if test="%{pageBean.currentPage == 1}">  第一页 上一页   </s:if>
		<s:else>
			<a href="userlist.action?page=1">第一页</a>
			<a href="userlist.action?page=<s:property value="%{pageBean.currentPage-1}"/> ">上一页</a>
		</s:else>
		<s:if test="%{pageBean.currentPage != pageBean.totalPage}">
			<a href="userlist.action?page=<s:property value="%{pageBean.currentPage+1}"/> ">下一页</a>
			<a href="userlist.action?page=<s:property value="pageBean.totalPage"/> ">最后一页</a>
		</s:if>
		<s:else> 下一页  最后一页  </s:else>
      </center>
   </div>   
</body>
</html>
