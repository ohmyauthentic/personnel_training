<%@ page language="java" import="java.util.*" pageEncoding="GBK"%>
<%@ page import="cn.edu.njust.Session.UserSession" %>
<%
UserSession userSession=(UserSession) session.getAttribute("userSession");
if(userSession!=null){
%>
  <script type="text/javascript">
   alert("��ӳɹ���");
   location.href="http://localhost:8080/PersonManage/index.jsp";
  </script>
<%}%>
