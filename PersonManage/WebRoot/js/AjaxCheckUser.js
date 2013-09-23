// 创建XMLHttpRequest对象
function GetO() {
	var ajax = false;
	try {
		ajax = new ActiveXObject("Msxml2.XMLHTTP");
	} catch (e) {
		try {
			ajax = new ActiveXObject("Microsoft.XMLHTTP");
		} catch (E) {
			ajax = false;
		}
	}
	if (!ajax && typeof XMLHttpRequest != 'undefined') {
		ajax = new XMLHttpRequest();
	}
	return ajax;
}

function getMyHTML(serverPage) {
	var ajax = GetO();
	var flag=null;
	ajax.open("post", serverPage,false);
	ajax.onreadystatechange = function() {
		if (ajax.readyState == 4 && ajax.status == 200) {			
			   flag=ajax.responseText;
		}
	}
	// 发送请求
	ajax.send(null);
	return flag;
}