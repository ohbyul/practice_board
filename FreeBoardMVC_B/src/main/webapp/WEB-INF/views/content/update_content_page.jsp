<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h1>update_content_page</h1>
	<form action="${pageContext.request.contextPath }/content/update_content_process.do" method="post">
		작성자 : ${result.memberVo.JET_member_nick } <br>
		제목 : 
		<input type="text" name="JET_board_free_title" value="${result.contentVo.JET_board_free_title } "><br>
		내용 : <br>
		<textarea rows="10" cols="60" name="JET_board_free_content">${result.contentVo.JET_board_free_content }</textarea> <br>
		<input type="hidden" name="JET_board_free_no" value="${result.contentVo.JET_board_free_no }"> <br>
		<input type="submit" value="글  수정">
	</form>
	
	
	
</body>
</html>