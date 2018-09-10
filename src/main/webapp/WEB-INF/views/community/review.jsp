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


<form>
<div class="reviewTxt"><h1>Review</h1></div>
<br>
<div class="reviewDiv">
<table class="reviewTable">
<!-- login Session 값 있으면 글쓰기 버튼 출력 -->
<tr>
	<td style="text-align: right;" colspan="4"><input type="button" value="Write"></td>
</tr>
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

<c:forEach items="reviewList" var="re">
<tr>	
	<td>${re.c_id}</td>
	<td>${re.c_title}</td>
	<td>${re.dp_nick}</td>
	<td>${re.dp_hit}</td>
	<td>${re.dp_ref}</td>
	
</tr>
</c:forEach>
<!-- <tr>
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
</tr> -->
	

</table>
</div>
</form>
<br>

<jsp:include page="../footer.jsp" />
</body>
</html>