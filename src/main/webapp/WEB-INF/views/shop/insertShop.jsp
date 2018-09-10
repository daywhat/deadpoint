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

<form id="insertProduct.do">

	<table>
		<tr>
		<td><select name="productCat">
			<option value="셔츠">셔츠</option>
			<option value="바지">바지</option>
			<option value="모자">모자</option>
			<option value="신발">신발</option>
			<option value="양말">양말</option>
			<option value="악세서리">악세서리</option>		
			</select></td>
		<td></td>
		<td></td>
		<td></td>	
		
		</tr>
	
	
	</table>

</form>


<jsp:include page="../footer.jsp" />
</body>
</html>