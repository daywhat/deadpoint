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
<form id="joinForm" method="post">
<div class="joinBatang">

<img class="joinLogo" src="./resources/img/logo/login_Logo(white).png">
 
 <table class="joinTable">
   <tr>
      <td class="tdN1"><label>Nick&nbsp;</label></td>
      <td class="tdN2"><input type="text" id="dp_nick" name="dp_nick">&nbsp;<input type="button" value="Check" onclick="nickCheck()"></td>
   </tr>
   <tr>
      <td class="tdN1"><label>I D&nbsp;</label></td>
      <td class="tdN2"><input type="text" id="dp_name" name="dp_name">&nbsp;<input type="button" value="Check" onclick="idCheck()"></td>
   </tr>
   <tr>
      <td class="tdN1"><label>P W D&nbsp;</label></td>
      <td class="tdN2"><input type="password" id="dp_pwd" name="dp_pwd"><label>(8-12자리 영문+숫자)</label></td>
   </tr>
   <tr>
      <td class="tdN1"><label>P W D Check&nbsp;</label></td>
      <td class="tdN2"><input type="password" id="dp_pwdCheck" name="dp_pwdCheck"><label id="passLabel"></label></td>
   </tr>
   <tr>
      <td class="tdN1"><label>Question&nbsp;</label></td>
      <td class="tdN2"><select style="width: 300px;" id="dp_findpwd_q" name="dp_findpwd_q">
      <option value="0">Select Question</option>
      <option value="1">가장 좋아하는 색깔은 ?</option>
      <option value="2">감명깊게 본 영화 제목은 ?</option>
      <option value="3">부모님의 고향은 ?</option>
      <option value="4">꼭 한번 가보고싶은 여행지는 ?</option>
      </select></td>
   </tr>
   <tr>
      <td class="tdN1"><label>Answer&nbsp;</label></td>
      <td class="tdN2"><input type="text" id="dp_findpwd_a" name="dp_findpwd_a"></td>
   </tr>
   <tr>
      <td class="tdN1"><label>Tel&nbsp;</label></td>
      <td class="tdN2"><input type="text" id="tel1" name="tel1" size="7">
                   <input type="text" id="tel2" name="tel2" size="8">
                   <input type="text" id="tel3" name="tel3" size="8"></td>
   </tr>
   <tr>
      <td class="tdN1"><label>Address&nbsp;</label></td>
      <td class="tdN2"><textarea style="width: 300px; height: 50px;" 
                     id="dp_addr" name="dp_addr"></textarea></td>
   </tr>
   <tr>
      <td class="tdN1"><label>Mail&nbsp;</label></td>
      <td class="tdN2"><input type="text" id="dp_email1" name="dp_email1">
      <label>@&nbsp;</label>
      <input type="text" id="dp_email2" name="dp_email2">
      <br>
      <input type="checkbox" id="dp_email_agree" name="dp_email_agree">광고성 이메일 수신에 동의하기 (선택)
      </td>
   </tr>
   <tr>
      <td class="tdN1"><label>Terms of Use&nbsp;</label></td>
      <td class="tdN2">
      <textarea style="width: 400px;height: 150px;">
      나는야 이용약관.
      </textarea>
      <br>
      <input name="dp_term" id="dp_term" type="checkbox"><label>약관에 동의 합니다.</label></td>
   </tr>
   <tr>
      <td colspan="2"><input class="joinBtn" type="submit" value="Join">
                  <input class="joinBtn" type="button" value="cancle" onclick="location.href='main.go'"></td>
   </tr>
   
</table>
 

</div>
</form>
<jsp:include page="../footer.jsp" />
</body>
</html>