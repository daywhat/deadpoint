/*
 * 로그인 버튼 클릭시 아이디와 비밀번호 값을 가지고 함수 호출 
 * 콜백 함수로 DB에 아이디 비밀번호 확인 후 아이디 값과 
 * 비밀번호 값이 맞으면 1을 반환하여 intro.go 호출
 * 비밀번호 값이 틀리면 0을 반환하여 아이디 비밀번호를 확인하라 alert창 호출
 */

function loginCheck() {

    var username = $("#dp_name").val();
    var password = $("#dp_pwd").val();
    
    if (!username || !password) {
        alert("ID/비밀번호를 입력해주세요.");
        return false;
    }

    try {
        var rsaPublicKeyModulus = $("#rsaPublicKeyModulus").val();
        var rsaPublicKeyExponent = $("#rsaPublicKeyExponent").val();
        submitEncryptedForm(username,password, rsaPublicKeyModulus, rsaPublicKeyExponent);
    } catch(err) {
        alert(err + "121212");
    }
    return false;
}


function submitEncryptedForm(username, password, rsaPublicKeyModulus, rsaPpublicKeyExponent) {
    var rsa = new RSAKey();
    rsa.setPublic(rsaPublicKeyModulus, rsaPpublicKeyExponent);

    // 사용자ID와 비밀번호를 RSA로 암호화한다.
    var securedUsername = rsa.encrypt(username);
    var securedPassword = rsa.encrypt(password);

    var securedLoginForm = document.getElementById("loginForm");
    securedLoginForm.securedUsername.value = securedUsername;
    securedLoginForm.securedPassword.value = securedPassword;
    securedLoginForm.submit();
}

$(document).ready(function(){
	$("#loginForm").submit(function(e){
		e.preventDefault();

		var data = $(this).serialize();
		$.ajax({
			url:"login.do",
			type:"POST",
			data: data,
			success: function(data){
				if(data == "1"){
					location.href="intro.go";
				}else if(data == "0"){
					alert("아이디, 비밀번호를 확인하여 주십시오.");
				}
			}
		});
	});
	
	
	
	
	// Join
	
	$("#joinForm").submit(function(e){
		
		if($('#dp_nick').val() == ""){
			alert("닉네임을 입력해주세요.");
			return false;
		}else if($('#dp_name').val() == ""){
			alert("아이디를 입력해주세요.");
			return false;
		}else if($('#dp_pwd').val() == ""){
			alert("비밀번호를 입력해주세요.");
			return false;
		}else if($('#dp_pwdCheck').val() == ""){
			alert("비밀번호를 확인해주세요");
			return false;
		}else if($('#dp_findpwd_q').val() == "0"){
			alert("비밀번호 질문을 선택해주세요.");
			return false;
		}else if($('#dp_findpwd_a').val() == ""){
			alert("비밀번호 질문의 답을 적어주세요.");
			return false;
		}else if($('#dp_tel1').val() == ""){
			alert("전화번호를 정확히 입력해주세요.");
			return false;
		}else if($('#dp_tel2').val() == ""){
			alert("전화번호를 정확히 입력해주세요.");
			return false;
		}else if($('#dp_tel3').val() == ""){
			alert("전화번호를 정확히 입력해주세요.");
			return false;
		}else if($('#dp_addr').val() == ""){
			alert("주소를 입력해주세요.");
			return false;
		}else if($('#dp_email1').val() == ""){
			alert("이메일을 정확히 입력해주세요.");
			return false;
		}else if($('#dp_email1').val() == ""){
			alert("이메일을 정확히 입력해주세요.");
			return false;
		}else if($('#dp_term').is(":checked") != true){
			alert("약관에 동의하여 주십시오.");
			return false;
		}else{
		e.preventDefault();
		var data = $(this).serialize();
		$.ajax({
			url:"join.do",
			type:"POST",
			data: data,
			success: function(data){
					location.href= data + ".go";
				}
		});
		}
	});
	
/*
 *  비밀번호 입력시 입력창과 입력 확인창을 대조하여 
 *  비밀번호가 같을시 color를 blue로 변경하여 label에 text 입력
 *  비밀번호가 틀릴시 color를 red로 변경하여 label에 정해진 text 입력
 *  
 *  keypress 이벤트 사용시 키를 눌림과 동시에 이벤트가 발생하여 
 *  입력된 값을 바로 알지 못하는 상황이 생기기에 
 *  keyup 이벤트를 사용하여 키를 때는 순간 입력된 값을 읽어오기에 확인 가능
 */
	

	$("#dp_pwdCheck").keyup(function(){
		var a1 = $("#dp_pwd").val();
		var a2 = $("#dp_pwdCheck").val();
		if(a1 != a2){
			$("#passLabel").text("비밀번호가 다릅니다.");
			$("#passLabel").css("color", "red");
		}else if(a1.length < 8){
			$("#passLabel").text("비밀번호가 너무 짧습니다.");
			$("#passLabel").css("color", "red");
		}else if(a1.length > 12){
			$("#passLabel").text("비밀번호가 너무 깁니다.");
			$("#passLabel").css("color", "red");
		}else{
			$("#passLabel").text("비밀번호가 같습니다.");
			$("#passLabel").css("color", "blue");
		}
	})
	

	
	
})


/*
	아이디와 닉네임 중복 확인 버튼을 클릭했을시 
	데이터를 DB로 보내어 값의 유무에 다라서
	데이터 변환 
 */

function nickCheck(){

	if($("#dp_nick").val() == ""){
		alert("닉네임을 입력해주세요");
	}else{
	$.ajax({
		url:"nickCheck.do?dp_nick="+$("#dp_nick").val(),
		type: "GET",
		success: function(data){
			if(data == "1"){
				alert("회원가입이 가능한 닉네임입니다.");
				return false;
			}else if( data == "0")
				alert("회원가입이 불가능한 닉네임입니다.");
				$('#dp_nick').val("");
				$('#dp_nick').focus();
			}
		})
	}
}	

function idCheck(){
	
	if($("#dp_name").val() == ""){
		alert("아이디를 입력해주세요");
	}else{
	$.ajax({
		url:"idCheck.do?dp_name="+$("#dp_name").val(),
		type: "GET",
		success: function(data){
			if(data == "1"){
				alert("회원가입이 가능한 아이디입니다.")
				return false;
			}else if( data == "0")
				alert("회원가입이 불가능한 아이디입니다.")
				$('#dp_name').val("");
				$('#dp_name').focus();
			}
		})
	}
}	






