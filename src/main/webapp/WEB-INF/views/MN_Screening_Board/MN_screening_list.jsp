<%@ page language="java" contentType="text/html; charset=UTF-8"
   pageEncoding="UTF-8"%>
<%@ page import="java.util.*"%>

<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<!DOCTYPE html>

<html>
<head>
<meta charset="UTF-8">
<title>영화 상영 리스트</title>

<script type="text/javascript"
   src="http://code.jquery.com/jquery-3.2.0.min.js">
   </script>
<style>
.movie-board-bottom a:hover {
   background-color: rgb(0, 0, 0);
   color: white;
}

.movie-board-bottom a:active {
   background-color: rgb(119, 119, 119);
   color: white;
}
</style>

<script>
     $(".movie-board-bottom a").click(function() {
        toggleClass(".active");
    }); 

    </script>
</head>
<body>

<jsp:include page="../MN_header.jsp"  flush="false"/>
   <div class="movie-list-board-cinema">
      <div class="movie-list-board-title-main">
         <h3 class="movie-board-title"></h3>
      </div>
      <span class="screening-list">영화 상영 리스트 </span>
      <table class="movie-board-table">

         <!-- 바디부 -->
         <colgroup>
            <col width="14%" />
            <col width="40%" />
            <col width="18%" />
            <col width="25%" />
            <col width="13%" />
         </colgroup>

         <thead class="thead-movie-board">
            <tr class="tr">

               <th style="display: none">SCREENING_NUM</th>
               <th>NUM</th>
               <th>TITLE</th>
               <th>LOCAL</th>
               <th>MOVIE START TIME</th>
               <th>DELETE</th>
            </tr>
         </thead>
         <div class="top-menu-wrapper">
            <div class="search-wrapper">

               <select name="movie-search-category">
                  <option selected disabled hidden>TITLE</option>
                  <c:forEach items="${listTitle}" var="listTitle">
                     <option value="">${listTitle.title}</option>
                  </c:forEach>
               </select> 
               <select name="movie-search-category">
                  <option selected disabled hidden>LOCAL</option>
                  <c:forEach items="${listCinema}" var="listCinema">
                     <option value="">${listCinema.local_info_city}
                        ${listCinema.local_info_dist}</option>
                  </c:forEach>
               </select> 
               <select name="movie-search-category">
                  <option selected disabled hidden>MOVIE START TIME</option>
                  <c:forEach items="${listStartTime}" var="listStartTime">
                     <option value="">${listStartTime.movie_start_time}</option>
                  </c:forEach>
               </select>

               <button type="submit" class="movie-search-btn" onclick="">
                  <img src="/resources/img/glass.png">
               </button>
            </div>
         </div>


         <tbody class="movie-board-detail">
            <c:forEach var="mnlist" items="${list}" varStatus="status">
               <tr class="trboard">
                  <td class="screening_num" style="display: none">${mnlist.screening_num}</td>
                  <td>${status.index+1}</td>
                  <td class="tdTitle">${mnlist.title}</td>
                  <td class="tdLocal">${mnlist.local_info_city}
                     ${mnlist.local_info_dist}</td>
                  <td class="tdMoviestarttime">${mnlist.movie_start_time}</td>
                  <td>
                     <button type="button" class="mypage-btn"
                        value="${mnlist.screening_num}">삭제</button>
                  </td>
               </tr>
            </c:forEach>
         </tbody>
      </table>

      <div class="movie-writing">
      </div>
      <!--버텀부-->
      <div class="movie-reg-button-wrapper">
         <button type="submit" class="movie-register-btn">
            <a href="${path}/MN_Screening_Board/MN_screening_register">등록</a>
         </button>
      </div>

      <div class="movie-board-bottom">
            <tr>
                   
                       <c:if test="${pageMaker.prev}">
                       <a href="${path}/MN_Screening_Board/MN_screening_list?page=${pageMaker.startPage-1}&laquo;"><</a>
                    </c:if> 
                    <c:forEach begin="${pageMaker.startPage}" end = "${pageMaker.endPage}" var = "idx">
        
                       <%--    <c:out value="${pageMaker.cri.page==idx?'class=active':''}"/> --%>
                          <a href="${path}/MN_Screening_Board/MN_screening_list?page=${idx}">${idx}</a>
                      
                    </c:forEach>
                     <c:if test = "${pageMaker.next && pageMaker.endPage > 0}">
                       <a href="${path}/MN_Screening_Board/MN_screening_list?page=${pageMaker.endPage+1}">&raquo;</a>
                    </c:if> 
                   
                </tr>
      </div>
   </div>
</body>
<script>
$(function() {
   var screening_num="";
   $(".mypage-btn").on("click", function() {
      screening_num = $(this).val();
      del(screening_num); 
      console.log(screening_num);
   })
})

   function del(screening_num){
      var ok = confirm("정말 삭제하시겠습니까?");
      if(ok){
         location.href='/MN_Screening_Board/MN_screening_list/delete?screening_num='+screening_num;
      }
      
   }
</script>
</html>