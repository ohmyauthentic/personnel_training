<%@ page contentType="text/html; charset=gb2312" language="java"
	import="java.sql.*" errorPage=""%>
<%@ page import="java.util.*"%>
<%@ taglib prefix="ckeditor" uri="http://ckeditor.com"%>
<%@ page import="com.ckeditor.CKEditorConfig"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312" />
<title>无标题文档</title>
</head>

<body>
	<table align="center" border="1" width="60%">
		<tr>
			<td width="84" colspan="2"><p align="center">题目</p>
			</td>
			<td width="180" colspan="6"><p align="center">
					<textarea name="title" rows="3" cols="30"
						style="margin-right:0px;margin-left:0px"></textarea>
				</p>
			</td>
			<td width="66" colspan="3"><p align="center">类型</p>
			</td>
			<td width="56"><p align="center">
					<select style="width:80px;margin-left:0px" name="type">
						<option value="-1" style="color:#c2c2c2;">-选择-</option>
						<option value="论文">论文</option>
						<option value="论著">论著</option>
						<option value="教材">教材</option>
					</select>
				</p>
			</td>
			<td width="104" colspan="2"><p align="center">类别</p>
			</td>
			<td width="83" >
				<p align="center">
					<select style="width:140px;margin-left:0px" name="class_">
						<option value="-1" style="color:#c2c2c2;">--请选择--</option>
						<option value="社会科学">社会科学</option>
						<option value="自然科学">自然科学</option>
						<option value="工程应用">工程应用</option>
						<option value="其他">其他</option>
					</select>
				</p>
			</td>
		</tr>
		<tr>
			<td width="64" colspan="2"><p align="center">申报人</p>
			</td>
			<td width="45" colspan="3"><p align="center">姓名</p>
			</td>
			<td width="73" ><p align="center"><input type="text" name="applier" />
				</p>
			</td>
			<td width="113" colspan="3"><p align="center">所在单位</p>
			</td>
			<td width="123" ><p align="center">
					<input type="text" name="department" />
				</p>
			</td>
			<td width="77" colspan="2"><p align="center">联系电话</p>
			</td>
			<td width="103" ><p align="center">
					<input type="text" name="telephone" />
				</p>
			</td>
		</tr>
		<tr>
			<td width="84" colspan="4" rowspan="4" valign="center"><p
					align="center">作者</p>
				<p align="center">（请务必填写全部作者，从第一作者开始填起）</p>
			</td>
			<td width="93" valign="center" colspan="3"><p align="center">姓名
				</p>
			</td>
			<td width="179" valign="center" colspan="7"><p align="center">单位
				</p>
			</td>
			<td width="244" valign="center" colspan="2"><p align="center">职别(教师、学生)
				</p>
			</td>
		</tr>
		<tr>
			<td width="93" valign="center" colspan="3"><p align="center">
					<input type="text" name="author1" />
				</p>
			</td>
			<td width="179" valign="center" colspan="7"><p align="center">
					<input type="text" name="authDep1" />
				</p>
			</td>
			<td width="244" valign="center" colspan="2">
				<p align="center">
					<input type="radio" name="authJob1" value="教师" checked />教师 <input
						type="radio" name="authJob1" value="学生" />学生
				</p>
			</td>
		</tr>
		<tr>
			<td width="93" valign="center" colspan="3"><p align="center">
					<input type="text" name="author2" />
				</p>
			</td>
			<td width="179" valign="center" colspan="7"><p align="center">
					<input type="text" name="authDep2" />
				</p>
			</td>
			<td width="244" valign="center" colspan="2">
				<p align="center">
					<input type="radio" name="authJob2" value="教师" />教师 <input
						type="radio" name="authJob2" value="学生" />学生
				</p>
			</td>
		</tr>
		<tr>
			<td width="93" colspan="3" valign="center"><p align="center">
					<input type="text" name="author3" />
			</td>
			<td width="150" valign="center" colspan="7"><p align="center">
					<input type="text" name="authDep3" />
				</p>
			</td>
			<td width="150" valign="center" colspan="2">
				<p align="center">
					<input type="radio" name="authJob3" value="教师" />教师 <input
						type="radio" name="authJob3" value="学生" />学生
				</p>
			</td>
		</tr>
		<tr>
			<td width="45" rowspan="6" valign="center"><p align="center">论文
				</p>
			</td>
			<td width="131" valign="center" colspan="4"><p align="center">基金（项目）名称
				</p>
			</td>
			<td width="179" valign="center" colspan="5"><p align="center">
					<input type="text" name="fundName" />
				</p>
			</td>
			<td width="113" valign="center" colspan="3"><p align="center">基金（项目）号
				</p>
			</td>
			<td width="131" valign="center" colspan="3"><p align="center">
					<input type="text" name="fundId" />
				</p>
			</td>
		</tr>
		<tr>
			<td width="38" rowspan="3" valign="center"><p align="center">刊
					物</p>
			</td>
			<td width="93" valign="center" colspan="3"><p align="center">刊物名称
				</p>
			</td>
			<td width="179" valign="center" colspan="5"><p align="center">
					<input type="text" name="journal" />
				</p>
			</td>
			<td width="113" valign="center" colspan="3"><p align="center">刊物类别</p>
			</td>
			<td width="131" valign="center" colspan="3">
				<p align="center">
					<select style="width:200px;margin-left:0px" name="publication">
						<option value="-1" style="color:#c2c2c2;">--请选择--</option>
						<option value="国际">国际</option>
						<option value="国内">国内</option>

					</select>
				</p></td>
		</tr>
		<tr>
			<td width="93" valign="center" colspan="3"><p align="center">ISSN
				</p>
			</td>
			<td width="179" valign="center" colspan="5"><p align="center">
					<input type="text" name="issn" />
				</p>
			</td>
			<td width="57" colspan="2" rowspan="2" valign="center"><p
					align="center">发表时间</p>
			</td>
			<td width="186" valign="center" colspan="4"><p align="center">
					<select name="publishTime">
					</select>
				</p>
			</td>
		</tr>
		<tr>
			<td width="93" height="33" colspan="3" valign="center"><p
					align="center">CN</p>
			</td>
			<td width="179" valign="center" colspan="5"><p align="center">
					<input type="text" name="cn" />
				</p>
			</td>
			<td width="186" valign="center" colspan="4"><p align="center">
					<input type="text" name="position" />
				</p>
			</td>
		</tr>
		<tr>
			<td width="38" rowspan="2" valign="center"><p align="center">会议
				</p>
			</td>
			<td width="93" valign="center" colspan="3"><p align="center">会议名称
				</p>
			</td>
			<td width="124" valign="center" colspan="4"><p align="center">
					<input type="text" name="conTitle" />
				</p>
			</td>
			<td width="55" valign="center"><p align="center">时间</p>
			</td>
			<td width="113" valign="center" colspan="3"><p align="center">
					<input type="text" name="conTime" />
				</p>
			</td>
			<td width="48" valign="center" colspan="2"><p align="center">地点
				</p>
			</td>
			<td width="82" valign="center"><p align="center">
					<input type="text" name="conPlace" />
				</p>
			</td>
		</tr>
		<tr>
			<td width="93" valign="center" colspan="3"><p align="center">主办单位
				</p>
			</td>
			<td width="124" valign="center" colspan="4"><p align="center">
					<input type="text" name="host" />
				</p>
			</td>
			<td width="169" valign="center" colspan="4"><p align="center">论文集正式出版号(ISBN)
				</p>
			</td>
			<td width="131" valign="center" colspan="3"><p align="center">
					<input type="text" name="publishNum" />
				</p>
			</td>
		</tr>
		<tr>
			<td width="84" colspan="2" rowspan="2" valign="center"><p
					align="center">论著(教材)</p>
			</td>
			<td width="93" valign="center" colspan="3"><p align="center">出版社名称
				</p>
			</td>
			<td width="124" valign="center" colspan="4"><p align="center">
					<input type="text" name="publiser" />
				</p>
			</td>
			<td width="169" valign="center" colspan="4"><p align="center">总字数(千字)
				</p>
			</td>
			<td width="131" valign="center" colspan="3"><p align="center">
					<input type="text" name="sumWord" />
				</p>
			</td>
		</tr>
		<tr>
			<td width="93" valign="center" colspan="3"><p align="center">书号(ISBN)
				</p>
			</td>
			<td width="124" valign="center" colspan="4"><p align="center">
					<input type="text" name="bookNum" />
				</p>
			</td>
			<td width="169" valign="center" colspan="4"><p align="center">本人完成字数(千字)
				</p>
			</td>
			<td width="131" valign="center" colspan="3"><p align="center">
					<input type="text" name="myWord" />
				</p>
			</td>
		</tr>
		<tr>
			<td width="602" valign="center" colspan="16"><p align="center">摘要
				</p>
			</td>
		</tr>
		<tr>
			<td width="602" valign="top" colspan="16"><p>
					<%
						String value = "Ckeditor测试";
						Map<String, String> attr = new HashMap<String, String>();
						attr.put("rows", "8");
						attr.put("cols", "60");
						CKEditorConfig settings = new CKEditorConfig();
						settings.addConfigValue("width", 700);
						//settings.addConfigValue("toobar","basic");
					%>
					<ckeditor:editor editor="digest" basePath="ckeditor/"
						config="<%=settings %>" textareaAttributes="<%=attr%>">
					</ckeditor:editor>
				</p>
			</td>
		</tr>
		<tr>
			<td width="92" valign="center" colspan="3"><p align="center">申报人签名
				</p>
			</td>
			<td width="129" valign="center" colspan="3"><p align="center">&nbsp;</p>
			</td>
			<td width="380" valign="center" colspan="10"><p align="center">所在单位审核：&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;（盖章）
				</p>
			</td>
		</tr>
	</table>
</body>
</html>