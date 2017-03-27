<%@ page  contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta content="text/html; charset=utf-8">
<title>我是黄鹤</title>
<script  src="js/dwr/util.js"></script>
<script  src="js/dwr/engine.js"></script>
<script  src="js/dwr/interface/ServicePush.js"></script>
<script  src="js/jQuery/jquery-1.11.1.js"></script>
</head>
<script type="text/javascript">
	window.onload = function() {
		//开启反转
		dwr.engine.setActiveReverseAjax(true);
		console.log(dwr.engine);
		var sign = document.getElementById("sign");
		sign.onclick = function() {
			console.log("fuck");
			var msg = document.getElementById("msg").value;
			//var dwrmsg=dwr.util.getVlaue("msg");
			console.log(msg);
			ServicePush.Send(msg, callBack);
			console.log('onload');
			//alert($("msg").val());
		}
	};

	function callBack(data) {
		var text = document.getElementById("ul");
		var message = text.innerHTML;
		console.log("msg:" + message);
		if (data != null) {
			text.innerHTML = message + "</br>" + data;
		}
		msg.value = " ";
	}
</script>
<body>
	<ul id="ul" style="color: red; font-size: 60px"></ul>
	<input type="text" name="msg" id="msg" size="30"
		style="height: 60px; font-size: 35px" />
	<input type="button" id="sign" value="发布" />
</body>
</html>