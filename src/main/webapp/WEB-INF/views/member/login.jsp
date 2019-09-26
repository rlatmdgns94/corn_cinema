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

        <div class="membership-login-form">
        
            <h2 class="login-logo"><img src="/resources/img/logo_black.png" alt=""></h2>
            <form action="/member/login_Post" method="Post" accept-charset="UTF-8">
            
                <div class="login-form">
                    <input type="text" id="id" name="id" placeholder="ID" title="아이디 입력">
                    <input type="password"  id="password" name="password"placeholder="PASSWORD" title="비밀번호 입력">
                </div>
                
                <div class="login-btn-area">
                    <input type="submit" class="login-btn" value="로그인" title="로그인버튼">
                </div>
                
                <div class="login-lnk">
                    <ul class="login-menu">
                        <li><a href="/member/join">회원가입</a></li>
                        <li><a href="/find/find_id">아이디 찾기</a></li>
                        <li><a href="javascript:void(0)">비밀번호 찾기</a></li>
                    </ul>
                </div>
            </form>
        </div>
    </body>
</html>