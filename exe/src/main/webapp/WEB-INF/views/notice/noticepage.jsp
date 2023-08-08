<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
	.page{
		width: 1000px;
		margin: 0 auto;
	}

	thead{
		background-color: #dbcdf7;
		
	}
	th{
		padding: 0;
	}	
	#sch{
		float: left;
		
	}
	#add{
		float: right;
	}
	
</style>
</head>
<body>
<div align = "center" class="page">
	<div>
		<h1> 게  시  판 </h1>
	</div>
	<div>
		<table>
			<thead>
				<tr height = "50">
					<th width = "50">No.</th>
					<th width = "500">TITLE</th>
					<th width = "100">WRITER</th>
					<th width = "200">DATE</th>
					<th width = "50">HIT</th>
				</tr>
			</thead>
			<tbody>
				<c:if test ="${not empty notices}">
				<c:forEach items = "${notices }" var = "n">
					<tr height = "35" 
						onmouseover="this.style.background='#dbcdf7'" 
						onmouseout="this.style.background='#ffffff'"
						onclick ="selectNotice()"
					>
						<td align = "center">${n.noticeId }</td>
						<td align = "left">${n.noticeTitle }</td>
						<td align = "center">${n.noticeWriter }</td>
						<td align = "center">${n.noticeDate }</td>
						<td align = "right">${n.noticeHit }</td>
					</tr>
				</c:forEach>
				</c:if>
				<c:if test ="${empty notices}">
					<tr>
						<td colspan = "6" align ="center"> NO HOT NEWS</td>
					</tr>
				</c:if>
			</tbody>
		</table>
	</div><br>
	<div id ="sch">
		<form id="frm" method="post">
			<select id="key" name="key">
				<option value="title">제목</option>
				<option value="writer">작성자</option>
				<option value="subject">내용</option>
			</select>
			<input type="text" id="val" name="val" placeholder="Type to Search"/>
			<input type="button" value=" 검 색 " onclick="search"/>
		</form>
	</div>
	<div id ="add">
		<c:if test = "${not empty id }">
		<button type="button" id="btn" onclick="location.href='noticeadd.do'">게시글 작성</button>
		</c:if>
	</div><br>
	<div>
		<form id="noticefrm" action="noticeselect.do" method="post">
			<input type="hidden" id="noticeId" name="noticeId">
		</form>
	</div>
</div>
<script type="text/javascript">
	function selectNotice(n){
		document.getElementById("noticeId").value = n;
		document.getElementById("noticefrm").submit();
	}
	
</script>

</body>
</html>