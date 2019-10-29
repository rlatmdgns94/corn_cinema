<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html lang="ko">

<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <meta http-equiv="X-UA-Compatible" content="ie=edge">
  <title>최신 상영작</title>
  <link rel="stylesheet" href="resources/css/style.css">
  <script type="text/javascript" src="http://code.jquery.com/jquery-1.11.0.min.js"></script>
  <script type="text/javascript" src="http://code.jquery.com/jquery-migrate-1.2.1.min.js"></script>
</head>

<script>

var movie_num = '${movieRead.movie_num}';
var id = '${login.id}';


//댓글 리스트
   function getReply() {
      $.ajax({
         url : "/comment_list",  //요청 URL
         
         type : "GET",  //GET 방식
         
         data : {
            "movie_num":movie_num    //movie_num 값 넘겨줌?
         },
         
         success: function(data){  //성공
         
            
            var str =""; 
             
            console.log("--data.length: \n" , data.length);   
            console.log("--data : \n" , data); 
            
        
            if(data.length > 0){
                 $.each(data, function(key, value){
                   console.log(value);
                         str += "<ul class='review-content'>";
                         str += "<li>" ;
                         str += "<div class='review-box'>" ;
                         str +=  "<div class='result-score'>";
                         str += "<span>평점 </span>"+value.score+" <span></span>" ;
                         str += "</div>" ;

                            str += "<p class='review-text-reulst'>"+value.comment+"</p>" ;
                            str += "<span class='review-date'>"+value.regdate+"</span>" ;
                         str += "</div>" ;
                         str += "<div class='review-name'>" ;
                         
                         var $writer = '';
                         
                         $writer += value.name.charAt(0);
                         for (var i = 1; i < value.name.length - 1; i++) {
                            $writer += '*';
                         }
                         
                         $writer += value.name.charAt(value.name.length - 1);
                         
                         str += "<span>"+$writer;                 
                         if(value.id == id ){
                           str += "<div class = 'replyFooter'>";
                            str += "<button type ='button' class='replyModify-btn'>수정</button>";
                            str += "<button  type ='button' class='replyDelete-btn'>삭제</button>";
                            str +="</span>" ;   
                            str += "</div>";
                            str += "</div>" ;
                            str += "</li>" ;
                            str += "</ul>" ; 
                         } else{
                         str +="</span>" ;
                         str += "</div>" ;
                         str += "</li>" ;
                         str += "</ul>" ; 
                         
                         }
                  });  //each    
               } 
            else{
                          
                         str += "<ul class='review-content'>";
                         str += "<li>" ;
                         str += "<div class='review-box'>" ;
                         str +=  "<div class='result-score'>";
                         str += "<span> </span><span></span>" ;
                         str += "</div>" ;
                         str += "<p class='review-text-reulst'>등록된 댓글이 없습니다. 댓글을 등록해보세요</p>" ;
                         str += "<span class='review-date'></span>" ;
                         str += "</div>" ;
                         str += "</li>" ;
                         str += "</ul>" ; 
                }  //if-else
             
            $("#review-entry").html(str); 
         },  //success
         error: function(){
            console.log("error"); 
         }  //error
         
      });  //ajax
   }  //getReply

function commentModify(){

}  //commentModify
   
   

 $(document).ready(function(){
    getReply();
   
}); // (document).ready
 
</script>


