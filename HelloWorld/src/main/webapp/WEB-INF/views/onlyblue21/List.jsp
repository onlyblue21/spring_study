<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<link rel="stylesheet" type="text/css" href="/css/onlyblue21/global.css"/>
<script type="text/javascript" src="/js/jquert-1.11.2.js"></script>
<script src="/js/onlyblue21/Ob21.js" type="text/javascript">
// function reset(){
// 	document.Listfrm.reset();
// }

window.onload = function CaddCheck() {
	var addsql = "${welcome}";
	if (addsql) {
		alert(addsql);
	return false;
	}
// 	var input  = $(document.creatElement("input"));
// 	input.attr('type','hidden').attr('name','inputtest').val('asd');
// 	$('form[name="listfrm"]').append( input );
	
// 	<input type="hidden" name="inputtest" value="asd"/>
}

</script>

<body>
	<form name="Listfrm" method="post" action="/List_n">
				<input type="hidden" value="" name="process">
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
					<th width="120px">글쓴이</th>
					<th width="180px">등록일</th>
				</tr>
				</thead>
<%-- 				${count} --%>
<%-- 				[${seq.index}]: ${List[seq.index]} --%>
<!-- 				<c:if test="seq.index % 4 == 0"> </tr><tr> </c:if>  -->
			<c:forEach begin="0" end="${count}"  var="List" items="${List}">
				<tr>
					<td>${List.SEQ}</td>
					<td><a href="/Content?Seq=${List.SEQ}&&title=${List.TITLE}&&content=${List.CONTENT}&&reg_id=${List.REG_ID}u">${List.TITLE}</a></td>
					<td>${List.REG_ID}</td>
					<td id="aa">${List.REG_DT}</td>
				</tr>
			</c:forEach>
			<tr></tr>
			<tr width="*" align="right">
				<td colspan="4">
					<input align="right" type="submit" value="목록" />
					<input type="button" value="글쓰기" onclick="addContent();" />
				</td>
			</tr>
		</table>
	</form>
</body>
</html>