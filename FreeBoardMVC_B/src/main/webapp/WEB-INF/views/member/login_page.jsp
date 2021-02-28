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
<h1>login Page</h1>

	<form action="${pageContext.request.contextPath }/member/login_process.do" method="post">
		ID : <input type="text" name="JET_member_id"><br>
		PW : <input type="password" name="JET_member_pw"><br>
		<input type="submit" value="LOGIN">
	</form>




<a href="${pageContext.request.contextPath }/member/join_member_page.do">회원가입</a>


</body>
</html>