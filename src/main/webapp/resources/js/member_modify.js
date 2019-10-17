$(document).ready(function () {
  $(function () {

  var pwReg = /^[a-zA-Z0-9]{6,10}$/;
  var phoneReg = /^\d{2,3}-\d{3,4}-\d{4}$/
  var emailReg = /^[A-Za-z0-9_\.\-]+@[A-Za-z0-9\-]+\.[A-Za-z0-9\-]+/

	    $('.join-submit').on('click', function (event) {

      //비밀번호
      if (!pwReg.test($("#password").val())) {
    	  console.log("떙");
        $("#password").focus();
        return false;
      }
      //비밀번호 확인
      if ($("#password").val() !== $("#password-check").val()) {
        $("#password-check").focus();
        return false;
      }
      // 아이디랑 비밀번호랑 같은지
      if ($("#id").val() == ($("#password").val())) {
        $("#password").focus();
        return false;
      }
    
      //휴대폰
      if (!phoneReg.test($("#phone").val())) {
        $("#phone").focus();
        return false;
      }
      
      if (!emailReg.test($("#email").val())) {
        $("#email").focus();
        return false;
      }  
      
      if ($("#number").val() == "") {
    	  
          $("#number").focus();
          $("#emailMessageNum").show();
          $("#emailMessageNum").text("인증번호 확인 부탁드립니다.")
          
          return false;
        }else{
            $("#emailMessageNum").hide();
        }
    

$('.join-form').submit();  //회원정보수정 전송
  
 });	   
 //==============================================================================//
 
 $('#password').on('blur', function (event) {
     if ($('#password').val() === "") {
       $("#pwMessage").show();
       $("#pwMessage").text("비밀번호를 입력해주세요.");
       return false;
     } else if (!pwReg.test($("#password").val())) {
       $("#pwMessage").show();
       $("#pwMessage").text("비밀번호는 숫자 문자 포함 6~10자로 입력해주세요.");
       return false;
     } else if ($("#id").val() == ($("#password").val())) {
       $("#pwMessage").show();
       $("#password").val("");
       $("#pwMessage").text("비밀번호가 아이디랑 같습니다.");
       return false;
     } else {
       $("#pwMessage").hide();
       return false;
     }
   });

   $('#password-check').on('blur', function (event) {
     if ($('#password-check').val() == "") {
       $("#pwCheckMessage").show();
       $("#pwCheckMessage").text("비밀번호 확인을 입력해주세요.");
       return false;
     } else if ($("#password").val() !== $("#password-check").val()) {
       $("#pwCheckMessage").show();
       $("#pwCheckMessage").text("비밀번호랑 비밀번호 확인이 다릅니다.");
       $("#password-check").val("");
       return false;
     } else {
       $("#pwCheckMessage").hide();
       return false;
     }
   });
   
/*   
   $('#phone').on('blur', function (event) {
	      var user_phone = $('#phone').val();
	      if (user_phone === "") {
	        $("#phoneMessage").show();
	        $("#phoneMessage").text("휴대폰 번호를 입력해주세요.");
	        return false;
	      }

	      $.ajax({
	        url: '/member/phonecheck?userPhone=' + user_phone,
	        type: 'post',
	        success: function (data) {
	          console.log(data);

	          if (data == 1) {
	            $("#phoneMessage").show();
	            $("#phoneMessage").text("사용 중인 휴대폰 번호입니다.");
	            $("#phone").val("");
	            return false;
	          } else if (!phoneReg.test(user_phone)) {
	            $("#phoneMessage").show();
	            $("#phoneMessage").text("휴대폰 형식이 틀립니다.ex(010-1234-1234)");
	            return false;
	          } else {
	            $("#phoneMessage").hide();
	            return false;
	          }
	        }, //end-success
	        error: function () {
	          console.log("실패");
	        } //end-error
	      }) //ajax
	    });*/

   
   $('#email').on('blur', function (event) {
	      var user_email = $('#email').val();
	      
	      console.log(user_email);   
	      if (user_email === "") {
	    	  console.log("이메일입력해요");
	        $("#emailMessage").show();
	        $("#emailMessage").text("이메일을 입력해주세요.");
	        return false;
	      }
	      $.ajax({
	    	url: '/member/emailcheck?userEmail=' + user_email,
	        type: 'post',
	        /*data:{"email":user_email},*/
	        success: function (data) {
	          console.log("아아아");
	          console.log(data);
	          if (data == 1) {
	            $("#emailMessage").show();
	            $("#emailMessage").text("사용 중인 이메일입니다.");
	            $("#email").val("");
	            return false;
	          } else if (!emailReg.test(user_email)) {
	            $("#emailMessage").show();
	            $("#emailMessage").text("이메일 형식이 틀립니다.");
	            $("#email").val("");
	            return false;
	          } //if
	          else {
	            $("#emailMessageNum").css("color","blue").text("사용가능합니다.")
	          }

	        }, //end-success
	        error: function () {
	          console.log("실패");
	        } //end-error
	      }) //ajax
	    });
	    
	    
  });
});