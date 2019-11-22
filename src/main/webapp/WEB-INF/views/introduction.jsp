<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<html lang="ko">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>3조 소개 페이지</title>
    <link rel="stylesheet" href="/resources/css/style.css">
    <link rel="stylesheet" type="text/css" href="/resources/slick/slick.css"/>
    <link rel="stylesheet" type="text/css" href="/resources/slick/slick-theme.css"/>
    <style>
        .slider-for{
            height: 400px;
            overflow: hidden;
        }
        .slider-nav img{
            display:inline-block !important;
            width: 200px;
            border: 1px solid rgb(0, 0, 0);
            border-top-left-radius: 2em;
            border-top-right-radius: 2em;
            border-bottom-left-radius: 2em;
            border-bottom-right-radius: 2em;
        }
        .slider-nav div{   
            text-align: center;
        }
    </style>
</head>
<body>
      
      
      <jsp:include page="header.jsp" flush="false" />         
    <div class="intro-main-img">
        <div class="text-center">
            <h2 class="intro-title">About Us</h2>
        </div>
    </div>
    <div class="intro-container">
        <div class="introtitle text-center">
            <img src="/resources/img/group.png" width="100px">
            <h2>[WE DO]</h2>
            <p>Project 제작과정</p>
    </div>
    <div class="slidewrap">
        <div class="slider-for">
            <div><img src="/resources/img/그림/popcorn.jpg"></div>
            <div><img src="/resources/img/그림/peng1.jpg"></div>
            <div><img src="/resources/img/그림/peng2.jpg"></div>
            <div><img src="/resources/img/그림/peng3.jpg"></div>
            <div><img src="/resources/img/그림/peng3.jpg"></div>
        </div>
    </div>
    <div class="slidewrap2">
        <div class="slider-nav">
            <div><img src="/resources/img/그림/popcorn - 복사본.jpg""></div>
            <div><img src="/resources/img/그림/peng1 - 복사본.jpg"></div>
            <div><img src="/resources/img/그림/peng2 - 복사본.jpg"></div>
            <div><img src="/resources/img/그림/peng3 - 복사본.jpg"></div>
        </div>
    </div>    
        <div class="icon-part1">
            <div class="col-1">
                <dt>
                    <div class="first">
                        <img src="/resources/img/support.png" alt="그룹" width="100px">
                    </div>
                </dt>
            </div>
        </div>
        
        <div class="row icon-part2">
            <div class="frontTitle">
                <h4>[WE ARE]</h4>
                <p>3조 팀원을 소개합니다</p>
            </div>
            <div class="col-2">
                <dt>
                    <div class="circle">
                        <img src="/resources/img/sunhun_icon.png" alt="프론트장" width="200px">
                    </div>
                    <dd>
                        <h3>Front develope Leader</h3>
                        <span>김 승 훈 </span>
                        <p>메인화면, 예매페이지<br>
                        영화상세페이지, 마이페이지 외<br>
                        전반적 프로젝트 화면 구현</p>
                    </dd>  
                </dt>
            </div>
            <div class="col-2">
                <dt>
                    <div class="circle">
                        <img src="/resources/img/jinyoung_icon.png" alt="조원" width="200px">
                    </div>
                    <dd>
                        <h3>Front developer</h3>
                        <span>김 진 영<br></span>
                        <p>로그인, ID/PW 찾기 <br>
                            마이페이지 화면 구현<br> 
                        관리자 영화 등록 서비스 구현  </p>
                    </dd>  
                </dt>
            </div>
            <div class="col-2">
                <dt>
                    <div class="circle">
                        <img src="/resources/img/jooyoung_icon.png" alt="조원" width="200px">
                    </div>
                    <dd>
                        <h3>Front developer</h3>
                        <span>김 주 영</span>
                        <p>회원가입 양식 및 가입/탈퇴 완료 페이지<br>
                            공지사항 등록, 게시글 화면 구현
                        <br>소개페이지, 관리자 상영등록 양식 구현</p>
                    </dd>  
                </dt>
            </div>
        </div>

        <div class="row icon-part3">
            <div class="col-3">
                <dt>
                    <div class="circle">
                        <img src="/resources/img/sungwon_icon.png" alt="백엔드장"" width="200px">
                    </div>
                    <dd>
                        <h3>Back develope Leader</h3>
                        <span>전 승 원</span>
                        <p>전체 DB설계 및 영화예매<br> 
                            마이페이지 예매내역 출력<br>
                            관리자 예매현황, 상영스케줄 서비스구현</p>
                    </dd>  
                </dt>
            </div>
            <div class="col-3">
                <dt>
                    <div class="circle">
                        <img src="/resources/img/sulbi_icon.png" alt="조원" width="200px">
                    </div>
                    <dd>
                        <h3>Back developer</h3>
                        <span>김 슬 비</span>
                        <p>movie, view 관련 DB(수정 및 추가)<br>
                        영화 정보 관련 서비스 전체,<br> 
                        댓글&총평점, 관리자 - 영화 관리 서비스</p>
                    </dd>  
                </dt>
            </div>
            <div class="col-3">
                <dt>
                    <div class="circle">
                        <img src="/resources/img/kihuan_icon.png" alt="조원" width="200px">
                    </div>
                    <dd>
                        <h3>Back developer</h3>
                        <span>권 기 환</span>
                        <p>회원관련 DB설계 로그인 로그아웃<br>
                            ID/PW찾기 및 회원 가입/탈퇴<br>
                            회원정보 관리 및 서비스구현</p>
                    </dd>  
                </dt>
            </div>
            <div class="col-3">
                <dt>
                    <div class="circle">
                        <img src="/resources/img/junghun_icon.png" alt="조원" width="200px">
                    </div>
                    <dd>
                        <h3>Team Leader & Back</h3>
                        <span>정 훈</span>
                        <p>영화예매페이지, 관리자 게시판
                        <br>요구사항명세서작성, DB설계 
                        <br>및 서비스 구현
                        </p>
                    </dd>  
                </dt>
            </div>
        </div>
        <div class="team-textarea">
            <div class="textcontentsc">
                <img src="/resources/img/settings.png" width="100px">
                <h4>[WE USE]</h4>
                <p>개발환경<br>
                OS: Chrome / window10 <br>
                Language: Html5, CSS3, Javascript, Jquery, Ajax Java<br>
                DB: MySQL<br>
                Server: Apache Tomcat<br>
                Framework: Spring MVC<br>
            </div>   
            
        </div>
    </div>
   
    <script type="text/javascript" src="//code.jquery.com/jquery-1.11.0.min.js"></script>
    <script type="text/javascript" src="//code.jquery.com/jquery-migrate-1.2.1.min.js"></script>
    <script type="text/javascript" src="/resources/slick/slick.min.js"></script>
    
    <script type="text/javascript">
        $(document).ready(function(){    
            $('.slider-for').slick({
                slidesToShow: 1,
                slidesToScroll: 1,
                arrows: false,
                fade: true,
                asNavFor: '.slider-nav'
                });
              
            $('.slider-nav').slick({
                slidesToShow: 4,
                slidesToScroll: 1,
                asNavFor: '.slider-for',
                dots: false,
                centerMode: true,
                focusOnSelect: true
            });
        })
    </script>
    <jsp:include page="footer.jsp" flush="false" />    
</body>
</html>