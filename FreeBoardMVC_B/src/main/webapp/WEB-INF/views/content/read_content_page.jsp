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
<h1>read_content_page</h1>

	제목 :  ${result.contentVo.JET_board_free_title} <br>
	작성자 :  ${result.memberVo.JET_member_nick} <br>
	조회수 : ${result.contentVo.JET_board_free_readcount }<br>
	작성일 : ${result.contentVo.JET_board_free_writedate }<br>
	내용 : ${result.contentVo.JET_board_free_content }<br>
	<br>
	
	<c:if test="${!empty sessionUser && sessionUser.JET_member_no ==result.contentVo.JET_member_no }">
		<button type="button" name="likebutton">좋아요👍</button>
	</c:if>

	<br>
	
	<a href="${pageContext.request.contextPath }/content/main_page.do">목록으로</a>	
	
	<c:if test="${!empty sessionUser && sessionUser.JET_member_no ==result.contentVo.JET_member_no }">
		<a href="${pageContext.request.contextPath }/content/delete_content_process.do?JET_board_free_no=${result.contentVo.JET_board_free_no}">
		삭제</a>
		<a href="${pageContext.request.contextPath }/content/update_content_page.do?JET_board_free_no=${result.contentVo.JET_board_free_no}">
		수정</a>
	</c:if>
	<br>
	
	
	 	<table border="2">
 			<tr>
 				<td>리플 번호</td>
 				<td>내용</td>
 				<td>작성자</td>
 				<td>작성일</td>
 			</tr>
 			
 			<c:forEach items="${reple }" var="reple">
	 			<tr>
	 				<td>${reple.repleVo.JET_board_free_reple_no }</td>
	 				<td>${reple.repleVo.JET_board_free_reple_content }</td>
	 				<td>${reple.memberVo.JET_member_nick }</td>
	 				<td>${reple.repleVo.JET_board_free_reple_writedate }</td>
	 			</tr>
 			</c:forEach>
 			
 		</table>
 		
 	<c:if test="${!empty sessionUser && sessionUser.JET_member_no ==result.contentVo.JET_member_no }">
	 	<form action="${pageContext.request.contextPath }/content/write_reple_process.do" method="post">
			댓글 달기 : <br>
			<textarea rows="5" cols="60" name="JET_board_free_reple_content"></textarea><br>
			<input type="hidden" name="JET_board_free_no" value="${result.contentVo.JET_board_free_no }">
			<input type="hidden" name="JET_member_no" value="${sessionUser.JET_member_no }">
			<input type="submit" value="댓글쓰기">
	 	</form>
	</c:if>
	
</body>
</html>