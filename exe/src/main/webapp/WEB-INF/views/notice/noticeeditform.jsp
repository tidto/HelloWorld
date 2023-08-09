<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div>
		<h1>글 수 정</h1>
	</div>
	<div>
		<form id="frm" action="noticeedit.do" method="post"
			enctype="multipart/form-data">
			<div>
			<table>
				<tr>
					<td>&nbsp;</td>
					<th width="100">글작성자</th>
					<td width="300"><input type="text" id="noticeWriter"
						name="noticeWriter" value="${n.noticeWriter }" readonly="readonly"></td>

					<th width="100">작성일자</th>
					<td width="300"><input type="date" id="noticeDate"
						name="noticeDate" value="${n.noticeDate }"></td>
					<td>&nbsp;</td>
				</tr>
				<tr height="1" bgcolor="#dddddd">
					<td colspan="3"></td>
				</tr>
				<tr>
					<td>&nbsp;</td>
					<th>글제목</th>
					<td colspan="3"><input type="text" id="noticeTitle"
						name="noticeTitle" value="${n.noticeTitle }" size="78"
						maxlength="100"></td>
					<td>&nbsp;</td>
				</tr>
				<tr height="1" bgcolor="#dddddd">
					<td colspan="5"></td>
				</tr>
				<tr>
					<td>&nbsp;</td>
					<th>글내용</th>
					<td colspan="3"><textarea rows="15" cols="80"
							id="noticeSubject" name="noticeSubject">
		${n.noticeSubject }</textarea></td>
					<td>&nbsp;</td>
				</tr>
				<tr height="1" bgcolor="#dddddd">
					<td colspan="3"></td>
				</tr>
				<tr>
					<td>&nbsp;</td>
					<th>첨부파일</th>
					<td>{n.noticeAttech }</td>
					<td colspan="2"><input type="file" id="file" name="file"
						value="${n.noticeAttech }"></td>
					<td>&nbsp;</td>
				</tr>
				<tr height="1" bgcolor="#dddddd">
					<td colspan="5"></td>
			</table>
			</div><br>
			<div>
			<input type="submit" value="수정"> <input type="button"
				onclick="location.href='noticepage.do'" value="취소">
			</div>
			<div>
				<input type="hidden">
			</div>
		</form>
	</div>
</body>
</html>