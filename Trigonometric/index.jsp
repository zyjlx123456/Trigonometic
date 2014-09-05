<!--   w w w  . j a v a  2  s .  c o m-->
<!DOCTYPE HTML>
<html>
<head>
<script>
function drawInner(context, startX, startY, trunkWidth, level){
if (level < 12) {
var changeX = 150 / (level + 1);
var changeY = 150 / (level + 1);

var topRightX = startX +  changeX;
var topRightY = startY -  changeY;

var topLeftX = startX - changeX;
var topLeftY = startY -  changeY;

context.beginPath();
context.moveTo(startX - trunkWidth / 4, startY);
context.quadraticCurveTo(startX - trunkWidth / 4, startY -
trunkWidth, topLeftX, topLeftY);
context.lineWidth = trunkWidth;
context.lineCap = "round";
context.stroke();

drawInner(context, topLeftX, topLeftY, trunkWidth * 0.7, level + 1);
}
}

window.onload = function(){
canvas = document.getElementById("myCanvas");
context = canvas.getContext("2d");

drawInner(context, canvas.width , canvas.height, 50, 0);
};
</script>
</head>
<body>
<canvas id="myCanvas" width="600" height="500" style="border:1px solid black;">
</canvas>
</body>
</html>