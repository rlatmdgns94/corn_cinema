<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>맴버 리스트</title>
<link rel="stylesheet" href="/resources/css/MN_movie_list.css">

<script type="text/javascript" src="http://code.jquery.com/jquery-1.11.0.min.js"></script>
<script>
      console.log($("#keyword").val(""));
  
   $(document).ready(function(){
      $(".paginate_button").click(function(e){
         e.preventDefault();
      
         var pageNum = $(this).attr("href");
           console.log("pageNum:" , pageNum);
           
              $(".paginate_button").css("background-color","red");
      //      $("#selectPageNum").val(pageNum).css("background-color","red");
     
           $("#keyword").val("");  
           $("#selectPageNum").val(pageNum);

            memberList.submit();       
      })
   })
   function memberListSearchForm() {
      var keyword = $("#keyword");
                                       //공백제거
      if(keyword.val().split(" ").join("")==""){
         alert("검색단어를 입력하시기 바랍니다.");
         keyword.focus();
         return;
      }
      $("#selectPageNum").val("1");   // selectPageNum=1 값 < - default 반환
        memberList.submit();   
   }
   
   function memberListAllSearchForm(){

      $("#keyword").val("");
        memberList.submit();
   }
</script>
</head>
<body>
       
<form class="movie-board-table" name="memberList" method="post" action="/admin/memberBoardList">
     <div class="movie-list-board-cinema">
       <div class="top-menu-wrapper">
         <div class="search-wrapper">
         
        
      
         <input type="text"    style="height: 19px;width: 162px" name="keyword"id="keyword" placeholder="회원ID 입력" value="${empty pageDTO.keyword?'':pageDTO.keyword}">
         <input type="button"  style="height: 25px;width: 85px" value="검색" onclick="memberListSearchForm()" >
         <input type="button"  style="height: 25px;width: 85px" value="모두검색" onclick="memberListAllSearchForm()"> 
     
      </div>
       </div>
   <input type="hidden" name="selectPageNum" id="selectPageNum">
   <table class=movie-board-table summary="회원 전체리스트">
      <colgroup>
         <col width="12%">
         <col width="12%">
         <col width="18%">
         <col width="15%">
         <col width="15%">
         <col width="15%">
         <col width="8%">
      </colgroup>
      <thead class="thead-movie-board">
         <tr class="tr">
            <th scope="col">아이디</th>
            <th scope="col">이름</th>
            <th scope="col">이메일</th>
            <th scope="col">가입날짜</th>
            <th scope="col">회원수정날짜</th>
            <th scope="col">최근방문시간</th>   
            <th scope="col">수정하기</th>
         </tr>
       </thead>
     <tbody class="movie-board-detail">
      <c:forEach items="${list}" var="member">
         <tr class="trboard">
            <td>${member.id}</td>
            <td>${member.name}</td>
            <td>${member.email}</td>
            <td>${member.regdate}</td>
            <td>${member.updatedate}</td>
            <td>${member.connection_time}</td>
            <td><a href="admin_member_modify?id=${member.id}">수정하기</a> </td>
         </tr>
        </c:forEach>
        <c:if test="${empty list}">
           <tr>
              <td colspan=7>
              검색결과가 없습니다.
              </td>
        </c:if>
      </tbody>
   </table>
    
      <c:if test="${memberListCount>0}">   
               <c:if test="${pageDTO.prev}">
                  <a class="paginate_button" href="${pageDTO.startPage -1}">이전</a>
               </c:if>
               
               <c:forEach var="num" begin="${pageDTO.startPage}" end="${pageDTO.endPage}">
                  <a class="paginate_button" href="${num}">${num} </a>
               </c:forEach>
               
               <c:if test="${pageDTO.next}">
                  <a class="paginate_button" href="${pageDTO.endPage +1}">다음</a>
               </c:if>
         </c:if>
    
  </div>  
</form>
</body>
</html>