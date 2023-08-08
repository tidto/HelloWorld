<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
	th{
		background-color: #c0edd4;
	}
</style>
</head>
<body>
	<div align="center">
		<div>
			<h1>회 원 가 입</h1>
		</div>
		<div>
			<form id="frm" action="memberjoin.do" onsubmit="return formCheck()" method="post" enctype="multipart/form-data">
				<div>
					<table border="1">
						<tr height="50">
							<th width="150">아이디*</th>
							<td width="280">
								<input type="text" id="memberId" name="memberId" required="required">&nbsp;&nbsp;
								<button type="button" id="btn" value="No" onclick="idCheck()">중복체크</button>
							</td>
						</tr>
						<tr height="50">
							<th>패스워드*</th>
							<td><input type="password" id="memberPassword"
								name="memberPassword" required="required"></td>
						</tr>
						<tr height="50">
							<th>패스워드 확인*</th>
							<td><input type="password" id="passwordCheck"
								required="required"></td>
						</tr>
						<tr height="50">
							<th>이 름</th>
							<td><input type="text" id="memberName" name="memberName">
							</td>
						</tr>
						<tr height="50">
							<th>연락처</th>
							<td><input type="tel" id="memberTel" name="memberTel">
							</td>
						</tr>
						<tr height="50">
							<th>주 소</th>
							<td><input type="text" id="memberAddress"
								name="memberAddress"></td>
						</tr>
						<tr height="50">
							<th>사 진</th>
							<td><input type="file" id="file" name="file"></td>
						</tr>
					</table>
				</div>
				<br>
				<div>
					<input type="submit" value="회원가입">&nbsp;&nbsp;&nbsp; 
					<input type="reset" value="취소">
				</div>
			</form>
		</div>
	</div>
	<script type="text/javascript"> 
		function idCheck() { // ajax통신을 이용해 아이디 중복체크
			let memberId = document.getElementById("memberId").value;
			// get ajax 생성
			let url = "ajaxMemberIdCheck.do?id="+memberId;
			fetch(url)
				.then(response => response.text())
				.then(text => checkId(text));
		}
		function checkId(text){
			if (text == 'yes'){
				alert("사용가능한 아이디입니다.")
				document.getElementById("btn").disabled = true;
				document.getElementById("btn").value = "yes";
				document.getElementById("memberPassword").focus();
			}else{
				alert("이미 사용하는 아이디 입니다.");
				document.getElementById("memberId").value = "";
				document.getElementById("memberId").focus();
			}
		}
		function formCheck(){
			let password = document.getElementById("memberPassword").value;
			let passcheck = document.getElementById("passwordCheck").value;
			let id = document.getElementById("btn").value;
			
			if(id == 'No'){
				alert("아이디 중복체크 확인");
				return false;
			}
			if(password != passcheck){
				alert("패스워드 일치하지 않습니다");
				return false;
			}
				return true;
		}
	</script>
</body>
</html>