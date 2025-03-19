<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="EUC-KR"%>
    
   <%-- singin.jsp --%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.11.3/font/bootstrap-icons.min.css">

<link rel= "icon" href="http://localhost:8080/jsp2/static/images/love.ico">
<link rel="stylesheet" href="http://localhost:8080/jsp2/static/css/default.css" />
<link rel="stylesheet" href="http://localhost:8080/jsp2/static/css/signin.css">
<script src="http://localhost:8080/jsp2/static/javascript/signin.js" ></script>
<title>login</title>
</head>
<body>
	<div id= "wrap">
		<%@ include file="../header.jsp" %>
		
		<div id="main">
			<h2 class="page-title">�α���</h2>
			<p class="love-word">
			 	������� �Ѱ��� ��Ģ�ۿ� ���� <br>
			 	�װ��� ����ϴ� �����<br>
			 	�ູ�ϰ� ����� ���̴�.
			</p>
			<div id="formWrap">
				<form id="fm" name="fm" role="form" method="post" action="signin">
					<div class="input-field">
						<label>���̵�</label>
						<input type="text" name="userId" id="userId">
					</div>
					<div class="input-field">
						<label>��й�ȣ</label>
						<input type="password" name="userPw" id="userPw">
					</div>
					<div class="form-bt">
						<button class="signIn-bt">�α���</button>
					</div>
				</form>
			</div>
			<div id="forgetAndJoin">
				<div class="forget"> ���̵� / ��й�ȣ ã��</div>
				<div class="join">ȸ������</div>
			</div>
			
			<p>
				�ʹۿ� ��� �� ����Ѱ� �ƴ϶� <br>
				�� ����ϴ� ���� �ʹۿ� ������.
			</p>
		
		</div>
		
		
		<%@ include file="../footer.jsp" %>
	</div>

</body>
</html>