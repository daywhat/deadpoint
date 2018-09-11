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

<form>
<div class="otInfoTitle"><h1>OT INFORMATION</h1></div>
<br>
<div class="otInfoDiv">
<table class="otInfoTable">
<!-- login Session 값 있으면 글쓰기 버튼 출력 -->
<c:if test="${id != null}">
<tr>
	<td class="wirteBtn" style="text-align: right;" colspan="5"><input class="btn btn-light" type="button" value="Write"></td>
</tr>
</c:if>
<tr>
<td colspan="4"></td>
</tr>
<tr>
	<th class="thN1">No</th>
	<th class="thN2">Subject</th>
	<th class="thN3">Writer</th>
	<th class="thN4">Hit</th>
	<th class="thN5">Ref</th>
</tr>

<%-- <c:forEach items="otInfoList" var="ot">
<tr>	
	<td>${ot.c_id}</td>
	<td>${ot.c_title}</td>
	<td>${ot.dp_nick}</td>
	<td>${ot.dp_hit}</td>
	<td>${ot.dp_ref}</td>
	
</tr>
</c:forEach> --%>
<tr>
	<td>1</td>
	<td>옷정보 테스트 글 1</td>
	<td>관리자</td>
	<td>0</td>
	<td>0</td>
</tr>
<tr>
	<td>2</td>
	<td>옷정보 테스트 글 2</td>
	<td>관리자</td>
	<td>0</td>
	<td>0</td>
</tr>
<tr>
	<td>3</td>
	<td>옷정보 테스트 글 3</td>
	<td>관리자</td>
	<td>0</td>
	<td>0</td>
</tr>
	

</table>
</div>
</form>
<br>
<jsp:include page="../footer.jsp" />
</body>
</html>