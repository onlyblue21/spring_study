<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<link rel="stylesheet" type="text/css" href="/css/ksm/global.css"/>
<script type="text/javascript" src="/js/jquert-1.11.2.js"></script>
<script src="/js/ksm/Ob21.js" type="text/javascript">
windows.onload = function Message(){
	var result = "${result}";
	if(result){
		alert(result);
	}
	return false;
}



</script>

<body>
	<form name="Listfrm" method="post" action="/List_n">
		<input type="hidden" value="${SEQ}" name="Seq">
		<input type="hidden" value="" name="control"/>
		<table border="1" aling=middle width="200px">
			<tr>
				<td><input type="button" value="로그아웃" onclick="Logout();" />
					<h1>Session_Test${idSession}</h1></td>
			</tr>
		</table>

		<table border="1" align="center" width="960px">
				<thead>
				<tr>
					<th width="100px">글번호</th>
					<th width="400px">제목</th>
					<th width="200px">내용</th>
				</tr>
				</thead>
<%-- 				${count} --%>
<%-- 				[${seq.index}]: ${List[seq.index]} --%>
<!-- 				<c:if test="seq.index % 4 == 0"> </tr><tr> </c:if>  -->
				<tr>
					<td>${SEQ}</td>
					<td>${TITLE}</td>
					<td><input type="text" value="${CONTENT}" name="content"   /></td>
				</tr>
			<tr></tr>
			<tr width="300px">
			<td></td>
			<td></td>
				<td align="left">
					<input type="button" value="취소" onclick="javascript:history.back();"/>
					<input type="button" value="수정" onclick="Content_update();"/>
					<input type="button" value="삭제" onclick="Content_delete();"/>
				</td>
			</tr>
		</table>
	</form>
</body>
</html>