<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<title>Insert title here</title>
</head>
<link rel="stylesheet" type="text/css" href="/css/onlyblue21/global.css" />
<script src="/js/onlyblue21/Ob21.js" type="text/javascript"></script>
<body>
	<form name="addcontent" action="/addContent" method="POST" onsubmit="return valcheck(this);">
		<input type="hidden" name="process" value="sqladd">
		
		<table border="1" width="800px" height="200px">
				<thead >
				<tr height="100px">
					<th width="100px">제목</th>
					<th width="100px">내용</th>
					<th width="100px">글쓴이</th>
				</tr>
				</thead>
			<tr height="100px">
				<td>
					글 제목 <input type="text" name="title">
				</td>
				<td>
					내용<textarea rows="10" cols="30" name="content"></textarea>
				</td>
				<td>
					글쓴이:<input type="text" name="reg_id">
				</td>
			</tr>
		</table>
		<input type="submit" value="확인"> <input type="button" value="취소" onclick="javascript:history.back(); return false;" />
	</form>
</body>
</html>