<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h1>main_page</h1>


<c:choose>
	<c:when test="${!empty sessionUser }">
		[${sessionUser.JET_member_nick }] 님 환영합니다. <br>
		<a href="${pageContext.request.contextPath }/member/logout_process.do">로그아웃</a>
	</c:when>
	<c:otherwise>
		비회원입니다.<br>
		<a href="${pageContext.request.contextPath }/member/login_page.do">로그인</a>
	</c:otherwise>
</c:choose>
<br>

<table border="2">
	<tr>
		<td>글번호</td>
		<td>제목</td>
		<td>조회수</td>
		<td>글쓴이</td>
		<td>작성일</td>
	</tr>
 	
	<c:forEach items="${resultList }" var="data">
		<tr>
			<td>${data.contentVo.JET_board_free_no }</td>
			<td><a href="${pageContext.request.contextPath }/content/read_content_page.do?JET_board_free_no=${data.contentVo.JET_board_free_no}">
				${data.contentVo.JET_board_free_title }</a></td>
			<td>${data.contentVo.JET_board_free_readcount }</td>
			<td>${data.memberVo.JET_member_nick }</td>
			<td>${data.contentVo.JET_board_free_writedate }</td>
		</tr>
	</c:forEach>

</table>

<c:if test="${!empty sessionUser }">
	<a href="${pageContext.request.contextPath }/content/write_content_page.do">글쓰기</a>
</c:if>

</body>
</html>