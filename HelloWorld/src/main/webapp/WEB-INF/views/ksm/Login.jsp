<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%-- 	<%@ taglib uri="http://www.springframework.org/security/tags" prefix="sec" %> --%>
<!-- <http session-filxation-protection="none"> -->
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Login Page</title>
</head>
<link rel="stylesheet" type="text/css" href="/css/ksm/global.css" />
<script src="/js/ksm/Ob21.js" type="text/javascript"></script>
<script type="text/javascript">
// window.onload = function NewUserCheck() {
// 	var result = "${result}";
// 	var create_db_board = "${create_db_board}";
// 	var create_db_user = "${create_db_user}";
// 	var Login_id = "${Login_id}";
// 	if (result) {
// 		alert(result);
// 	}
// 	else if(create_db_board){
// 		alert(create_db_board)
// 	}
// 	else if(create_db_user){
// 		alert(create_db_user)
// 	}
// 	else if(Login_id){
// 		alert(Login_id)
// 	}
// 	return false;

// }
window.onload = function(){
	var output ='';
	output += '<ul>';
	output += '<li>javascript</li>';
	output += '<li>jquery</li>'
	output += '</ul>';
	var d1 = document.getElementById('Login');
	d1.innerHTML = output;
	
	
	var footer = document.createElement("DIV");
	footer.id = "this-is-footer";
	footer.className = "this-is-footer-class";
	footer.innerHTML = [
	    "<p>this is footer</p>",
	    "<a href='www.daum.net'>go daum</a>",
	    "<span>this is span</span>",
	    "<b>this is b tag</b>"
	].join("");
};

function add(){
	
	var output ='';
	output += '<ul>';
	output += '<li>javascript</li>';
	output += '<li>jquery</li>'
	output += '</ul>';
	
	var d2 =document.getElementById('login');
	d2.innerHTML=output;
	
};

function commentList(){
	var boardNum = "<s:property value='boardVo.boardBum'/>";
	
	$ajax({
		url: '/mamma/sanghyun/commentList.action',
		type:'post',
		data:{boardNum:boardNum},
		dataType:'json',
		error:output,
		success:output
		
	});
}

	
	
	
}

</script>

<body>
<div id="login">
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
				<input type="button" value="Test_user_db생성" onclick="create_db_user();">
				<input type="button" value="Test_Board_db생성" onclick="create_db_board();">
				<input type="button" value="innerHTML_TEST" onclick="add();">
				<input type="button" value="Join" onclick="Joinpage();">
				</td>
			</tr>
		</table>
	</form>
</div>
</body>

</html>