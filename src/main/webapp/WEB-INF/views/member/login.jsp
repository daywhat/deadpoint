<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="shortcut icon" href="resources/img/favicon/favicon.png">
<title>::: DEADPOINT KOREA :::</title>
<jsp:include page="../header.jsp" />
</head>
<body>
<jsp:include page="../nav.jsp" />
<div class="loginBatang">

<img class="loginLogo" src="./resources/img/logo/login_Logo(white).png">
<form id="loginForm" method="post">
<table class="loginTable">

   <tr>
      <td class="tdN1">I D&nbsp;</td>
      <td class="tdN2"><input type="text" id="dp_name" name="dp_name"></td>
   </tr>
   <tr>
      <td class="tdN1">P W D&nbsp;</td>
      <td class="tdN2"><input type="text" id="dp_pwd" name="dp_pwd"></td>
   </tr>
   <tr>
      <td colspan="2"><input type="submit" value="Login" >&nbsp;<input type="button" value ="Join" onclick="location.href='join.go'"></td>
   </tr>

</table>
</form>
</div>
<jsp:include page="../footer.jsp" />
</body>
</html>