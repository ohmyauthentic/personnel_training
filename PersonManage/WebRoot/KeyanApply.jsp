<%@ page contentType="text/html; charset=gb2312" language="java"
	import="java.sql.*" errorPage=""%>
<%@ page import="java.util.*"%>
<%@ taglib prefix="ckeditor" uri="http://ckeditor.com"%>
<%@ page import="com.ckeditor.CKEditorConfig"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312" />
<title>�ޱ����ĵ�</title>
</head>

<body>
	<table align="center" border="1" width="60%">
		<tr>
			<td width="84" colspan="2"><p align="center">��Ŀ</p>
			</td>
			<td width="180" colspan="6"><p align="center">
					<textarea name="title" rows="3" cols="30"
						style="margin-right:0px;margin-left:0px"></textarea>
				</p>
			</td>
			<td width="66" colspan="3"><p align="center">����</p>
			</td>
			<td width="56"><p align="center">
					<select style="width:80px;margin-left:0px" name="type">
						<option value="-1" style="color:#c2c2c2;">-ѡ��-</option>
						<option value="����">����</option>
						<option value="����">����</option>
						<option value="�̲�">�̲�</option>
					</select>
				</p>
			</td>
			<td width="104" colspan="2"><p align="center">���</p>
			</td>
			<td width="83" >
				<p align="center">
					<select style="width:140px;margin-left:0px" name="class_">
						<option value="-1" style="color:#c2c2c2;">--��ѡ��--</option>
						<option value="����ѧ">����ѧ</option>
						<option value="��Ȼ��ѧ">��Ȼ��ѧ</option>
						<option value="����Ӧ��">����Ӧ��</option>
						<option value="����">����</option>
					</select>
				</p>
			</td>
		</tr>
		<tr>
			<td width="64" colspan="2"><p align="center">�걨��</p>
			</td>
			<td width="45" colspan="3"><p align="center">����</p>
			</td>
			<td width="73" ><p align="center"><input type="text" name="applier" />
				</p>
			</td>
			<td width="113" colspan="3"><p align="center">���ڵ�λ</p>
			</td>
			<td width="123" ><p align="center">
					<input type="text" name="department" />
				</p>
			</td>
			<td width="77" colspan="2"><p align="center">��ϵ�绰</p>
			</td>
			<td width="103" ><p align="center">
					<input type="text" name="telephone" />
				</p>
			</td>
		</tr>
		<tr>
			<td width="84" colspan="4" rowspan="4" valign="center"><p
					align="center">����</p>
				<p align="center">���������дȫ�����ߣ��ӵ�һ���߿�ʼ����</p>
			</td>
			<td width="93" valign="center" colspan="3"><p align="center">����
				</p>
			</td>
			<td width="179" valign="center" colspan="7"><p align="center">��λ
				</p>
			</td>
			<td width="244" valign="center" colspan="2"><p align="center">ְ��(��ʦ��ѧ��)
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
					<input type="radio" name="authJob1" value="��ʦ" checked />��ʦ <input
						type="radio" name="authJob1" value="ѧ��" />ѧ��
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
					<input type="radio" name="authJob2" value="��ʦ" />��ʦ <input
						type="radio" name="authJob2" value="ѧ��" />ѧ��
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
					<input type="radio" name="authJob3" value="��ʦ" />��ʦ <input
						type="radio" name="authJob3" value="ѧ��" />ѧ��
				</p>
			</td>
		</tr>
		<tr>
			<td width="45" rowspan="6" valign="center"><p align="center">����
				</p>
			</td>
			<td width="131" valign="center" colspan="4"><p align="center">������Ŀ������
				</p>
			</td>
			<td width="179" valign="center" colspan="5"><p align="center">
					<input type="text" name="fundName" />
				</p>
			</td>
			<td width="113" valign="center" colspan="3"><p align="center">������Ŀ����
				</p>
			</td>
			<td width="131" valign="center" colspan="3"><p align="center">
					<input type="text" name="fundId" />
				</p>
			</td>
		</tr>
		<tr>
			<td width="38" rowspan="3" valign="center"><p align="center">��
					��</p>
			</td>
			<td width="93" valign="center" colspan="3"><p align="center">��������
				</p>
			</td>
			<td width="179" valign="center" colspan="5"><p align="center">
					<input type="text" name="journal" />
				</p>
			</td>
			<td width="113" valign="center" colspan="3"><p align="center">�������</p>
			</td>
			<td width="131" valign="center" colspan="3">
				<p align="center">
					<select style="width:200px;margin-left:0px" name="publication">
						<option value="-1" style="color:#c2c2c2;">--��ѡ��--</option>
						<option value="����">����</option>
						<option value="����">����</option>

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
					align="center">����ʱ��</p>
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
			<td width="38" rowspan="2" valign="center"><p align="center">����
				</p>
			</td>
			<td width="93" valign="center" colspan="3"><p align="center">��������
				</p>
			</td>
			<td width="124" valign="center" colspan="4"><p align="center">
					<input type="text" name="conTitle" />
				</p>
			</td>
			<td width="55" valign="center"><p align="center">ʱ��</p>
			</td>
			<td width="113" valign="center" colspan="3"><p align="center">
					<input type="text" name="conTime" />
				</p>
			</td>
			<td width="48" valign="center" colspan="2"><p align="center">�ص�
				</p>
			</td>
			<td width="82" valign="center"><p align="center">
					<input type="text" name="conPlace" />
				</p>
			</td>
		</tr>
		<tr>
			<td width="93" valign="center" colspan="3"><p align="center">���쵥λ
				</p>
			</td>
			<td width="124" valign="center" colspan="4"><p align="center">
					<input type="text" name="host" />
				</p>
			</td>
			<td width="169" valign="center" colspan="4"><p align="center">���ļ���ʽ�����(ISBN)
				</p>
			</td>
			<td width="131" valign="center" colspan="3"><p align="center">
					<input type="text" name="publishNum" />
				</p>
			</td>
		</tr>
		<tr>
			<td width="84" colspan="2" rowspan="2" valign="center"><p
					align="center">����(�̲�)</p>
			</td>
			<td width="93" valign="center" colspan="3"><p align="center">����������
				</p>
			</td>
			<td width="124" valign="center" colspan="4"><p align="center">
					<input type="text" name="publiser" />
				</p>
			</td>
			<td width="169" valign="center" colspan="4"><p align="center">������(ǧ��)
				</p>
			</td>
			<td width="131" valign="center" colspan="3"><p align="center">
					<input type="text" name="sumWord" />
				</p>
			</td>
		</tr>
		<tr>
			<td width="93" valign="center" colspan="3"><p align="center">���(ISBN)
				</p>
			</td>
			<td width="124" valign="center" colspan="4"><p align="center">
					<input type="text" name="bookNum" />
				</p>
			</td>
			<td width="169" valign="center" colspan="4"><p align="center">�����������(ǧ��)
				</p>
			</td>
			<td width="131" valign="center" colspan="3"><p align="center">
					<input type="text" name="myWord" />
				</p>
			</td>
		</tr>
		<tr>
			<td width="602" valign="center" colspan="16"><p align="center">ժҪ
				</p>
			</td>
		</tr>
		<tr>
			<td width="602" valign="top" colspan="16"><p>
					<%
						String value = "Ckeditor����";
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
			<td width="92" valign="center" colspan="3"><p align="center">�걨��ǩ��
				</p>
			</td>
			<td width="129" valign="center" colspan="3"><p align="center">&nbsp;</p>
			</td>
			<td width="380" valign="center" colspan="10"><p align="center">���ڵ�λ��ˣ�&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;�����£�
				</p>
			</td>
		</tr>
	</table>
</body>
</html>