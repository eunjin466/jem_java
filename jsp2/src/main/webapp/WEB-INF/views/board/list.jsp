
<%@page import="DTO.Board"%>
<%@page import="java.util.ArrayList"%>
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
<title> �Խ��� </title>
<script src="https://code.jquery.com/jquery-3.7.1.js" integrity="sha256-eKhayi8LEQwp4NKxN+CfCh+3qOVUtJn3QNZ0TciWLP4=" crossorigin="anonymous"></script>
</head>
<style>
	#main{
		padding: 30px 100px;
		position: relative;
	}
	#boardTop{
		position: relative;
		width:  100%;
		font-size: 20px;
		text-align: center;
	}
	#boardTop .write-bt{
		position: absolute;
		top: 0; right: 0;
	}
	#boardList{
		width: 100%;
		margin: 20px 0;
	}
	#boardList .list-table{
		width: 100%;
		border-collapse: collapse;
	}
	#boardList .list-table td{
		border-bottom: 1px soild #ccc;
		padding: 15px 0;
		font-size: 17px;
	}
	#boardList .list-table .num{
		width: 10%;
	}
	#boardList .list-table .title{
		width: 40%;
	}
	#boardList .list-table .write{
		width: 25%;
	}
	#boardList .list-table .date{
		width: 25%;
	}
	#boardList .list-table tbody tr:nth-child(odd){ /* odd Ȧ��, even ¦��*/
		background:#eee;
		
		
	
	}
	
</style>
<body>
	<div id="wrap">
      <%@ include file="../header.jsp" %>
      
      <%
      ArrayList<Board> list = (ArrayList<Board>) request.getAttribute("boardList");
      %>
      
      
      
      
      <div id="main">
         <div id="boardTop">
            <b>���갡 �����̿�</b>
            <a href = "/jsp2/board/write" class="write-bt">�۾���</a>
         </div>
         <div id = "boardList">
         		<div>
         			�˻� : <input type = "text" id="keyword">
         		</div>
            <table class="list-table">
               <thead>
                  <tr>
                     <th class="num">��ȣ</th>
                     <th class="title">����</th>
                     <th class="writer">�ۼ���</th>
                     <th class="date">�ۼ���</th>
                  </tr>
               </thead>
               <tbody id="dataList">
          <%
              for(Board board : list){
          %>     
                  <tr>
                     <td class="num"><%=board.getBoardId() %></td>
                     <td class="title"><%=board.getTitle() %></td>
                     <td class="writer"><%=board.getWriter() %></td>
                     <td class="date"><%=board.getWriteDate() %></td>
                  </tr>
         <% } %>
               </tbody>
               
            </table>
         </div>
      </div>
                              
      <%@ include file="../footer.jsp" %>
   </div>
</body>
</html>
<script>
	$("#keyword").on("keyup",function(){
		var key = $(this).val();
		$("#dataList tr").filter(function(){
			$(this).toggle( $(this).text().indexOf(key) > -1 )
		});
	});

</script>
