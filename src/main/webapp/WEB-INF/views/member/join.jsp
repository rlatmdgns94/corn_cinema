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
        <div class="main-join-wrap">
            <form class="join-form" action="/member/join" method="POST">
                <div class="join-title-main">
                    <h2 class="join-title">회원가입</h2>
                </div>
                <div class="join-insert-wrap">
                    <table class="join-table">
                        <caption class="blind">회원가입 정보입력</caption>
                        <colgroup>
                            <col style="width:20%">
                        </colgroup>
                        <tbody>
                            <tr>
                                <th scope="row">
                                    <label for="id">*아이디</label>
                                </th>
                                <td>
                                    <input type="text" title="아이디" id="id" name="id" maxlength="12" required="">
                                    <button class="check-bt">중복확인</button>
                                </td>
                            </tr>
                            <tr>
                                <th scope="row"><label for="password">*비밀번호</label></th>
                                <td>
                                    <input type="password" title="비밀번호" id="password" name="password" required="">
                                </td>
                            </tr>
                            <tr>
                                <th scope="row"><label for="user_check_pw">*비밀번호 확인</label></th>
                                <td>
                                    <input type="password" title="비밀번호 확인" id="user_check_pw" name="user_check_pw" required="">
                                </td>
                            </tr>
                            <tr>
                                <th><label for="name">*이름</label></th>
                                <td>
                                    <input type="text" title="이름" id="name" name="name" required="">
                                </td>
                            </tr>
                            <tr>
                                <th scope="row"><label for="phone">*휴대폰</label></th>
                                <td>
                                    <input type="text" title="휴대폰" id="phone" name="phone" required="">
                                </td>
                            </tr>
                            <tr>
                                <th scope="row"><label for="email">*이메일</label></th>
                                <td>	
                                    <input type="email" id="email" name="email" required="">
                                </td>
                            </tr>
                        </tbody>
                    </table>
                </div>
                <div class="join-button-wrap">
                    <input type="submit" value="회원가입" class="join-button join-submit">
                    <input type="reset" value="취소" class="join-button">
                </div>
            </form>
        </div>
    </body>
</html>