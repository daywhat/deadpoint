<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="shortcut icon" href="resources/img/favicon/favicon.png">
<title>::: DEADPOINT KOREA :::</title>
<jsp:include page="header.jsp" />
</head>
<body>
<jsp:include page="nav.jsp" />

<!-- 케러셀 이미지 사이즈 1200 x 700 -->
<div id="carouselExampleIndicators" class="carousel slide" data-ride="carousel">
  <ol class="carousel-indicators">
    <li data-target="#carouselExampleIndicators" data-slide-to="0" class="active"></li>
    <li data-target="#carouselExampleIndicators" data-slide-to="1"></li>
    <li data-target="#carouselExampleIndicators" data-slide-to="2"></li>
  </ol>
  <div class="carousel-inner">
    <div class="carousel-item active">
      <img class="d-block w-100" src="./resources/img/mainImg/mainBlack.png" alt="첫번째 슬라이드">
    </div>
    <div class="carousel-item">
      <img class="d-block w-100" src="./resources/img/mainImg/mainRed.png" alt="두번째 슬라이드">
    </div>
    <div class="carousel-item">
      <img class="d-block w-100" src="./resources/img/mainImg/mainGreen.png" alt="세번째 슬라이드">
    </div>
  </div>
  <a class="carousel-control-prev" href="#carouselExampleIndicators" role="button" data-slide="prev">
    <span class="carousel-control-prev-icon" aria-hidden="true"></span>
    <span class="sr-only">이전</span>
  </a>
  <a class="carousel-control-next" href="#carouselExampleIndicators" role="button" data-slide="next">
    <span class="carousel-control-next-icon" aria-hidden="true"></span>
    <span class="sr-only">다음</span>
  </a>
</div>


<jsp:include page="footer.jsp" />
</body>
</html>