<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h1>write_content_page</h1>


<form action="${pageContext.request.contextPath }/content/write_content_process.do" method="get">
	작성자 : 
	<br>
	제목 : 
	<input type="text" name="JET_board_free_title">
	<br>
	내용 : <br>
	<textarea rows="10" cols="60" name="JET_board_free_content"></textarea> <br>
	<input type="submit" value="글 쓰기">
</form>

</body>
</html>