<body>
  	<jsp:include page="header.jsp"  flush="false"/>
  <div class="layout-content movie-detail-wrap">
    <div class="movie-detail">
      <div class="movie-detail-img">
        <a href="javascript:void(0);">
          <img src="resources/img/movie_poster/${movieRead.view_path}">
        </a>
      </div>
      <div class="movie-detail-info">
        <h3 class="info-title"><strong>${movieRead.title}</strong></h3>
        <div class="info-data">
          <span class="blind">영화 상세 정보</span>
          <span class="score"><em>관람평점 </em><span class="num"><%--  ${replyList.avgscore} --%></span></span>
          <ul class="da2ta-movie">
             <li><span><em>개봉일 : </em>
                <fmt:formatDate value="${movieRead.opening_day}" pattern="yyyy.MM.dd" /></span></li> 
            <li><span><em>감독 : </em>${movieRead.director}</span></li>
            <li><span><em>출연진 : </em>${movieRead.actor}</span></li>
            <li><span><em>장르 : </em> ${movieRead.movie_genre} / <span>${movieRead.running_time}</span></span></li>
          </ul>
        </div>
        <a href="${path}/movie/screening/booking?movie_num=${movieRead.movie_num}" class="ticketing-btn">예매하기</a>
      </div>
    </div>
    <div class="movie-summary-area">
      <h4 class="summary-title">줄거리</h4>
      <p class="movie-summary">${movieRead.story}</p>
    </div>
  
  <c:choose>
   <c:when test="${!empty login}">  <!-- 로그인 성공시 -->
     <div class="review-wrap">
   <div class="review-top">
   
      <h3 class="review-title">평점 및 영화 리뷰</h3>
      <p class="review-etc">영화를 관람 후 리뷰를 작성해주세요</p>
      
            <p>${login.name}님</p>
            <div class="score-star">
               <select name="score" id ="score">
                  <option value="0" id="score">0점</option>
                  <option value="1" id="score">1점</option>
                  <option value="2" id="score">2점</option>
                  <option value="3" id="score">3점</option>
                  <option value="4" id="score">4점</option>
                  <option value="5" id="score">5점</option>
               </select>
            </div>
            
            <div class="score-textarea">
               <textarea id="comment" name="comment" title="영화평 입력" cols="30" rows="10" placeholder="이곳에 댓글을 입력하세요"></textarea>
            </div>
            <button class="review-btn">입력</button>
            
   <script>
   
   var movie_num = '${movieRead.movie_num}';
   var id = '${login.id}';

   
   //댓글 삽입   
   $(".review-btn").on("click", function() {
      if($("#comment").val().trim()===""){
         alert("댓글을 입력하세요");
         $("#comment").val("").focus();
      } else {
         
         
         $.ajax({
            url : "/comment_insert",
            
            type : "POST",
            
            data : {
               "id" : id, 
               "movie_num" : movie_num,
               score : $("#score").val(),
               comment : $("#comment").val()
            
            },
            
            success : function () {
               $("#comment").val("");
               $("#score option:eq(0)").attr("selected","selected");
               getReply();
            },  //success
            error : function() {
                console.log("error"); 
            }  //error
         })  //ajax
      }  //if-else
   });  //click
   </script>
   <script>
   
   //댓글 수정   
   $(document).on("click", ".replyModify-btn", function() {
       console.log("수정버튼 클릭"); 
       
       
   });  //replyModify click
   </script>
   
   <script>
      //댓글 삭제   
      $(document).on("click",".replyDelete-btn", function() {
          console.log("삭제 버튼 클릭"); 
          
           var delectConfirm = confirm("댓글을 삭제하시겠습니까?");
           
           if(delectConfirm){ 
             $.ajax({
                url : "/comment_delete",
                
                type : "POST",
                
                data : {
                     "id" : id
               },
               
               success : function() {
                  getReply();
               }, //success
               error : function() {
                  console.log("error"); 
               }  //error
             })  // ajax
            }  //if 
      });  //replyDelete click
   </script>
   
   </div>
</div>

 <div class="review-entry" id = "review-entry"></div> 


</c:when>

<c:otherwise>
      <div class="review-wrap">
         <div class="review-top">
            <h3 class="review-title">평점 및 영화 리뷰</h3>
            <p class="review-etc">영화를 관람 후 리뷰를 작성해주세요</p>
         </div>

         <div class="score-area">
         
                  <div class="score-star">
                     <select name="score">
                        <option value="0">0점</option>
                        <option value="1">1점</option>
                        <option value="2">2점</option>
                        <option value="3">3점</option>
                        <option value="4">4점</option>
                        <option value="5">5점</option>
                     </select>
                  </div>
                  <div class="score-textarea">
                     <textarea id="comment" name="comment" title="영화평 입력" cols="30"
                        rows="10" disabled placeholder="로그인 후 이용바랍니다. "></textarea>
                     <!--  disabled -->
                  </div>
                  <button class="review-btn" >입력</button>

         </div>
      </div>
      
  <div class="review-entry" id = "review-entry"></div> 

   </c:otherwise>
</c:choose>
</div>
	<jsp:include page="footer.jsp"  flush="false"/>
</body>
</html>