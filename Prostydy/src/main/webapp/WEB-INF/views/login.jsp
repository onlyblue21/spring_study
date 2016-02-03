<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<html>
<head>
<title>Home</title>
</head>
<link rel="stylesheet" type="text/css" href="/css/onlyblue21/global.css" />
<script src="/js/Ob21.js" type="text/javascript"></script>

<body>
	<from name="actionfrm" action="/list" method="post" onsubmit="return loginvalidate(this);">
		<table>
			<tr>
				<td>
					id <input id="id" name="id" type="text">
				</td>
			</tr>
			<tr>
				<td>
					pw: <input id="pw" name="pw" type="text">
				</td>
				<td>
				<input type="submit" value="Login">
				<input type="button" value="join" onclick="joinpage();">
				</td>
			</tr>
		</table>
	<P>The time on the server is ${serverTime}.</P>
	<p>한글 테스트, korea test</p>
	</from>
</body>
</html>
