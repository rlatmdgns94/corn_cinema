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
  <div class="main-findid-wrap">
    <div class="findid-title-main">
      <p class="findid_title">아이디 찾기</p>
    </div>
    <div class="find-id-wrap">
      <form action="/find/find_resultid" method="POST">
        <div class="find-form">
          <input type="text" id="name" name="name" placeholder="이름" title="이름입력"> <br>
          <input type="email" id="email" name="email" placeholder="가입된메일을 입력해주세요." title="메일 입력">
        </div>
        <div class="find-btn">
          <input type="submit" class="find-btn" value="확인">
        </div>
      </form>
    </div>
    <div id="findLoginpw" class="find_another">
      혹시 비밀번호를 찾으시나요? <a href="find_pw" class="link-find">비밀번호 찾기</a>
    </div>
  </div>
</body>

</html>