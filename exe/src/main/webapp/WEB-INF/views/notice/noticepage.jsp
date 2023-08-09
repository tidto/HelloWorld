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
						onclick ="selectNotice(${n.noticeId })"
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
				<option value="title" id="key">제목</option>
				<option value="writer" id="key">작성자</option>
				<option value="subject" id="key">내용</option>
			</select>
			<input type="text" id="val" name="val" placeholder="Type to Search"/>
			<input type="button" value=" 검 색 " onclick="searchList()"/>
		</form>
	</div>
	<div id ="add">
		<c:if test = "${not empty id }">
		<button type="button" id="btn" onclick="location.href='noticeadd.do'">게시글 작성</button>
		</c:if>
	</div><br>
	<div>
		<form id="noticefrm" action="noticepost.do" method="post">
			<input type="hidden" id="noticeId" name="noticeId">
		</form>
	</div>
</div>
<script type="text/javascript">
	function selectNotice(n){
		document.getElementById("noticeId").value = n;
		document.getElementById("noticefrm").submit();
	}
	function searchList(){
		//ajax를 이용해 검색결괄르 가져오고 화면을 구성
		let key = document.getElementById("key").value;
		let val = document.getElementById("val").value;
		let payload = "key="+key+"&val="+val;
		let url = "ajaxnoticesearch.do"
		
		fetch(url,{
			method:"POST",
			headers:{	
			"Content-Type" : "application/x-www-form-urlencoded",
			},		
			body: payload
		}).then(response => response.json())
		.then(json => htmlConvert(json));	
	}
	function htmlConvert(datas){
		document.querySelector("tbody").remove();
		const tbody = document.createElement("tbody");
		// tbody data 추가 
		tbody.innerHTML = datas.map(data=>htmlView(data)).join("");
		// table tbody 추가
		document.querySelector("table").appendChild(tbody);
	}
	function htmlView(data){
		return `
			<tr height = "35" 
				onmouseover="this.style.background='#dbcdf7'" 
				onmouseout="this.style.background='#ffffff'"
				onclick ="selectNotice(\${data.noticeId })"
			>
				<td align = "center">\${data.noticeId }</td>
				<td align = "left">\${data.noticeTitle }</td>
				<td align = "center">\${data.noticeWriter }</td>
				<td align = "center">\${data.noticeDate }</td>
				<td align = "right">\${data.noticeHit }</td>
			</tr>			
		`;
	}
	
	
</script>

</body>
</html>