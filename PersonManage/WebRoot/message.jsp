<%@ page language="java" import="java.util.*" pageEncoding="GBK"%>
<%@ page import="cn.edu.njust.Session.UserSession" %>
<%
UserSession userSession=(UserSession) session.getAttribute("userSession");
if(userSession==null){
%>
  <script type="text/javascript">
   alert("�㻹δ��¼�����¼!");
   location.href="http://localhost:8080/PersonManage/index.jsp";
  </script>
<%}else{
	String tip=(String)request.getAttribute("tip");
	if(tip.equals("101")){
%> 
   <script type="text/javascript">
       alert("�㻹δ��¼�����¼!dfasfasdf");
       location.href="http://localhost:8080/PersonManage/login.jsp";
   </script>
<%}else if(tip.equals("201")){%>
	 <script type="text/javascript">
       alert("�޸�����ɹ���");
       location.href="http://localhost:8080/PersonManage/manage/index.jsp";
   </script>

<%}}%>
