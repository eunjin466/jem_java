<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="EUC-KR"%>
    
   <%-- templates.jsp --%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.11.3/font/bootstrap-icons.min.css">

<link rel= "icon" href="http://localhost:8080/jsp2/static/images/love.ico">
<link rel="stylesheet" href="http://localhost:8080/jsp2/static/css/default.css" />
<title>글쓰기</title>
</head>
<style>
	#main{
		padding: 0 200px 50px 200px;
	}
	#headLine{
		text-align: center;
		font-size: 25px;
		font-style: italic;
	}
	#writeWrap{
		width:100%;
		border: 2px soild #ddd;
		border-radius:7px;
		box-shadow: 30px 3px 50px #999;
		padding: 20px;
		margin-top: 25px;
	}
	#writeWrap .input-field{
		display: flex;
		align-items: center;
		margin-bottom: 10px;
		}
	#writeWrap .input-field label{
		width: 25%;
		padding-right: 10px;
	}
	#writeWrap .input-field input{
		width: 75%;
		border: 0;
		border-bottom: 1px solid #aaa;
		outline:none;
		font-size: 20px;
		padding: 7px 10px;
		
	}
	#writeWrap .input-field textarea{
		width: 75%;
		height: 250px;
		resize: none;
		padding: 10px;
		font-size: 17px;
	}
	#writeWrap .write-bt{
		display: black;
		width: 100%;
		padding: 10px 0;
		text-align: center;
		cursor: pointer;
		border: 0;
		background: pink;
		font-weight: 800;
		border-radius: 7px;
		margin:15px 0;
	}
	

</style>
<body>
	<div id= "wrap">
		<%@ include file="../header.jsp" %>
			<div id="main">
				<div id="headLine">
					총 쏘는것보다 어렵고<br>
					그보다 더 위험하고 <br>
					그보다 더 뜨거워야 하오<br>
				</div>
				<div id="writeWrap">
					<form method="get" action="/jsp2/board/save">
						<div class="input-field">
							<label for="writer">작성자</label>
							<input type="text" name="writer" id="writer">
						</div>
						<div class="input-field">
							<label for="title">제목</label>
							<input type="text" name="title" id="title">
						</div>
						<div class="input-field">
							<label for="content">내용</label>
							<textarea name="content" id="content"></textarea>
						</div>
						<button>
							내 마음속에 저장
						</button>
					</form>
				</div>
			</div>
		
		
		<%@ include file="../footer.jsp" %>
	</div>

</body>
</html>