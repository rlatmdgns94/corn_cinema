<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Document</title>
    <link rel="stylesheet" href="./css/style.css">
</head>

<body>

    <div class="main-join-wrap">
        <form class="join-form" action="#" method="POST">
            <div class="join-title-main">
                <h2 class="join-title">회원정보 수정</h2>
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
                                아이디
                            </th>
                            <td>
                                rkskek
                            </td>
                        </tr>
                        <tr>
                            <th scope="row"><label for="user_pw">비밀번호</label></th>
                            <td>
                                <input type="password" title="아이디" id="user_pw" name="" required="">
                            </td>
                        </tr>
                        <tr>
                            <th scope="row"><label for="user_check_pw">비밀번호 확인</label></th>
                            <td>
                                <input type="password" title="비밀번호 확인" id="user_check_pw" name="" required="">
                            </td>
                        </tr>
                        <tr>
                            <th>이름</th>
                            <td>
                                홍길동
                            </td>
                        </tr>
                        <tr>
                            <th scope="row"><label for="user_phone">휴대폰</label></th>
                            <td>
                                <input type="phone" title="휴대폰" id="user_phone" name="" required="">
                            </td>
                        </tr>
                        <tr>
                            <th scope="row"><label for="user_email">이메일</label></th>
                            <td>
                                <input type="email" id="user_email" name="" required="" placeholder='joe@example.com'>
                            </td>
                        </tr>
                    </tbody>
                </table>
            </div>
            <div class="join-button-wrap">
                <input type="submit" value="수정" class="join-button join-submit">
                <a href="#" class="join-button member-delete-btn">회원탈퇴</a>
            </div>
        </form>
    </div>
</body>

</html>