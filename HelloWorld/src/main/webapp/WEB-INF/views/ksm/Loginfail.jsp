<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<script type="text/javascript">
window.onload = function LoginFail(){
	alert("ID 및 PW를 다시 입력하시기 바랍니다.");
	location.href="/ksm/Login"; 
	document.submit();
}
</script>
<body>
<form name="Loginfrm" action="/login">
</form>
<h2>로그인에 실패하였습니다.</h2>
</body>
</html>