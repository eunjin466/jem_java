<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>LOVE</title>

<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.11.3/font/bootstrap-icons.min.css">
<link rel= "icon" href="./static/images/love.ico">
<link rel="stylesheet" href="./static/css/default.css" />
<link rel="stylesheet" href="./static/css/main.css" />

</head>
<body>
	<div id ="wrap">
	
	<%@ include file="./header.jsp" %>
	 <div id="main">
	 	<div id ="slide-wrap">
	 		<div class="slide-img">
	 			<img src="https://picsum.photos/1000/400? random=1">
	 		</div>
	 		<p>
	 		<p class="arrow">
	 			<span class="arrow-left">
	 			<i class="bi bi-arrow-bar-left"></i>
	 			</span>
	 			<span class="arrow-right">
	 			<i class="bi bi-arrow-bar-right"></i>
	 			</span>
	 		</p>
	 	</div>
	 <div id="content-wrap">
	 	<img src="https://picsum.photos/300/300?random=2">
	 	<img src="https://picsum.photos/300/300?random=3">
	 	<img src="https://picsum.photos/300/300?random=4">
	 	<img src="https://picsum.photos/300/300?random=5">
	 	<img src="https://picsum.photos/300/300?random=6">
	 	<img src="https://picsum.photos/300/300?random=7">
	 	<img src="https://picsum.photos/300/300?random=8">
	 	<img src="https://picsum.photos/300/300?random=9">
	 	<img src="https://picsum.photos/300/300?random=10">
	  </div>
</div>
	 
	<%@ include file="./footer.jsp" %>
</div> 
</body>
</html>