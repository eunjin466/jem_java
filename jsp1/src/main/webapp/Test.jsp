<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    
<%!
// ���� - ����, �޼��� ����, Ŭ��������
int age = 25;
int[] arr = new int[]{10,20,30,40,50,60};
%>
<% 
// ��ũ��Ʋ�� 
age =25;

%>
<%= 
// ��¿� 
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