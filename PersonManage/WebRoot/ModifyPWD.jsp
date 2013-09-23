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
<link rel="stylesheet" type="text/css" href="css/xxgl_form.css"	media="screen" />
<link type="text/css" href="css/xxgl_style.css" rel="stylesheet"	media="screen">
<script src="js/AjaxCheck.js" language="JavaScript" 	type="text/javascript"></script>
<script language="javascript">
    var t1,t2,t3;
    function CheckPassword() {
	   if(getMyHTML("AjaxCheckPassword.do?password="+ modify.old_password.value)){
		   document.all["pass"].innerHTML = "";
		   t1=true;
	   }
	   else{
		   document.all["pass"].innerHTML = "<div class='reds' align='left'>*旧密码不正确，请重新输入！</div>";
		   t1=false;
	   }
	}   
	function check(obj,objID){
		var p1 = document.getElementById(obj).value;
		if(p1==null||p1==""){
			document.all[objID].innerHTML = "<div class='reds' align='left'>新密码不能为空</div>";
			return false;
		}
		else if(p1.length>20||p1.length<6){
			document.all[objID].innerHTML = "<div class='reds' align='left'>密码长度在6-20之间</div>";
			return false;
		}
		else{
			document.all[objID].innerHTML = "";
			return true;
		}		
	}	
	function newPassword(){
		if(check("new_password","pass2"))	t2=true;
		else	t2=false;
	}
	function CheckFit() {		
		if(check("new2_password","pass3")){
			var p1 = document.getElementById("new_password").value;
			var p2 = document.getElementById("new2_password").value;
			if (p1 == p2) {
				document.all["pass3"].innerHTML = "<div class='reds' align='left'>*两次密码一致！</div>";
				t3=true;
			} else {
				document.all["pass3"].innerHTML = "<div class='reds' align='left'>*两次密码不一致！请重新输入！</div>";
				t3=false;
			}
		}
		else t3=false;
	}
	function submitState(){
		if(t1&&t2&&t3) return true;
		else return false;
	}
</script>
</head>

<body>
	    <br><br>
	    <center><h1>修改密码</h1></center>
	    <br><br>
		<form action="modifyPWD.action" method="post" name="modify" onsubmit=" return submitState();" >		
			<div class="shuru-group">
				<label for="old_password" class="shuru-label">旧密码:</label>
				<div class="shurus shurus-block">
					<table>
						<tr>
							<td><input type="password" id="old_password" name="old_password" onBlur="CheckPassword();"/>
							</td>
							<td><div id="pass" style="color: red"></div>
							</td>
						</tr>
					</table>
					<span class="help-block">Please Input Your Password!</span>

				</div>
			</div>
			<div class="shuru-group">
				<label for="new_password" class="shuru-label">新密码:</label>
				<div class="shurus shurus-block">
					<table>
						<tr>
							<td><input type="password" id="new_password" name="new_password" onblur="newPassword();"/>
							</td>
							<td><div id="pass2" style="color: red"></div></td>
						</tr>
					</table>
					<span  class="help-block">Please Input Your Password!</span>
				</div>
			</div>
			<div class="shuru-group">
				<label for="new2_password" class="shuru-label">再次输入新密码:</label>
				<div class="shurus shurus-block">
					<table>
						<tr>
							<td><input type="password" id="new2_password"  name="new2_password" onBlur="CheckFit();"/>
							<td><div id="pass3" style="color: red"></div></td>
						</tr>
					</table>
					<span class="help-block">Please Input Your Password!</span>
				</div>
			</div>
			<div class="shuru-group">
				<div class="shurus shurus-block">
				     <input value="修       改 " type="submit" border="0"  />
				     <input value="重     置" type="reset" border="0" style="margin-left:80px"/>
			    </div>
		    </div>
		</form>
  </body>
</html>