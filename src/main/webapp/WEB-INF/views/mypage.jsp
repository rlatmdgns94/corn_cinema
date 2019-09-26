<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Document</title>
    <link rel="stylesheet" href="./css/style.css">
</head>

<body>
    <div class="l_content mypage-wrap">
        <div class="member-info-wrap">
            <div class="join-title-main">
                <h3 class="join-title">마이페이지</h3>
            </div>
            <div class="join-insert-wrap mypage-content">
                <h4 class="mypage-subtitle">회원정보</h4>
                <table class="member-info">
                    <caption class="blind">회원정보내역</caption>
                    <colgroup>
                        <col style="width:20%">
                    </colgroup>
                    <tbody>
                        <tr>
                            <th scope="row">아이디</th>
                            <td>gorany</td>
                        </tr>
                        <tr>
                            <th scope="row">이름</th>
                            <td>고니</td>
                        </tr>
                        <tr>
                            <th scope="row">전화번호</th>
                            <td>010-1234-1234</td>
                        </tr>
                        <tr>
                            <th scope="row">이메일</th>
                            <td>asdasd@naver.com</td>
                        </tr>
                    </tbody>
                </table>
            </div>
            <a href="#" class="member-modify-btn mypage-btn">회원정보수정</a>
        </div>
        <div class="ticket-history-wrap">
            <h4 class="mypage-subtitle">예매확인/취소</h4>
            <ul>
                <li>
                    <a href="">예매 내역</a>
                </li>
                <li>
                    <a href="">지난 내역</a>
                </li>
            </ul>
            <table class="ticket-history">
                <caption class="blind">예매 내역 정보</caption>
                <colgroup>
                    <col style="width:7%">
                    <col style="width:20%">
                    <col style="width:30%">
                    <col style="width:10%">
                    <col style="width:10%">
                    <col style="width:10%">
                </colgroup>
                <thead>
                    <tr>
                        <th>NO</th>
                        <th>예매번호</th>
                        <th>영화명</th>
                        <th>영화관</th>
                        <th>상영일시</th>
                        <th>예매일</th>
                        <th>예매취소</th>
                    </tr>
                </thead>
                <tbody>
                    <tr>
                        <td>1</td>
                        <td>M123123123</td>
                        <td>엑시트</td>
                        <td>강남</td>
                        <td>2019.00.00</td>
                        <td>2019.00.00</td>
                        <td>
                            <button class="mypage-btn">예매취소</button>
                        </td>
                    </tr>
                </tbody>
            </table>
        </div>
    </div>
</body>

</html>