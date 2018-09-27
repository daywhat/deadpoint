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


<div class="shopBatang">
	<c:forEach items="${dppvo}" var="shopItem" >
		<div class="prodItem">
			<div class="prodImg">
			</div>
			<div class="prodInfo">
			<span>${shopItem.dppro_name } / ${shopItem.dppro_price }원</span><br>
			<span><i class="far fa-kiss-wink-heart">0</i>&nbsp;<i class="far fa-hand-point-up">0</i></span>
			</div>
		</div>
	</c:forEach>
		
</div>

<jsp:include page="../footer.jsp" />
</body>
</html>