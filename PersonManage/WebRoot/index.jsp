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
    
   <title><s:text name="��¼�ɹ�ҳ��"></s:text></title>
    
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
		<h2>��ӭ��½</h2>
	</center>
	<% UserSession userSession=(UserSession) session.getAttribute("userSession");
	   if(userSession!=null&&userSession.getPoewer()==1){
     %>
               ��ǰ�û��ǳ����û���<s:a href="super/modify.jsp">�����û�����</s:a>
                <s:a href="amaList.action">ϵͳ�û�����</s:a>
    <%}else if(userSession!=null&&userSession.getPoewer()==2){%>
                ��ǰ�û���ϵͳ�����û���<s:a href="amaList.action">ϵͳ�û�����</s:a>
    <%}else {%>
                 ��ǰ�û�����ͨ�û���
    <%} %>
	<br> ��ǰ��¼�û���
	<s:property value="userName" />
	<br> ��ǰ��¼�û����룺
	<s:property value="password" />	
	<s:a href="adduser.jsp">ϵͳ����Ա����û�</s:a>
	<s:a href="smaList.action">��������Ա����û�</s:a>
	<s:a href="ModifyPWD.jsp">�޸ĵ�¼����</s:a>
	<a href="userlist.action?page=1">�鿴�û�</a>
	<a href="managerlist.action?page=1">�鿴����Ա</a>
	<br>
	<!--  <s:a href="list.action?page=1">�鿴�û�</s:a>-->
	<s:a href="logoutAction.action">ע����¼</s:a>
	<a href="ckeditor.jsp">CKEditor</a>
	<a href="AcPaper.jsp">��ȿ��гɹ��걨</a>
	<a href="#">���˻�����Ϣ</a>
	<a href="#">ѧ����Ϣ</a>
	<a href="#">��������</a>
	<a href="#">��ְ���</a>
	<a href="#">ѧ������</a>
	<br><br><br>
	<hr>
	<div id="menu">
	      <div class="has_children">
	          <span>��Ա��Ϣ����</span>
	           <a href="MyJsp.jsp">������Ϣ</a>
	           <a href="">������Ϣ</a>
	           <a href="">��ְ��Ϣ</a>
	           <a href="">ѧ����Ϣ</a>  
	           <a href="">ѧ������</a>        
	      </div>
	       <div class="has_children">
	          <span>��ȿ��гɹ��걨</span>
	          <a href="">���</a>
	          <a href="">�鿴</a>       
	      </div>
	       <div class="has_children">
	          <span>�޸�����</span>	      
	      </div>
	      <div class="has_children">
	         <span>ע����¼</span>
	          <a href="logoutAction.action">ע��</a>	      
	      </div>
	</div>
	<script type="text/javascript">
	   $(".has_children").click(function(){
		   $(this).addClass("highlight").children("a").show().end().siblings().removeClass("highlight").children("a").hide();
	   })
	</script>
</body>

</html>
