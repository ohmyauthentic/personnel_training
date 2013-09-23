<%@ page language="java" import="java.util.*" pageEncoding="GBK"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE HTML>
<html lang="en-US">
<head>
	<base href="<%=basePath%>">
    
       <title>ÏµÍ³µÇÂ½Ò³Ãæ</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<link rel="stylesheet" href="css/login_base.css" type="text/css" media="screen" title="no title" charset="utf-8"/>
	<link rel="stylesheet" href="css/login_form.css" type="text/css" media="screen" title="no title" charset="utf-8"/>
	<link rel="stylesheet" href="css/login_switch.css" type="text/css" media="screen" title="no title" charset="utf-8"/>
	<link rel="stylesheet" href="css/login_demo3.css" type="text/css" media="screen" title="no title" charset="utf-8"/>
</head>
<script type="text/javascript">
	function check()
	{
		var che=document.getElementById("myonoffswitch")
		if(che.checked)
		{			
			document.getElementById("logintype").value=0;
		}
		else{
			document.getElementById("logintype").value=1;
		}
			
	}
</script>
<body>
	<div class="container">
		<header> </header>
		<div id="container_demo">
			<div class="onoffswitch">
				<input type="checkbox" name="onoffswitch"
					class="onoffswitch-checkbox" id="myonoffswitch" checked> <label
					class="onoffswitch-label" for="myonoffswitch">
					<div class="onoffswitch-inner"></div>
					<div class="onoffswitch-switch"></div> </label>
			</div>
			<div id="wrapper">
				<div id="login" class="form animate">
					<form action="loginAction.action" method="post" autocomplete="on">
						<h1>Log in</h1>
						<div>
							<label for="username" class="uname" data-icon="u">Your userName</label>
							 <input type="text" id="username"  name="userName"required="required" placeholder="myusename or mymail@mail.com" />
						</div>
						<div>
							<label for="password" class="youpasswd" data-icon="p">Your password</label> 
							<input type="password" name="password"	required="required" placeholder="eg. X8df!90E0" id="password" />
						</div>
						<div class="login button">
							<input type="submit" value="µÇÂ½" class="btn" onclick="check()" />
						</div>
						<div class="change_link"></div>
						<input type="hidden" id="logintype" name="logintype">
					</form>
				</div>
				<!-- end Login Form -->
			</div>
		</div>
	</div>
</body>
</html>