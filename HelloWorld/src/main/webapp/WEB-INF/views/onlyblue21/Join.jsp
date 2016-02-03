<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<link rel="stylesheet" type="text/css" href="/css/onlyblue21/global.css" />
<script src="/js/onlyblue21/Ob21.js" type="text/javascript"></script>
<body>
	<form method="get" name="Joinfrm" action="/Join" onsubmit="return Joinvalidate(this)">
		<table border="1" align="center" width="400px">
			<tr>
				<td>
					id:<input type="text" name="id" value="" />
				</td>
			</tr>
			<tr>
				<td>
					pw:<input type="text" name="pw" value=""> 
					<input type="submit" value="확인" />
				</td>
				<td>
					<input type="button" value="취소" onclick="cancle();">
				</td>
			</tr>


		</table>
	</form>
</body>
</html>