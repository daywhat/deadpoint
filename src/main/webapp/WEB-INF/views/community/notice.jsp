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
<div class="noticeTxt"><h1>NOTICE</h1></div>
<br>
<div class="noticeDiv">
<table class="noticeTable">
<c:if test="${id != null}">
<tr>
	<td class="wirteBtn" style="text-align: right;" colspan="5"><input class="btn btn-light" type="button" value="Write"></td>
</tr>
</c:if>
<tr>
	<th class="thN1">No</th>
	<th class="thN2">Subject</th>
	<th class="thN3">Writer</th>
	<th class="thN4">Hit</th>
	<th class="thN5">Rep</th>
</tr>

<%-- <c:forEach items="noticeList" var="no">
<tr>	
	<td>${no.c_id}</td>
	<td>${no.c_title}</td>
	<td>${no.dp_nick}</td>
	<td>${no.dp_hit}</td>
	<td>${no.dp_ref}</td>
	
</tr>
</c:forEach> --%>
<tr>
	<td class="tdRight">1</td>
	<td class="tdRight">공지사항 테스트 글 1</td>
	<td class="tdRight">관리자</td>
	<td>0</td>
	<td>0</td>
</tr>
<tr>
	<td class="tdRight">2</td>
	<td class="tdRight">공지사항 테스트 글 2</td>
	<td class="tdRight">관리자</td>
	<td>0</td>
	<td>0</td>
</tr>
<tr>
	<td class="tdRight">3</td>
	<td class="tdRight">공지사항 테스트 글 3</td>
	<td class="tdRight">관리자</td>
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