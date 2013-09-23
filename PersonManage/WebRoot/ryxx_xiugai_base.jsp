<%@ page language="java" import="java.util.*" pageEncoding="utf-8" contentType="text/html;charset=utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@ taglib prefix="ckeditor" uri="http://ckeditor.com" %>
<%@ page import="com.ckeditor.CKEditorConfig" %>


<!DOCTYPE HTML>
<html>
<head>
	<meta charset="utf-8">
	<title>Sliding Form Helps</title>
	
	<link href="bootstrap-datetimepicker-master/sample/bootstrap/css/bootstrap.min.css" rel="stylesheet" media="screen">
    <link href="bootstrap-datetimepicker-master/css/datetimepicker.css" rel="stylesheet" media="screen">    
	<link rel="stylesheet" type="text/css" href="css/xxgl_form.css" media="screen" />
	<link type="text/css" href="css/xxgl_style.css" rel="stylesheet" media="screen">
  </head>
  
  <body>
    <div >
	<aside id="sidebar">
	    <nav><a class="logo"  id="nav-logo"><span>个人信息管理<br><br></span>功能导航</a>
	      <ul>
	     	<li  ><a href="userlogin.jsp">主页</a></li>
	        <li><a href="ryxx_chakan.jsp">查看</a></li>
	        <li class="active"><a id="nav_xiugai">修改</a></li>
		        <li class="psli" style="display:block;"><a class="psactive" href="ryxx_xiugai_base.jsp" style="color:#fff;">&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp基本资料</a></li>
		        <li class="psli" style="display:block;"><a class="psactive" href="" >&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp学习经历</a></li>
		        <li class="psli" style="display:block;"><a class="psactive" href="" >&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp工作经历</a></li>
		        <li class="psli" style="display:block;"><a class="psactive" href="" >&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp兼职情况</a></li>
		        <li class="psli" style="display:block;"><a class="psactive" href="" >&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp荣誉称号</a></li>
	        <li><a href="ryxx_keyan.jsp">科研成果</a></li>
	        <li><a href="ryxx_mima.jsp">修改密码</a></li>
	      </ul>
	      <div class="bg_bottom"></div>
	    </nav>
	</aside>
	<div class="xxgl-z-rq" id="rqdiv">
		<div id="xiugai" >
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
					<select style="width:80px;height:30px;margin-left:40px"  name="type">
	                   <option value="-1" style="color:#c2c2c2;">-选择-</option>
	                   <option value="男">男</option>
	                   <option value="女" >女</option>
	                   
			       </select>
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
					<select style="width:80px;height:30px;margin-left:40px"  name="type">
	                   <option value="-1" style="color:#c2c2c2;">-选择-</option>
	                   <option value="汉族">汉族</option>
	                   <option value="蒙古族" >蒙古族</option>
	                   <option value="回族 " >回族 </option>
	                   <option value="壮族" >壮族</option>
	                   <option value="维吾尔族" >维吾尔族</option>
	                   <option value="藏族" >藏族</option>
	                   <option value="苗族" >苗族</option>
	                   <option value="彝族" >彝族</option>
	                   <option value="布依族" >布依族</option>
	                   <option value="朝鲜族" >朝鲜族</option>
	                   <option value="满族" >满族</option>
	                   <option value="侗族" >侗族</option>
	                   <option value="瑶族" >瑶族</option>
	                   <option value="白族" >白族</option>
	                   <option value="土家族" >土家族</option>
	                   <option value="哈尼族" >哈尼族</option>
	                   <option value="哈萨克族" >哈萨克族</option>
	                   <option value="傣族" >傣族</option>
	                   <option value="黎族" >黎族</option>
	                   <option value="僳僳族" >僳僳族</option>
	                   <option value="佤族" >佤族</option>
	                   <option value="畲族 " >畲族 </option>
	                   <option value=" 拉祜族" > 拉祜族</option>
	                   <option value="水族" >水族</option>
	                   <option value="东乡族" >东乡族</option>
	                   <option value=" 纳西族" > 纳西族</option>
	                   <option value="景颇族" >景颇族</option>
	                   <option value="柯尔克孜族" >柯尔克孜族</option>
	                   <option value="土族" >土族</option>
	                   <option value="达斡尔族" >达斡尔族</option>
	                   <option value="仫佬族" >仫佬族</option>
	                   <option value="仡佬族" >仡佬族</option>
	                   <option value="羌族" >羌族</option>
	                   <option value="锡伯族" >锡伯族</option>	                                            
	                   <option value="布朗族" >布朗族</option>
	                   <option value=" 撒拉族" > 撒拉族</option>
	                   <option value="毛南族" >毛南族</option>
	                   <option value="阿昌族" >阿昌族</option>
	                   <option value="普米族" >普米族</option>
	                   <option value="塔吉克族 " >塔吉克族 </option>
	                   <option value="怒族" >怒族</option>
	                   <option value="乌孜别克族" >乌孜别克族</option>
	                   <option value="俄罗斯族" >俄罗斯族</option>
	                   <option value="鄂温克族" >鄂温克族</option>
	                   <option value="德昂族" >德昂族</option>
	                   <option value="保安族" >保安族</option>
	                   <option value="裕固族" >裕固族</option>
	                   <option value="京族" >京族</option>
	                   <option value="基诺族" >基诺族</option>
	                   <option value="高山族" >高山族</option>
	                   <option value="塔塔尔族" >塔塔尔族</option>
	                   <option value="独龙族" >独龙族</option>
	                   <option value="鄂伦春族 " >鄂伦春族 </option>
	                   <option value="赫哲族" >赫哲族</option>
	                   <option value="门巴族" >门巴族</option>
	                   <option value=" 珞巴族" > 珞巴族</option>
	                                                         
	                                                             
			       </select>
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
						<input type="text" id="ph" />
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
	</div>
	</div>
  </body>
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
		startView: 4,
		forceParse: 0,
        showMeridian: 1,
        minView: 2
    });
    
    $(document).ready(function(){
	    $("a").click(function()
	    {
	    	$("li").filter(".active").removeClass("active"); 
	    	$("li").not(".psli").has(this).addClass("active");
	    	
	    });
	    $("#nav_xiugai").click(function(){
	    	$(".psli").slideToggle(800);
	    });
	    
	 });
    	
    
    </script>
</body>
</html>

