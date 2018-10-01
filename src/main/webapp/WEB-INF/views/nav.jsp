<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="shortcut icon" href="resources/img/favicon/favicon.png">
<title>::: DEADPOINT KOREA :::</title>
</head>
<body>

<nav>
 <div class="navTop">
	<div class="navPart navTree">
		<ul class="fontBold">
			<li><a class="" href="intro.go">deadpoint</a></li>
			<li><a class="" href="totalShop.go">shop</a></li>
			<li><a class="" href="insta.go">insta</a></li>
			<li><a class="" href="review.go">review</a></li>
			<li><a class="" id="otInfoBtn" href="otInfo.go">otinfo</a></li>
			<li><a class="" href="notice.go">notice</a></li>
		</ul>
	</div>
	<div class="navPart navLogin">
		<ul class="font">
		
		<c:if test="${id != null}">
			<!-- login -->
			<li><a class=""href="myPage.do">MyPage</a>/<a class="" href="logout.do">logout</a></li>
			<li><a class="" href="cart.go"><i class="fas fa-shopping-cart"></i></a></li>
			<li><a class="" href="sending.go"><i class="fas fa-truck"></i></a></li>
			<li><a class="" href="#"><i class="fas fa-question-circle"></i></a></li>
		</c:if>
		<c:if test="${id == null}">
			<!-- unlogin -->
			<li><a class=""href="join.go">Join</a>/<a class="" href="login.go">login</a></li>
			<li><a class="" href="cart.go"><i class="fas fa-shopping-cart"></i></a></li>
			<li><a class="" href="sending.go"><i class="fas fa-truck"></i></a></li>
		</c:if>	
		</ul>
	</div>
</div>	
	<hr class="lineCost">
<div class="container navBottom">
	<div class="row">
	<div class="col-4">
	<a href="mainImg.go"><img class="mainLogo" src="./resources/img/logo/mainLogo.png"></a>
	</div>
	<c:if test="${shopMenu == 'click' }">
	<div class="col-4 shopFit">
	<!-- shop click 값이 오면 남/여 필터 클릭 가능 -->
	<a class="" href="maleShop.go">MALE</a>/<a class="" href="femaleShop.go">FEMALE</a>
	</div>
	</c:if>
	<div class="col-4">
	</div>
	</div>
</div>
</nav>

</body>
</html>