<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Document</title>
    <link rel="stylesheet" href="/resources/css/style.css">
</head>

<body>
    <div class="main-findpw-wrap">
        <div class="findpw-title-main">
            <p class="findpw_title">비밀번호 찾기</p>
        </div>
        <div class="find_pw_input_wrap">
            <form action="/find/find_resultpw" method="POST">
                <div class="findpw-form">
                    <!-- <label for="name">NAME</label> -->
                   <input type="text"  id="id"  name="id" placeholder="ID" title="ID입력"> <br>
                    <!-- <label for="user">E-MAIL</label> -->
                 <input type="email" id="email" name="email"  placeholder="가입된메일을 입력해주세요.(비밀번호 재설정 인증 메일을 발송합니다.)" title="메일 입력">
                </div>
                <div class="findpw-btn">
                    <input type="submit" class="findpw-btn" value="확인">
                </div>
            </form>
        </div>
        <div id="findLoginid" class="findid_another">
            혹시 아이디를 찾으시나요? <a href="find_id" class="link_find">아이디 찾기</a>
        </div>
    </div>
   </div>
</body>

</html>