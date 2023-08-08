<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div align="center">
		<div>
			<h1>글 등 록</h1>
		</div>
		<div>
			<form id="frm" action="noticeinsert.do" method="post"
				enctype="multipart/form-data">
				<div>
					<table>
						<tr>
							<td>&nbsp;</td>
							<th width="100">글작성자</th>
							<td width="300"><input type="text" id="noticeWriter"
								name="noticeWriter" value="${name }" readonly="readonly"></td>

							<th width="100">작성일자</th>
							<td width="300"><input type="date" id="noticeDate"
								name="noticeDate" required></td>
							<td>&nbsp;</td>
						</tr>
						<tr height="1" bgcolor="#dddddd">
							<td colspan="5"></td>
						</tr>
						<tr>
							<td>&nbsp;</td>
							<th>글제목</th>
							<td colspan="3"><input type="text" id="noticeTitle"
								name="noticeTitle" size="78" maxlength="100"></td>
							<td>&nbsp;</td>
						</tr>
						<tr height="1" bgcolor="#dddddd">
							<td colspan="5"></td>
						</tr>
						<tr>
							<td>&nbsp;</td>
							<th>글내용</th>
							<td colspan="3"><textarea id="noticeSubject" name="noticeSubject"
									cols="80" rows="15"></textarea></td>
							<td>&nbsp;</td>
						</tr>
						<tr height="1" bgcolor="#dddddd">
							<td colspan="5"></td>
						</tr>
						<tr>
							<td>&nbsp;</td>
							<th>첨부파일</th>
							<td colspan="3"><input type="file" id="file" name="file"></td>
							<td>&nbsp;</td>
						</tr>
						<tr height="1" bgcolor="#dddddd">
							<td colspan="5"></td>
						</tr>
					</table>
				</div>
				<br>
			<div>
				<input type="submit" value="작성">&nbsp;&nbsp;&nbsp;
				<input type="button" value="취소" onclick="history.back(-1);">
			</div>
		</form>
	</div>
</div>
</body>
</html>