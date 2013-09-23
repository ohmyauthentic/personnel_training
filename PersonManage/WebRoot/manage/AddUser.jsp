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
<link href="bootstrap-datetimepicker-master/sample/bootstrap/css/bootstrap.min.css"	rel="stylesheet" media="screen">
<link rel="stylesheet" type="text/css" href="css/xxgl_form.css" 	media="screen" />
<link type="text/css" href="css/xxgl_style.css" rel="stylesheet" 	media="screen">
<script src="js/AjaxCheckUser.js" language="JavaScript" type="text/javascript"></script>
</head>
<script type="text/javascript">
     var t1,t2,t3,t4;
	 function changeF() {
		document.getElementById('department').value = document
				.getElementById('dchoices').options[document
				.getElementById('dchoices').selectedIndex].value;
	 }
	 function checkUserID(){
		 var flag=getMyHTML("AjaxCheckUser.do?userId="+ addUserForm.userID.value);
		 if(flag=="null"){
			 document.all["tip1"].innerHTML = "<div class='reds' align='left'>用户名不能为空！</div>";
			 t1=false;
		 }
		 else if(flag=="error"){
			 document.all["tip1"].innerHTML = "<div class='reds' align='left'>用户名为5-20位字符</div>";
			 t1=false;
		 }
		 else if(flag=="exist"){
			 document.all["tip1"].innerHTML = "<div class='reds' align='left'>该用户名已存在</div>";
			 t1=false;
		 }
		 else{
			 document.all["tip1"].innerHTML = "";
			 t1=true;
		 }			 
	 }
	 function checkUserName(){
		 var p=document.getElementById("userName").value;
		 if(p==null||p==""){
			 document.all["tip2"].innerHTML = "姓名不能为空！";
			 t2=false;
		 }else{
			 document.all["tip2"].innerHTML = "";
			 t2=true;
		 }
	 }
	 function checkAcademy(){
		 var p=document.getElementById("academy").options[document.getElementById("academy").selectedIndex].value;
		 if(p=="-1"){
			 document.all["tip3"].innerHTML = "学院不能为空！";
			 t3=false;
		 }else{
			 document.all["tip3"].innerHTML = "";
			 t3=true;
		 }
	 }
	 function ckeckDepartment(){
		 var p=document.getElementById("department").value;
         if(p==null||p==""){
        	 document.all["tip4"].innerHTML = "部门不能为空!";
        	 t4=false;
		 }else{
			 document.all["tip4"].innerHTML = "";
			 t4=true;
		 }
	 }	 
	 function submitState(){
		 if(t1&&t2&&t3&&t4) return true;
		 else return false;
	 }	 
</script>
<body>
	<div class="xxgl-z-rq" id="rqdiv">
		<br>
		<br>
		<center>
			<h1>添加用户</h1>
		</center>
		<br>
		<br>
		<form action="addUser.action" method="post" onsubmit="return submitState();" name="addUserForm">
			<div class="shuru-group">
				<label for="old_password" class="shuru-label">用户名:</label>
				<div class="shurus shurus-block">
					<table>
						<tr>
							<td><input name="userID" name="userID" type="text" onblur="checkUserID();"/></td>
							<td><div id="tip1" style="color: red"></div></td>
						</tr>
					</table>
					<span class="help-block">Please Input Your UserID!</span>
				</div>
			</div>
			<div class="shuru-group">
				<label for="new_password" class="shuru-label">姓&nbsp;&nbsp;&nbsp;&nbsp;名:</label>
				<div class="shurus shurus-block">
					<table>
						<tr>
							<td><input name="userName" id="userName" type="text" onblur="checkUserName();"/></td>
							<td><div id="tip2" style="color: red"></div></td>
						</tr>
					</table>
					<span class="help-block">Please Input Your Name!</span>
				</div>
			</div>
			<% UserSession userSession=(UserSession) session.getAttribute("userSession");
			   if(userSession!=null&&userSession.getPoewer()==1){ %>  
			<div class="shuru-group">
				<label for="new2_password" class="shuru-label">学&nbsp;&nbsp;&nbsp;&nbsp;院:</label>
				<div class="shurus shurus-block">
					<table>
						<tr>
							<td><select style="width:210px;margin-left:0px"	name="academy" id="academy" onclick="checkAcademy();">
									<option value="-1" style="color:#c2c2c2;">------请选择学院------</option>
									<s:iterator value="academyList">
										<option value="<s:property value="acaid"/>">
											<s:property value="name" />
										</option>
									</s:iterator>
							</select></td>
							<td><div id="tip3" style="color: red"></div></td>
						</tr>
					</table>
					<span class="help-block">Please Select Your Academy!</span>
				</div>
			</div>
			<%}%>
			<div class="shuru-group">
				<label for="new2_password" class="shuru-label">部&nbsp;&nbsp;&nbsp;&nbsp;门:</label>
				<div class="shurus shurus-block">
					<table>
						<tr>
							<td><input id="department" name="department" type="text" onblur="ckeckDepartment();"></td>
							<td><div id="tip4" style="color: red"></div></td>
						</tr>
					</table>
					<span class="help-block">Please Input Your Department!</span>
				</div>
			</div>
			<div class="shuru-group">
				<div class="shurus shurus-block">
					<select style="width:210px;" id="dchoices" onclick="changeF()">
						<option value="" style="color:#c2c2c2;">------请选择部门------</option>
						<option value="院办">院办</option>
						<option value="601">601</option>
						<option value="602">602</option>
						<option value="603">603</option>
						<option value="605">605</option>
						<option value="608">608</option>
						<option value="中心实验室">中心实验室</option>
					</select>
				</div>
			</div>
			<div class="shuru-group">
				<div class="shurus shurus-block">
					<input value="保      存" type="submit" border="0" /> <input
						value="重     置" type="reset" border="0" style="margin-left:90px" />
				</div>
			</div>
		</form>
	</div>
</body>
</html>
