<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<div align = "center">
	<div>
		<h1>로그인</h1>
	</div>
	<div>
		<form id="frm" action="memberlogin.do" method="post">
			<div>
				<table>
					<tr height="50">
						<th width="150">아이디</th>
						<td width="250" >
							<input type="text" id="memberId" name="memberId" >
						</td>
					</tr>
					<tr height="50">
						<th>패스워드</th>
						<td><input type="password" id="memberPassword" name="memberPassword"></td>
					</tr>
				</table>
			</div><br>
			<div>
				<input type="submit" value="로그인">&nbsp;&nbsp;&nbsp;
				<input type="reset" value="취소">
			</div>
		</form>
	</div>
</div>
</body>
</html>