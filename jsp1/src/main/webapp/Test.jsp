<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    
<%!
// 선언문 - 변수, 메서드 선언, 클래스정의
int age = 25;
int[] arr = new int[]{10,20,30,40,50,60};
%>
<% 
// 스크립틀릿 
age =25;

%>
<%= 
// 출력용 
age
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<h1> <%=age %></h1>
	
	<ul> 
	 	<%
	 	for(int i=0;i<arr.length;i++){
	 		//out.print("<li>"+arr[i]+"</li>");
	 	
	 	%>
	 	<il> <%=arr[i] %></il>
	 	
	 	<% } %>
	</ul>
	
	
	
	
	
	
	
</body>
</html>