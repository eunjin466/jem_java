<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="EUC-KR"%>

<%-- header.jsp --%>

<div id="header">
	<div id="nav">
		<div class="top left">
			<ul  class="menu-list">
				<li class="menu"><a href="/">HOME</a></li>
				<li class="menu"><a href="/jsp2/board/list">���갡 �����ΰ���</a></li>
				<li class="menu">�սô� ����</li>
				<li class="menu">������˰��ƴ��ݾ�</li>
				<li class="menu">Ư��Ī���̾�</li>
					
			</ul>
		</div>
		<%
			String user = (String) session.getAttribute("user");

		%>
		<div class="top right">
			<% if(user != null){ %>
				<b><%=user %></b>
				
			<%}else{%>
			
			<div class="login-wrap"> 
				<a href="/jsp2/signin" class="login-bt">����α���</a>
			</div>
			<% } %>
		</div>
	</div>
</div>