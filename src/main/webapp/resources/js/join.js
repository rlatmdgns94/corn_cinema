$(document).ready(function () {
  $(function () {
    var idReg = /^[a-zA-Z0-9]{6,10}$/;
    var pwReg = /^[a-zA-Z0-9]{6,10}$/;
    var nameReg = /^[가-힣]+$/;
    var phoneReg = /^\d{2,3}-\d{3,4}-\d{4}$/
    var emailReg = /^[A-Za-z0-9_\.\-]+@[A-Za-z0-9\-]+\.[A-Za-z0-9\-]+/
    $('.join-submit').on('click', function (event) {
      //    event.preventDefault();
      //아아디
      if ($("#id").val() == "") {
        $("#id").focus();
        return false;
      }
      //아이디 테스트
      if (!idReg.test($("#id").val())) {
        $("#id").focus();
        return false;
      }
      //비밀번호
      if (!pwReg.test($("#password").val())) {
        $("#password").focus();
        return false;
      }
      //비밀번호 확인
      if ($("#password-check").val() !== $("#password-check").val()) {
        $("#password-check").focus();
        return false;
      }
      // 아이디랑 비밀번호랑 같은지
      if ($("#id").val() == ($("#password").val())) {
        $("#password").focus();
        return false;
      }
      //이름
      if (!nameReg.test($("#name").val())) {
        $("#name").focus();
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
      $('.join-form').submit();
    });
    //회원가입 전송

    $('#id').on('blur', function (event) {
      var user_id = $('#id').val();

      if (user_id == "") {
        $("#idMessage").show();
        $("#idMessage").text("아이디를 입력해주세요.");
        return false;
      }
      $.ajax({
        url: '/member/idcheck',
        type: 'post',
        data:{userId: user_id},
        dataType:'json',
        success: function (data) {
          console.log(data);
          if (data == 1) {
            $("#idMessage").show();
            $("#idMessage").text("이미 가입된 아이디입니다.")
            return false;
          } else if (!idReg.test(user_id)) {
            $("#idMessage").show();
            $("#idMessage").text("아이디는 숫자 문자 포함 6~10자로 입력해주세요.");
            return false;
          } else {
            $("#idMessage").hide();
            return false;
          }
        }, //end-success
        error: function () {
          console.log("실패");
        } //end-error
      }) //ajax
    });

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
        $("#password-check").val("");
        $("#pwCheckMessage").show();
        $("#pwCheckMessage").text("비밀번호랑 비밀번호 확인이 다릅니다.");
        return false;
      } else {
        $("#pwCheckMessage").hide();
        return false;
      }
    });

    $('#name').on('blur', function (event) {
      if ($('#name').val() == "") {
        $("#nameMessage").show();
        $("#nameMessage").text("이름을 입력해주세요.");
        return false;
      } else if (!nameReg.test($("#name").val())) {
        $("#nameMessage").show();
        $("#nameMessage").text("이름이 형식에 맞지 않습니다.");
        return false;
      } else {
        $("#nameMessage").hide();
        return false;
      }
    });

    $('#phone').on('blur', function (event) {
      var user_phone = $('#phone').val();
      if (user_phone === "") {
        $("#phoneMessage").show();
        $("#phoneMessage").text("휴대폰 번호를 입력해주세요.");
        return false;
      }

      $.ajax({
        url: '/member/phonecheck',
        type: 'post',
        data: {userPhone: user_phone},
        dataType : 'json',
        success: function (data) {
          console.log(data);

          if (data == 1) {
            $("#phoneMessage").show();
            $("#phoneMessage").text("사용 중인 휴대폰 번호입니다.");
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
    });

    $('#email').on('blur', function (event) {
      var user_email = $('#email').val();

      if (user_email === "") {
        $("#emailMessage").show();
        $("#emailMessage").text("이메일을 입력해주세요.");
        return false;
      }
      $.ajax({
        url: '/member/emailcheck',
        type: 'post',
        data:{userEmail: user_email},
        dataType:'json',
        success: function (data) {
          console.log(data);
          if (data == 1) {
            $("#emailMessage").show();
            $("#emailMessage").text("사용 중인 이메일입니다.");
          } else if (!emailReg.test(user_email)) {
            $("#emailMessage").show();
            $("#emailMessage").text("이메일 형식이 틀립니다.");
          } //if
          else {
            $("#emailMessage").hide();
          }

        }, //end-success
        error: function () {
          console.log("실패");
        } //end-error
      }) //ajax
    });
  });
});