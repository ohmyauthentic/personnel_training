<%@ page language="java" import="java.util.*" pageEncoding="GBK"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
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
        <center><h1>管理员列表</h1>	</center>
		<br><br>
		<table class="table table-bordered">
			<tr>
			    <th>选中</th>
				<th>用户名</th>
				<th>用户姓名</th>
				<th>学院</th>
			</tr>
			<s:iterator value="manBean.list" status="st">
				<tr <s:if test="#st.odd"> class="warning"</s:if>
					<s:else> class="info"</s:else>>
					<td><input  style="width: 20;" type="checkbox" name="choice"  value="<s:property value="MId"/>"></td>
					<td><s:property value="userId" />
					</td>
					<td><s:property value="name" />
					</td>
					<td><s:property value="academy.name" />
					</td>
				</tr>
			</s:iterator>
		</table>
		<div class="shuru-group">
				<div class="shurus shurus-block">
					<input value="删除" type="button" border="0" /> 
					<input value="修改" type="button" border="0" style="margin-left:90px" />
				</div>
		</div>
		
		<center>		
		共<s:property value="manBean.allRow" />条记录 
		共<s:property value="manBean.totalPage" />页 
		当前第	<s:property value="manBean.currentPage" />页<br /><br>
		<s:if test="%{manBean.currentPage == 1}">  第一页 上一页   </s:if>
		<s:else>
			<a href="managerlist.action?page=1">第一页</a>
			<a href="managerlist.action?page=<s:property value="%{manBean.currentPage-1}"/> ">上一页</a>
		</s:else>
		<s:if test="%{manBean.currentPage != manBean.totalPage}">
			<a href="managerlist.action?page=<s:property value="%{manBean.currentPage+1}"/> ">下一页</a>
			<a href="managerlist.action?page=<s:property value="manBean.totalPage"/> ">最后一页</a>
		</s:if>
		<s:else> 下一页  最后一页   </s:else>
		</center>
	</div>
</body>
</html>
