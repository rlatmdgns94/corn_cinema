<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>corn_cinema</title>
 <link rel="stylesheet" href="/resources/css/admin_style.css">
</head>
<body>
    
    <div class="header">                                                                                  
        <h1 class="logoimg"><img class="logoimg" src="/resources/img/logo.png" alt="에이콘시네마" width="155" height="80"></h1> 
            <div class="gnb">
                <h2 class="blind">관리자메뉴</h2>
                <ul class="nav">
                <li><a href="${path}/mn_main">예매현황</a></li>
                <li><a href="${path}/admin/memberBoardList">회원 관리</a></li>
                <li><a href="${path}/MN_Movie_Board/MN_movie_list">영화 관리</a></li>
                 <li><a href="${path}/MN_Screening_Board/MN_screening_list">상영 스케줄 관리</a></li>
                <li><a href="${path}/board/listAll">공지사항 관리</a></li>
               
                </ul>
            </div>
    </div>
    <div class="p-img">
        <img src="/resources/img/person.png">
    </div> 
             

</body>
</html>