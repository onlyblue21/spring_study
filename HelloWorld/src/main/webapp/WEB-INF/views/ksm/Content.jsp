<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	
<%-- 	<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> --%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<link rel="stylesheet" type="text/css" href="/css/ksm/global.css" />
<script src="/js/ksm/Ob21.js" type="text/javascript">

</script>

<body>
	<form name="contentList" action="/contentupdate" method="Post">
			<input type="hidden" name="seq" value='${content.SEQ}'/>
		<table border="1" width="800px" height="500px">
			<thead>
			<tr height="100px">
				<th width="100px">번호:${CONTENT}</th>
				<th width="100px">글쓴이:</th>
				<th width="100px">등록 날짜</th>
			</tr>
			</thead>
			<tr>
				<td>내용:${content.SEQ}</td>
				<td>
				<textarea name="content" >${content.CONTENT}</textarea></td>
				<td></td>
			</tr>
		</table>
		<input type="button" value="확인" onclick="javascript:history.go(-1); return false;" />
		<input type="button" value="삭제" onclick="contentdelete('${content.SEQ}');"/>
		<input type="submit" value="수정"/>
	</form>
</body>
</html>