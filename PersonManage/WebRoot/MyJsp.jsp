<%@ page language="java" import="java.util.*" pageEncoding="utf-8" contentType="text/html;charset=utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@ taglib prefix="ckeditor" uri="http://ckeditor.com" %>
<%@ page import="com.ckeditor.CKEditorConfig" %>


<!DOCTYPE HTML>
<html lang="en-US">
<head>
    <meta http-equiv="content-type" content="text/html; charset=gbk">
	
	<title>Sliding Form Helps</title>
	
	<link href="bootstrap-datetimepicker-master/sample/bootstrap/css/bootstrap.min.css" rel="stylesheet" media="screen">
    <link href="bootstrap-datetimepicker-master/css/datetimepicker.css" rel="stylesheet" media="screen">
    
    
	<link rel="stylesheet" type="text/css" href="css/xxgl_form.css" media="screen" />
	<link type="text/css" href="css/xxgl_style.css" rel="stylesheet" media="screen">
	
	
    
	<script type="text/javascript">
	
	function changediv()
	{
		var elem=document.getElementsById("rqdiv");
		
	}
	
	function chakan(){
		document.getElementById("rqdiv").style.display="block";
		document.getElementById("chakan").style.display="block";
		document.getElementById("xiugai").style.display="none";
		document.getElementById("keyan").style.display="none";
		document.getElementById("mima").style.display="none";
		
	}
	function xiugai(){
		document.getElementById("rqdiv").style.display="block";
		document.getElementById("chakan").style.display="none";
		document.getElementById("xiugai").style.display="block";
		document.getElementById("keyan").style.display="none";
		document.getElementById("mima").style.display="none";
		
	    
	}
	function keyan(){
		
		document.getElementById("chakan").style.display="none";
		document.getElementById("xiugai").style.display="none";
		document.getElementById("keyan").style.display="block";
		document.getElementById("mima").style.display="none";
		document.getElementById("rqdiv").style.display="none";
		
	    
	}
	function mima(){
		document.getElementById("rqdiv").style.display="block";
		document.getElementById("chakan").style.display="none";
		document.getElementById("xiugai").style.display="none";
		document.getElementById("keyan").style.display="none";
		document.getElementById("mima").style.display="block";
		
	    
	}

	
	</script>
	
