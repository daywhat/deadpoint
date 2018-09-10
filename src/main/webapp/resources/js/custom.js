/*
 * 로그인 버튼 클릭시 아이디와 비밀번호 값을 가지고 함수 호출 
 * 콜백 함수로 DB에 아이디 비밀번호 확인 후 아이디 값과 
 * 비밀번호 값이 맞으면 1을 반환하여 intro.go 호출
 * 비밀번호 값이 틀리면 0을 반환하여 아이디 비밀번호를 확인하라 alert창 호출
 */

/*function login(dp_name, dp_pwd){
	$.ajax({
		type:"POST",
		url:"login.do",
		data: {"dp_name":$("#dp_name").val(), "dp_pwd":$dp_pwd},
		success: function(data){
			if(data == "1"){
				location.href="intro.go";
			}else if(data == "0"){
				alert("아이디, 비밀번호를 확인하여 주십시오.");
			}
		}
	})
}*/
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
			}else if( data == "0")
				alert("회원가입이 불가능한 닉네임입니다.");
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
			}else if( data == "0")
				alert("회원가입이 불가능한 아이디입니다.")
			}
		})
	}
}	


$("#loginForm").submit(function(e){
	var chbox = $('#dp_term');
		if (ckbox.is(":checked")) {
		e.preventDefault();
		var data = $(this).serialize();
		$.ajax({
			url:"join.do",
			type:"POST",
			data: data,
			success: function(data){
				if(data == "1"){
					location.href="welcome.go";
				}else if(data == "0"){
					alert("아이디, 비밀번호를 확인하여 주십시오.");
				}
			}
		});
		}else{
			alert("약관에 동의하여 주십시오.")
		}
	});



