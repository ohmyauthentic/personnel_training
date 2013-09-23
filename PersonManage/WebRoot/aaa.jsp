<%@ page language="java" import="java.util.*" pageEncoding="GBK"%>
<%@ taglib prefix="ckeditor" uri="http://ckeditor.com" %>
<%@ page import="com.ckeditor.CKEditorConfig" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>年度科研成果申报</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<link href="bootstrap-datetimepicker-master/sample/bootstrap/css/bootstrap.min.css" rel="stylesheet" media="screen">
    <link href="bootstrap-datetimepicker-master/css/datetimepicker.css" rel="stylesheet" media="screen">
    
	<link rel="stylesheet" type="text/css" href="css/xxgl_form.css" media="screen" />
	<link type="text/css" href="css/xxgl_style.css" rel="stylesheet" media="screen">
	
    <script type="text/javascript">
    function keyan(){
		document.getElementById("rqdiv").style.display="none";
		document.getElementById("chakan").style.display="none";
		document.getElementById("xiugai").style.display="none";
		document.getElementById("keyan").style.display="block";
		document.getElementById("mima").style.display="none";	    
	}
    </script>
  </head>
  <body>
  
  </body>
</html>