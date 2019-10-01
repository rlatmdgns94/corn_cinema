<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Document</title>
    <link rel="stylesheet" href="/resources/css/style.css">
</head>

<body>
    <div class="main-join-wrap">
        <form class="join-form" action="/member/member_modify" method="POST">
            <div class="join-title-main">
                <h2 class="join-title">회원정보 수정</h2>
            </div>
            <div class="join-insert-wrap">
                <table class="join-table">
                    <%
                        //   scriptlet
                          Object userVo = session.getAttribute("login");
                          System.out.println("::::::userVo: ::::::::::::::::::"+ userVo);
                     %>
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
                                ${login.id}
                            </td>
                        </tr>
                        <input type="hidden" title="id" id="id" name="id" value=${login.id}>
                        <input type="hidden" title="updatedate" id="updatedate" name="updatedate"
                            value=${login.updatedate}>

                        <tr>
                            <th scope="row"><label for="password">비밀번호</label></th>
                            <td>
                                <input type="password" title="비밀번호" id="password" name="password" required="">
                            </td>
                        </tr>
                        <tr>
                            <th scope="row"><label for="user_check_pw">비밀번호 확인</label></th>
                            <td>
                                <input type="password" title="비밀번호 확인" id="user_check_pw" name="user_check_pw"
                                    required="">
                            </td>
                        </tr>
                        <tr>
                            <th>이름</th>
                            <td>
                                ${login.name}
                            </td>
                        </tr>
                        <tr>
                            <th scope="row"><label for="phone">휴대폰</label></th>
                            <td>
                                <input type="phone" title="휴대폰" id="phone" name="phone" required=""
                                    value=${login.phone}>
                            </td>
                        </tr>
                        <tr>
                            <th scope="row"><label for="email">이메일</label></th>
                            <td>
                                <input type="email" id="email" name="email" required="" value=${login.email}>
                            </td>
                        </tr>
                    </tbody>
                </table>
            </div>
            <div class="join-button-wrap">
                <input type="submit" value="수정" class="join-button join-submit">
        </form>
        <form action="/member/withdrawal_result" method="POST">
            <input type="hidden" title="id" id="id" name="id" value=${login.id}>
            <input type="submit" value="탈퇴" class="join-button member-delete-btn">
        </form>
        <!--      <a href="withdrawal_result" class="join-button member-delete-btn">회원탈퇴</a>  -->
    </div>
    </div>
</body>

</html>