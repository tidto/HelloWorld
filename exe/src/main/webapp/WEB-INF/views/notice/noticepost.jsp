<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
	.pst{
		width: 1000px;
		margin: 0 auto;
	}
	.col{
		background-color: #e4f7e1;
	}
	.R{
		float: right;
		margin-left: 3px; 
	}
	.L{
		float: left;
		margin-right: 3px;
	}
	#patch{
		float: left;
		border-radius: 10px;
		font-weight: bold;
	}
	#backlist{
		float: right;
		border-radius: 10px;
		}
	#mainpost{
		background-color: #e4f7e1;
	}
</style>
</head>
<body>
<div align="center" class ="pst">
		<div class = "col">
			<div class = "L">
				<h2>제목|${n.noticeTitle }</h2>
				<h3>${n.noticeWriter }님</h3>
			</div>
			<div class = "R">
				${n.noticeAttech }
			</div>
		</div>
		<div>
			<div class = "L">
				<h3>${n.noticeDate }</h3>
			</div>
			<div class = "R" >
				<h3>${n.noticeHit }</h3>
			</div>
		</div>
		<div id="mainpost">
			<textarea rows="20" cols="80" id="noticeSubject" name="noticeSubject">
			${n.noticeSubject }</textarea>
		</div>
	<br>
	<c:if test="${name eq n.noticeWriter }">
	<div id ="patch">
		<button type="button" id="btn" onclick="noticeUpdate('E')">수정</button>&nbsp;&nbsp;&nbsp;
		<button type="button" id="btn" onclick="noticeUpdate('D')">삭제</button>
	</div>
	</c:if>
		<div id="backlist">
			<input type="button" value="목록" onclick="history.back(-1);">
		</div>
		<div>
		<form id="frm" method="post">
			<input type="hidden" id="noticeId" name="noticeId" value="${n.noticeId }">
		</form>
		</div><br>
</div>
<script type="text/javascript">
	function noticeUpdate(str){
		if(str == 'E'){
			document.getElementById("frm").action = "noticeeditform.do";
		}else{
			document.getElementById("frm").action = "noticedelete.do";
		}
		document.getElementById("frm").submit;
	}
		
		
</script>
</body>
</html>