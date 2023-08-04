<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>   
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<jsp:include page="../layout/header.jsp"/>
<body>
<h1> NOTICE LIST </h1>
<div align="center">
	<div><h1> 공지목록 </h1></div>
	<div>
		<table border="1">
			<thead>
				<tr>
					<th width="100">게시판순번</th>
					<th width="100">작성자</th>
					<th width="100">제목</th>
					<th width="100">내용</th>
					<th width="200">작성일자</th>
					<th width="300">조회수</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${notices }" var="n">
					<tr>
						<td align="center">${n.boardId }</td>
						<td align="center">${n.boardWriter }</td>
						<td align="center">${n.memberName }</td>
						<td align="center">${n.boardSubject }</td>
						<td align="center">${n.boardDate }</td>
						<td>${n.boardHit }</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
</div>
</body>
</html>