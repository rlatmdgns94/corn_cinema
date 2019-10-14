$(document).ready(function () {
	 $('#password').on('blur', function (event) {
	      var pwReg = /^[a-zA-Z0-9]{6,10}$/;
	      var user_pw =$('#password').val();
	      if($('#password').val()===""){
	         $("#pwMessage").show();
	         $("#pwMessage").text("비밀번호를 입력해주세요.");
	         return false;
	      }
	      else if (!pwReg.test(user_pw)) {
	         $("#pwMessage").show();
	         $("#pwMessage").text("비밀번호는 숫자 문자 포함 6~10자로 입력해주세요.");
	         return false;
	      } else if ($("#id").val() == ($("#password").val())) {
	         $("#pwMessage").show();
	         $("#pwMessage").text("비밀번호가 아이디랑 같습니다.");
	         return false;
	      } else {
	         $("#pwMessage").hide();
	         return false;
	      }
	   });

	   $('#password-check').on('blur', function (event) {
		  var user_pwck =$('#password-check').val();
	      if(user_pwck==""){
	         $("#pwCheckMessage").show();
	         $("#pwCheckMessage").text("비밀번호 확인을 입력해주세요.");
	         return false;
	      }
	      else if ($("#password").val() !== $("#password-check").val()) {
	         $("#password-check").val("");
	         $("#pwCheckMessage").show();
	         $("#pwCheckMessage").text("비밀번호랑 비밀번호 확인이 다릅니다.");
	         return false;
	      } else {
	         $("#pwCheckMessage").hide();
	         return false;
	      }
	   });

	
	
	
	
	
	
	
	
});