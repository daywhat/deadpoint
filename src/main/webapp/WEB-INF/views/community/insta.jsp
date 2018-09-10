<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="shortcut icon" href="resources/img/favicon/favicon.png">
<title>::: DEADPOINT KOREA :::</title>
<jsp:include page="../header.jsp" />
<script src="https://code.jquery.com/jquery-3.3.1.min.js"></script>

 <script type="text/javascript">  
   jQuery(function($) {  
        var tocken = "8206906487.dc7d6bc.082f07111062458eb091aca80f814ae8"; /* Access Tocken 입력 */  
        var count = "9";  
        $.ajax({  
            type: "GET",  
            dataType: "jsonp",  
            cache: false,  
            url: "https://api.instagram.com/v1/users/self/media/recent/?access_token=" + tocken + "&count=" + count,  
            success: function(response) {  
             if ( response.data.length > 0 ) {  
                  for(var i = 0; i < response.data.length; i++) {  
                       var insta = '<div class="insta-box">';  
                       insta += "<a target='_blank' href='" + response.data[i].link + "'>";  
                       insta += "<div class'image-layer'>";  
                       //insta += "<img src='" + response.data[i].images.thumbnail.url + "'>";  
                       insta += '<img class="instaImg" src="' + response.data[i].images.thumbnail.url + '">';  
                       insta += "</div>";  
                       //console.log(response.data[i].caption.text);  
                       if ( response.data[i].caption !== null ) {  
                            insta += "<div class='caption-layer'>";  
                            if ( response.data[i].caption.text.length > 0 ) {  
                                 insta += "<p class='insta-caption'>" + response.data[i].caption.text + "</p>"  
                            }  
                            insta += "<span class='insta-likes'>" + response.data[i].likes.count + " Likes</span>";  
                            insta += "</div>";  
                       }  
                       insta += "</a>";  
                       insta += "</div>";  
                       $("#instaPics").append(insta);  
                  }  
             }  
             $(".insta-box").hover(function(){  
                  $(this).find(".caption-layer").css({"backbround" : "rgba(255,255,255,0.7)", "display":"block"});  
             }, function(){  
                  $(this).find(".caption-layer").css({"display":"none"});  
             });  
            }  
           });  
   });  
   </script>  

</head>
<body>
<jsp:include page="../nav.jsp" />

<div id="instaPics"></div>

<jsp:include page="../footer.jsp" />
</body>
</html>

<!-- instagram API token -->

<!-- http://www.deadpoint.kr/#access_token=8206906487.dc7d6bc.082f07111062458eb091aca80f814ae8 -->
<!-- http://localhost:8080/depo/insta.go#access_token=8206906487.dc7d6bc.082f07111062458eb091aca80f814ae8 -->