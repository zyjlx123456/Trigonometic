<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>trigonometric</title>

<link rel="stylesheet" type="text/css"
	href="./../resource/css/mycss.css" />
<script src="./../resource/js/jquery.js"></script>
<style type="text/css">
#title {
	font-size: 60px;
	text-align: center;
	margin-top: 5%;
	margin-bottom: 5%;
}

#canvasdemo {
	margin-top: 5%;
	margin-left: 25%;
	margin-bottom: 5%;
}
</style>
</head>
<body>
	<div id="title">三角形角边关系</div>
	<div id="left" style="float: left; width: 60%">
		<canvas id="canvasdemo" height="300px"></canvas>
	</div>
	<div id="right">123</div>
	<div id="bottom">456</div>
</body>
<script>
	window.onload = function() {
		var canvas = document.getElementById("canvasdemo");

		var ax=0;
		var ay=0;
		var bx=0;
		var by=150;

		var dx=bx-ax
		var dy=by-ay;
		var dangle = Math.atan2(dy, dx) - Math.PI / 3;
		var sideDist = Math.sqrt(dx * dx + dy * dy);

		var cx = Math.cos(dangle) * sideDist + ax;
		var cy =  Math.sin(dangle) * sideDist + ay;

		var ctx = canvas.getContext('2d');

		ctx.beginPath();  
		ctx.moveTo(ax,ay);  
		ctx.lineTo(bx,by);  
		ctx.lineTo(cx,cy);  

		ctx.fill(); 

	}
</script>
</html>