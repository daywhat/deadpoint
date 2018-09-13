<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
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

<br><br>
<h1>OT WRITE</h1><br>
<form method="POST" action="otInfoWrite.do">
	<div align="center">
		<table style="border: 1px solid black; padding: 10px; background-color: black;">
			<tr>
			<td style="width: 100px; height: 40px; text-align: center; color: white;">제목 : &nbsp;</td>
			<td style="width: 600px; padding:5px;"><input type="text" id="c_title" name="c_title" size="100%"></td>
			</tr>
			<tr><td colspan="2"></td></tr>
			
			<tr>
			<td colspan="2" style="padding:5px;"><textarea id="c_content" name="c_content" style="width:100%; height:400px;"></textarea></td>
			</tr>		
			<tr><td colspan="2"></td></tr>
			
			<tr>
			<td colspan="2" style="padding: 5px; text-align: center;">
				<input type="button" onclick="location.href='otInfo.go'" value="목록">&nbsp;
				<input type="submit" value="글쓰기"></td>
			</tr>
			
		</table>
	</div>
</form>




<br><br>
<jsp:include page="../footer.jsp" />
</body>
</html>