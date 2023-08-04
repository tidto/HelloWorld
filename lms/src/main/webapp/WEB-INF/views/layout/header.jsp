<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="css/menu.css">
</head>
<body>
	<nav id="topMenu">
		<ul>
			<li><a class="menuLink" href="home.do">Home</a></li>	
			<li><a class="menuLink" href="book.do">Book</a></li>				
			<li><a class="menuLink" href="notice.do">Notice</a></li>
			<li><a class="menuLink" href="member.do">Member</a></li>
			<li><a class="menuLink" href="#">Join</a></li>
			<li><a class="menuLink" href="loginform.do">Login</a></li>
			<li><a class="menuLink" href="#">Admin</a></li>
			<li><a class="menuLink" href="#">MyPage</a></li>
			<li><a class="menuLink" href="#">Logout</a></li>
			<li class="user">${name }님 접속중</li>
		</ul>
	</nav>
</body>
</html>