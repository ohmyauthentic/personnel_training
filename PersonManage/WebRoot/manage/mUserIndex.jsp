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
    <title>�û�����</title>    
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
		<center><h1>�û��б�</h1></center>
		<br><br>
		<table class="table table-bordered">
			<tr >
			    <th>ѡ��</th>
				<th >�û���</th>
				<th>�û�����</th>
				<th>����</th>
				<th>����</th>
				<th>ѧԺ</th>
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
		 ��<s:property value="pageBean.allRow" />	����¼
		 ��<s:property value="pageBean.totalPage"/>ҳ 
		 ��ǰ��<s:property value="pageBean.currentPage" />ҳ<br /><br>
		<s:if test="%{pageBean.currentPage == 1}">  ��һҳ ��һҳ   </s:if>
		<s:else>
			<a href="userlist.action?page=1">��һҳ</a>
			<a href="userlist.action?page=<s:property value="%{pageBean.currentPage-1}"/> ">��һҳ</a>
		</s:else>
		<s:if test="%{pageBean.currentPage != pageBean.totalPage}">
			<a href="userlist.action?page=<s:property value="%{pageBean.currentPage+1}"/> ">��һҳ</a>
			<a href="userlist.action?page=<s:property value="pageBean.totalPage"/> ">���һҳ</a>
		</s:if>
		<s:else> ��һҳ  ���һҳ  </s:else>
      </center>
   </div>   
</body>
</html>
