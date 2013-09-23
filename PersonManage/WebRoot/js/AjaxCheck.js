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
			var text=ajax.responseText;
			if(text=="no")	flag="no";
			else	flag="yes";			
		}
	}
	// 发送请求
	ajax.send(null);
	if(flag!=null){
		if(flag=="no") return false;
		else return true;
	}
	else return  false;
}