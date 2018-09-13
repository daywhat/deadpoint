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
<br>

<div align="center">
	<table style="border: 4px solid black; padding: 10px; background-color: black;">
		<tr>
		<td colspan="4" style="width: 700px; height: 40px; padding-left: 5px; background-color: black; color: white; margin-left: 5px;" >
		제목 : ${c_title}<br>
		작정일자 : ${c_date}<br>
		작성자 : ${dp_nick} &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;| 조회수 : ${c_hit}</td>
		</tr>
		<tr style="height: 9px;"></tr>
		
		<tr>
		<td colspan="4" style="background-color: white; width: 700px; height: 400px; vertical-align: top; padding-left: 5px;">		
			egeeg </td>
		</tr>
		<tr><td colspan="4"></td></tr>
		<tr>
		<td><div align="center" style="margin-top: 10px;">
			<input type="button" value="목록" id="" name="">
		<c:if test="${id}.equals(${dp_name })">
			<input type="button" value="수정" id="" name="">
			<input type="button" value="삭제" id="" name="">
		</c:if>
			</div>
			</td>
		</tr>

	</table>
</div>   

<br>
<jsp:include page="../footer.jsp" />
</body>
</html>