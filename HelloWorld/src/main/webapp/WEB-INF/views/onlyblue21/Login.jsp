<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="UTF-8"%>
<%-- 	<%@ taglib uri="http://www.springframework.org/security/tags" prefix="sec" %> --%>
<!-- <http session-filxation-protection="none"> -->
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Login Page</title>
</head>
<link rel="stylesheet" type="text/css" href="/css/onlyblue21/global.css" />
<script src="/js/onlyblue21/Ob21.js" type="text/javascript"></script>
<script type="text/javascript">
window.onload = function NewUserCheck() {
	var result = "${welcome}";
	if (result) {
		alert(result);
	}
	return false;
}
</script>

<body>
	<form name="actionfrm" action="/List" method="post" onsubmit="return loginvalidate(this);" >
		<table>
			<tr>
				<td>id:<input id="id" name="id" type="text">
				</td>
			</tr>
			<tr>
				<td>pw:
						<input id="pw" name="pw" type="password"> 
				</td>
				<td>
				<input type="submit" value="확인" >
				<input type="button" value="Join" onclick="Joinpage();">
				</td>
			</tr>
		</table>
	</form>
</body>
</html>