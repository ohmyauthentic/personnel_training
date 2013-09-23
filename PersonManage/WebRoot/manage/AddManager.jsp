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
  </head>
  
  <body>
	<div class="xxgl-z-rq" id="rqdiv">
	        <br><br><br><br>
	        <center><h1>添加管理员</h1></center>
	        <br><br>
			<form action="addManager.action" method="post">
				<div class="shuru-group">
					<label for="old_password" class="shuru-label">用户名：</label>
					<div class="shurus shurus-block">
						<input name="user_id" type="text"/>
						<span class="help-block">Please Input Your UserID!</span>
					</div>
				</div>	
				<div class="shuru-group">
					<label for="new_password" class="shuru-label">姓名:</label>
					<div class="shurus shurus-block">
						<input name="userName" type="text"/> 
						<span class="help-block">Please Input Your Name!</span>
					</div>
				</div>	
				<div class="shuru-group">
					<label for="new2_password" class="shuru-label">学院:</label>
					<div class="shurus shurus-block">
					   <select style="width:210px;margin-left:0px" name="academy">
						    <option value="-1" style="color:#c2c2c2;">------请选择学院------</option>
						    <s:iterator value="academyList">
							   <option value="<s:property value="acaid"/>">
								    <s:property value="name" />
							   </option>
						    </s:iterator>
					   </select> 
					   <span class="help-block">Please Select Your Academy!</span>
					</div>
				</div>	
				<div class="shuru-group">
				    <div class="shurus shurus-block">
				       <input value="保      存" type="submit" border="0" />
				       <input value="重     置" type="reset" border="0" style="margin-left:90px"/>
				    </div>
				</div>
			</form>
		</div>
  </body>
</html>
