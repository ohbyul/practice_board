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

<h1>join_member_page</h1>
	<form action="${pageContext.request.contextPath }/member/join_member_process.do" method="post">
		ID : <input type="text" name="JET_member_id"><br>
		PW : <input type="password" name="JET_member_pw"><br>
		NAME : <input type="text" name="JET_member_name"><br>
		NICK : <input type="text" name="JET_member_nick"><br>
		연락처 : <input type="text" name="JET_member_phone"> <br>
		KAKAO : <input type="text" name="JET_member_kakao"><br>
		<input type="hidden" name="JET_member_grade" value="1">
		<input type="hidden" name="JET_member_credit" value="1">
		<input type="submit" value="JOIN">
	</form>

</body>
</html>