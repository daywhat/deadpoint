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
	<td class="wirteBtn" style="text-align: right;" colspan="5"><input class="btn btn-light" type="button" onclick="location.href='otInfoWrite.go'"value="Write"></td>
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

<c:forEach items="${otInfoList}" var="ot">
<tr>	
	<td>${ot.c_id}</td>
	<td>${ot.c_title}</td>
	<td>${ot.dp_nick}</td>
	<td>${ot.c_hit}</td>
	<td>${ot.c_ref}</td>
</tr>
</c:forEach> 	

</table>
</div>
<br>
 <div class="paging">
	
 <!-- 이전 -->
 <c:if test="${startPage > countPage}">
	<a href="otInfo.go?pageNum=${startPage - countPage}">Pre</a>
 </c:if>
 
  <!-- 페이지번호(for) -->
 <c:forEach begin="${startPage }" end="${endPage}" var ="i">
<%-- <button class="page-item" type="button" onclick="location.href='otInfo.go?pageNum=${i }'">${i }</button>
 --%>
 <a class="pagingBtn" href="otInfo.go?pageNum=${i }">${i }</a>
 </c:forEach>

   <!-- 다음 -->
  <c:if test="${endPage < totPage}">
 	<a href="otInfo.go?pageNum=${endPage + 1}">Nex</a>
 </c:if>
 <hr class="pagingHr">
	</div>
</form>
<br>
<jsp:include page="../footer.jsp" />
</body>
</html>