</head>
<body>
<div >
	<aside id="sidebar">
	    <nav><a class="logo"  id="nav-logo"><span>个人信息管理<br><br></span>功能导航</a>
	      <ul>
	     	<li  ><a href="userlogin.jsp">主页</a></li>
	        <li class="active" onclick="chakan()"><a href="#">查看</a></li>
	        <li onclick="xiugai()"><a href="#">修改</a></li>
	        <li><a href="#" onclick="keyan()">科研成果</a></li>
	        <li><a href="#" onclick="mima()">修改密码</a></li>
	      </ul>
	      <div class="bg_bottom"></div>
	    </nav>
	</aside>
	<div class="xxgl-z-rq" id="rqdiv">
		<div id="chakan">
		<form action="#" method="post">
			
				<div class="shuru-group">
					<label for="name" class="shuru-label">姓名:</label>
					<div class="shurus shurus-block">
						<input type="text" id="name" />
						<span class="help-block">Please Input Your Email!</span>
					</div>
				</div>
				<div class="shuru-group">
					<label for="sex" class="shuru-label">性别:</label>
					<div class="shurus shurus-block">
						<input type="text" id="sex" />
						<span class="help-block">Please Input Your Email!</span>
					</div>
				</div>
				<div class="shuru-group">
					<label for="birthdate" class="shuru-label">出生日期:</label>
					<div class="controls input-append date form_datetime" data-date="" data-date-format="dd MM yyyy " data-link-field="dtp_input1" >
	                    <input size="16" type="text" value="" readonly style="background-color: rgb(255, 255, 255);margin-left: 40px;">
	                    <span class="add-on"><i class="icon-remove"></i></span>
						<span class="add-on"><i class="icon-th"></i></span>
                	</div>
				</div>
				<div class="shuru-group">
					<label for="race" class="shuru-label">民族:</label>
					<div class="shurus shurus-block">
						<input type="text" id="race" />
						<span class="help-block">Please Input Your Email!</span>
					</div>
				</div>
				<div class="shuru-group">
					<label for="native_place" class="shuru-label">籍贯:</label>
					<div class="shurus shurus-block">
						<input type="text" id="native_place" />
						<span class="help-block">Please Input Your Email!</span>
					</div>
				</div>
				<div class="shuru-group">
					<label for="id_number" class="shuru-label">身份证号:</label>
					<div class="shurus shurus-block">
						<input type="text" id="id_number" />
						<span class="help-block">Please Input Your Email!</span>
					</div>
				</div>
				<div class="shuru-group">
					<label for="polical" class="shuru-label">政治面貌:</label>
					<div class="shurus shurus-block">
						<input type="text" id="polical" />
						<span class="help-block">Please Input Your Email!</span>
					</div>
				</div>
				<div class="shuru-group">
					<label for="t_type" class="shuru-label">导师类型:</label>
					<div class="shurus shurus-block">
						<input type="text" id="t_type" />
						<span class="help-block">Please Input Your Email!</span>
					</div>
				</div>
				<div class="shuru-group">
					<label for="dir" class="shuru-label">研究方向:</label>
					<div class="shurus shurus-block">
						<input type="text" id="dir" />
						<span class="help-block">Please Input Your Email!</span>
					</div>
				</div>
				<div class="shuru-group">
					<label for="position" class="shuru-label">行政职务:</label>
					<div class="shurus shurus-block">
						<input type="text" id="position" />
						<span class="help-block">Please Input Your Email!</span>
					</div>
				</div>
				<div class="shuru-group">
					<label for="work_ad" class="shuru-label">办公地址:</label>
					<div class="shurus shurus-block">
						<input type="text" id="work_ad" />
						<span class="help-block">Please Input Your Password!</span>
					</div>
				</div>			 
				<div class="shuru-group">
					<label for="work_ph" class="shuru-label">办公电话:</label>
					<div class="shurus shurus-block">
						<input type="text" id="work_ph" />
						<span class="help-block">Please Input Your Email!</span>
					</div>
				</div>
				<div class="shuru-group">
					<label for="ph" class="shuru-label">移动电话:</label>
					<div class="shurus shurus-block">
						<input type="text" id="ph" />
						<span class="help-block">Please Input Your Password!</span>
					</div>
				</div>	
				<div class="shuru-group">
					<label for="ad" class="shuru-label">通讯地址:</label>
					<div class="shurus shurus-block">
						<input type="text" id="ad" />
						<span class="help-block">Please Input Your Password!</span>
					</div>
				</div>	
				<div class="shuru-group">
					<label for="ph" class="shuru-label">移动电话:</label>
					<div class="shurus shurus-block">
						<input type="search" id="ph" />
						<span class="help-block">Please Input Your Password!</span>
					</div>
				</div>	
				<div class="shuru-group">
					<label for="email1" class="shuru-label">邮箱:</label>
					<div class="shurus shurus-block">
						<input type="email" id="email1" />
						<span class="help-block">Please Input Your Password!</span>
					</div>
				</div>	
				<div class="shuru-group">
					<label for="email2" class="shuru-label">邮箱:</label>
					<div class="shurus shurus-block">
						<input type="email" id="email2" />
						<span class="help-block">Please Input Your Password!</span>
					</div>
				</div>	
				<div class="shuru-group">
					<label for="email3" class="shuru-label">邮箱:</label>
					<div class="shurus shurus-block">
						<input type="email" id="email3" />
						<span class="help-block">Please Input Your Password!</span>
					</div>
				</div>	
				<div class="shuru-group">
					<label for="ph" class="shuru-label">移动电话:</label>
					<div class="shurus shurus-block">
						<input type="text" id="ph" />
						<span class="help-block">Please Input Your Password!</span>
					</div>
				</div>			 
		</form>	
		</div>
		<div id="xiugai">
		<form action="#" method="post">
			
				<div class="shuru-group">
					<label for="name" class="shuru-label">姓名:</label>
					<div class="shurus shurus-block">
						<input type="text" id="name" />
						<span class="help-block">Please Input Your Email!</span>
					</div>
				</div>
				<div class="shuru-group">
					<label for="sex" class="shuru-label">性别:</label>
					<div class="shurus shurus-block">
						<input type="text" id="sex" />
						<span class="help-block">Please Input Your Email!</span>
					</div>
				</div>
				<div class="shuru-group">
					<label for="birthdate" class="shuru-label">出生日期:</label>
					<div class="controls input-append date form_datetime" data-date="" data-date-format="yyyy-mm-dd " data-link-field="dtp_input1" >
	                    <input size="16" type="text" value="" readonly style="background-color: rgb(255, 255, 255);margin-left: 40px;">
	                    <span class="add-on"><i class="icon-remove"></i></span>
						<span class="add-on"><i class="icon-th"></i></span>
                	</div>
				</div>
				<div class="shuru-group">
					<label for="race" class="shuru-label">民族:</label>
					<div class="shurus shurus-block">
						<input type="text" id="race" />
						<span class="help-block">Please Input Your Email!</span>
					</div>
				</div>
				<div class="shuru-group">
					<label for="native_place" class="shuru-label">籍贯:</label>
					<div class="shurus shurus-block">
						<input type="text" id="native_place" />
						<span class="help-block">Please Input Your Email!</span>
					</div>
				</div>
				<div class="shuru-group">
					<label for="id_number" class="shuru-label">身份证号:</label>
					<div class="shurus shurus-block">
						<input type="text" id="id_number" />
						<span class="help-block">Please Input Your Email!</span>
					</div>
				</div>
				<div class="shuru-group">
					<label for="polical" class="shuru-label">政治面貌:</label>
					<div class="shurus shurus-block">
						<input type="text" id="polical" />
						<span class="help-block">Please Input Your Email!</span>
					</div>
				</div>
				<div class="shuru-group">
					<label for="t_type" class="shuru-label">导师类型:</label>
					<div class="shurus shurus-block">
						<input type="text" id="t_type" />
						<span class="help-block">Please Input Your Email!</span>
					</div>
				</div>
				<div class="shuru-group">
					<label for="dir" class="shuru-label">研究方向:</label>
					<div class="shurus shurus-block">
						<input type="text" id="dir" />
						<span class="help-block">Please Input Your Email!</span>
					</div>
				</div>
				<div class="shuru-group">
					<label for="position" class="shuru-label">行政职务:</label>
					<div class="shurus shurus-block">
						<input type="text" id="position" />
						<span class="help-block">Please Input Your Email!</span>
					</div>
				</div>
				<div class="shuru-group">
					<label for="work_ad" class="shuru-label">办公地址:</label>
					<div class="shurus shurus-block">
						<input type="text" id="work_ad" />
						<span class="help-block">Please Input Your Password!</span>
					</div>
				</div>			 
				<div class="shuru-group">
					<label for="work_ph" class="shuru-label">办公电话:</label>
					<div class="shurus shurus-block">
						<input type="text" id="work_ph" />
						<span class="help-block">Please Input Your Email!</span>
					</div>
				</div>
				<div class="shuru-group">
					<label for="ph" class="shuru-label">移动电话:</label>
					<div class="shurus shurus-block">
						<input type="text" id="ph" />
						<span class="help-block">Please Input Your Password!</span>
					</div>
				</div>	
				<div class="shuru-group">
					<label for="ad" class="shuru-label">通讯地址:</label>
					<div class="shurus shurus-block">
						<input type="text" id="ad" />
						<span class="help-block">Please Input Your Password!</span>
					</div>
				</div>	
				<div class="shuru-group">
					<label for="ph" class="shuru-label">移动电话:</label>
					<div class="shurus shurus-block">
						<input type="search" id="ph" />
						<span class="help-block">Please Input Your Password!</span>
					</div>
				</div>	
				<div class="shuru-group">
					<label for="email1" class="shuru-label">邮箱:</label>
					<div class="shurus shurus-block">
						<input type="email" id="email1" />
						<span class="help-block">Please Input Your Password!</span>
					</div>
				</div>	
				<div class="shuru-group">
					<label for="email2" class="shuru-label">邮箱:</label>
					<div class="shurus shurus-block">
						<input type="email" id="email2" />
						<span class="help-block">Please Input Your Password!</span>
					</div>
				</div>	
				<div class="shuru-group">
					<label for="email3" class="shuru-label">邮箱:</label>
					<div class="shurus shurus-block">
						<input type="email" id="email3" />
						<span class="help-block">Please Input Your Password!</span>
					</div>
				</div>	
				<div class="shuru-group">
					<label for="ph" class="shuru-label">移动电话:</label>
					<div class="shurus shurus-block">
						<input type="text" id="ph" />
						<span class="help-block">Please Input Your Password!</span>
					</div>
				</div>			 
		</form>
		</div>
		
	
		<div id="mima">
			<form action="#" method="post">
				<div class="shuru-group">
					<label for="old_password" class="shuru-label">旧密码:</label>
					<div class="shurus shurus-block">
						<input type="password" id="old_password" />
						<span class="help-block">Please Input Your Password!</span>
					</div>
				</div>	
				<div class="shuru-group">
					<label for="new_password" class="shuru-label">新密码:</label>
					<div class="shurus shurus-block">
						<input type="password" id="new_password" />
						<span class="help-block">Please Input Your Password!</span>
					</div>
				</div>	
				<div class="shuru-group">
					<label for="new2_password" class="shuru-label">再次输入新密码:</label>
					<div class="shurus shurus-block">
						<input type="password" id="new2_password" />
						<span class="help-block">Please Input Your Password!</span>
					</div>
				</div>	
			</form>
		</div>
	</div>
	<table  cellspacing="0" cellpadding="0"  id="keyan" >
    <tr>
      <td width="90" colspan="2"><p align="center">题目 </p></td>
      <td width="240" colspan="6"><textarea name="title" rows="3" cols="42" style="margin-right:0px;margin-left:0px" ></textarea></td>
      <td width="70" colspan="2"><p align="center">类型 </p></td>
      <td width="80">
          <p align="center">
               <select style="width:80px;margin-left:0px"  name="type">
                   <option value="-1" style="color:#c2c2c2;">-选择-</option>
                   <option value="论文">论文</option>
                   <option value="论著" >论著</option>
                   <option value="教材" >教材</option>
		       </select>
          </p>
      </td>
      <td width="80" colspan="3"><p align="center">类别 </p></td>
      <td width="140" colspan="2">
           <p align="center">
              <select style="width:140px;margin-left:0px"  name="class_">
                  <option value="-1" style="color:#c2c2c2;">--请选择--</option>
                  <option value="社会科学">社会科学</option>
                  <option value="自然科学">自然科学</option>
                  <option value="工程应用">工程应用</option>
                  <option value="其他" >其他</option>
              </select>
            </p>
      </td>
    </tr>
    <tr>
      <td width="90" colspan="2"><p align="center">申报人 </p></td>
      <td width="90" colspan="2"><p align="center">姓名 </p></td>
      <td width="90" colspan="3"><p align="center"><input type="text" name="applier"/> </p></td>
      <td width="130" colspan="3"><p align="center">所在<br>单位 </p></td>
      <td width="100" colspan="3"><p align="center"><input type="text" name="department"/> </p></td>
      <td width="80"><p align="center">联系 <br />电话 </p></td>
      <td width="140" colspan="2"><p><input type="text" name="telephone"/></p></td>
    </tr>
    <tr>
      <td width="90" colspan="2" rowspan="4"><p align="center">作者 <br />
        （请务必填写全部作者，从第一作者开始填起） </p></td>
      <td width="100" colspan="3"><p align="center">姓名 </p></td>
      <td width="210" colspan="5"><p align="center">单位 </p></td>
      <td width="300" colspan="6"><p align="center">职别</p></td>
    </tr>
    <tr>
      <td width="100" colspan="3"><p align="center"><input type="text" name="author1"/></td>
      <td width="210" colspan="5"><p align="center"><input type="text" name="authDep1"/> </p></td>
      <td width="300" colspan="6">
          <p align="center">
             <input type="radio" name="authJob1" value="教师" checked/>教师
             <input type="radio" name="authJob1" value="学生"/>学生
          </p>
      </td>
    </tr>
    <tr>
      <td width="100" colspan="3"><p align="center"><input type="text" name="author2"/></td>
      <td width="210" colspan="5"><p align="center"><input type="text" name="authDep2"/> </p></td>
      <td width="300" colspan="6">
          <p align="center">
             <input type="radio" name="authJob2" value="教师"/>教师
             <input type="radio" name="authJob2" value="学生"/>学生
          </p>
      </td>
    </tr>
    <tr>
      <td width="100" colspan="3"><p align="center"><input type="text" name="author3"/></td>
      <td width="210" colspan="5"><p align="center"><input type="text" name="authDep3"/> </p></td>
      <td width="300" colspan="6">
          <p align="center">
             <input type="radio" name="authJob3" value="教师" />教师
             <input type="radio" name="authJob3" value="学生"/>学生
          </p>
      </td>
    </tr>
    <tr>
      <td width="50" rowspan="6"><p align="center">论文 </p></td>
      <td width="140" colspan="4"><p align="center">基金（项目）名称 </p></td>
      <td width="210" colspan="5"><p align="center"><input type="text" name="fundName"/> </p></td>
      <td width="100" colspan="3"><p align="center">基金（项目）号 </p></td>
      <td width="200" colspan="3"><p align="center"><input type="text" name="fundId"/> </p></td>
    </tr>
    <tr>
      <td width="40" rowspan="3"><p align="center">刊 <br />
        物 </p></td>
      <td width="100" colspan="3"><p align="center">刊物名称 </p></td>
      <td width="210" colspan="5"><p align="center"><input type="text" name="journal"/></p></td>
      <td width="100" colspan="3"><p align="center">刊物类别 </p></td>
      <td width="200" colspan="3">
      <p align="center">
              <select style="width:200px;margin-left:0px"  name="publication">
                  <option value="-1" style="color:#c2c2c2;">--请选择--</option>
                  <option value="国际">国际</option>
                  <option value="国内">国内</option>
                  
              </select>
       </p>
	  </td>
    </tr>
    <tr>
      <td width="100" colspan="3"><p align="center">ISSN</p></td>
      <td width="210" colspan="5"><p align="center"><input type="text" name="issn"/></p></td>
      <td width="80" colspan="2" rowspan="2"><p align="center">发表 <br /> 时间 </p></td>
      <td width="220" colspan="4">
	      <p align="center">
	      <select name="publishTime">
	      </select>
	      </p>
      </td>
    </tr>
    <tr>
      <td width="100" colspan="3"><p align="center">CN</p></td>
      <td width="210" colspan="5"><p align="center"><input type="text" name="cn"/></p></td>
      <td width="220" colspan="4"><p align="center"><input type="text" name="position"/> </p></td>
    </tr>
    <tr>
      <td width="40" rowspan="2"><p align="center">会 <br />  议 </p></td>
      <td width="100" colspan="3"><p align="center">会议名称 </p></td>
      <td width="160" colspan="4"><p align="center"><input type="text" name="conTitle"/></p></td>
      <td width="50"><p align="center">时间 </p></td>
      <td width="100" colspan="3"><p align="center"> <input type="text" name="conTime"/> </p></td>
      <td width="50" colspan="2"><p align="center">地点 </p></td>
      <td width="150"><p align="center"><input type="text" name="conPlace"/></p></td>
    </tr>
    <tr>
      <td width="100" colspan="3"><p align="center">主办单位 </p></td>
      <td width="160" colspan="4"><p align="center"><input type="text" name="host"/></p></td>
      <td width="150" colspan="4"><p align="center">论文集正式出版号(ISBN)</p></td>
      <td width="200" colspan="3"><p align="center"><input type="text" name="publishNum"/></p></td>
    </tr>
    <tr>
      <td width="90" colspan="2" rowspan="2"><p align="center">论著 <br />
        (教材) </p></td>
      <td width="100" colspan="3"><p align="center">出版社名称 </p></td>
      <td width="160" colspan="4"><p><input type="text" name="publiser"/></p></td>
      <td width="150" colspan="4"><p align="center">总字数(千字)</p></td>
      <td width="200" colspan="3"><p align="center"><input type="text" name="sumWord"/></p></td>
    </tr>
    <tr>
      <td width="100" colspan="3"><p align="center">书号(ISBN)</p></td>
      <td width="160" colspan="4"><p><input type="text" name="bookNum"/></p></td>
      <td width="150" colspan="4"><p align="center">本人完成字数(千字)</p></td>
      <td width="200" colspan="3"><p align="center"><input type="text" name="myWord"/></p></td>
    </tr>
    <tr>
      <td width="700" colspan="16"><p align="center">摘要 </p></td>
    </tr>
    <tr>
      <td width="700" colspan="16" valign="top"><p>
         <% String value="Ckeditor测试";
         Map<String,String> attr=new HashMap<String,String>();
         attr.put("rows","8");
         attr.put("cols","60");
         CKEditorConfig settings= new CKEditorConfig();
         settings.addConfigValue("width", 950);
         //settings.addConfigValue("toobar","basic");
        %>
		<ckeditor:editor editor="digest" basePath="ckeditor/"
			config="<%=settings %>" textareaAttributes="<%=attr%>"
	    >
		</ckeditor:editor> </p>
	  </td>
    </tr>
    <tr>
      <td width="100" colspan="3"><p align="center">申报人签名 </p></td>
      <td width="170" colspan="3"><p><strong>&nbsp;</strong></p></td>
      <td width="430" colspan="10"><p>所在单位审核：                 （盖章）<strong> </strong></p></td>
    </tr>
  </table>	
</div>
	

	
	
	<script type="text/javascript" src="bootstrap-datetimepicker-master/sample/jquery/jquery-1.8.3.min.js" charset="UTF-8"></script>
	<script type="text/javascript" src="bootstrap-datetimepicker-master/sample/bootstrap/js/bootstrap.min.js"></script>
	<script type="text/javascript" src="bootstrap-datetimepicker-master/js/bootstrap-datetimepicker.js" charset="UTF-8"></script>
	<script type="text/javascript" src="bootstrap-datetimepicker-master/js/locales/bootstrap-datetimepicker.zh-CN.js" charset="UTF-8"></script>

	 
	<script type="text/javascript" src="js/jquery.js"></script>
    <script type="text/javascript">
    $('.form_datetime').datetimepicker({
        language:  'zh-CN',
        weekStart: 1,
        todayBtn:  1,
		autoclose: 1,
		todayHighlight: 1,
		startView: 3,
		forceParse: 0,
        showMeridian: 1,
        minView: 2
    });
    
    $(document).ready(function(){
	    $("a").click(function()
	    {
	    	$("li").filter(".active").removeClass("active"); 
	    	$("li").has(this).addClass("active");
	    	
	    });
	 });
    	
    
    </script>
</body>
</html>