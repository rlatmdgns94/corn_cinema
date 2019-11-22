<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>관리자 회원 목록</title>

</head>
<body>
 <jsp:include page="../MN_header.jsp"  flush="false"/>
<form class="mn-member-board-table" name="memberList" method="post" action="/admin/memberBoardList">
     <div class="mn-member-list-board-cinema">
       <div class="mn-member-top-menu-wrapper">
      
	         <input type="text" class = "mn-member-search-text" name="keyword"id="keyword" placeholder="회원ID 입력" value="${empty pageDTO.keyword?'':pageDTO.keyword}">
	         <input type="button" id="mn-member-search" value="검색" onclick="memberListSearchForm()" >
	         <input type="button" id="mn-member-allsearch" value="모두검색" onclick="memberListAllSearchForm()">

       </div>
   <input type="hidden" name="selectPageNum" id="selectPageNum">
   <table class= "mn-member-board-table" summary="회원 전체리스트">
      <colgroup>
         <col width="12%">
         <col width="12%">
         <col width="18%">
         <col width="15%">
         <col width="15%">
         <col width="15%">
         <col width="8%">
      </colgroup>
      <thead class="thead-mn-member-board">
         <tr class="tr">
            <th scope="col">아이디</th>
            <th scope="col">이름</th>
            <th scope="col">이메일</th>
            <th scope="col">가입날짜</th>
            <th scope="col">회원수정날짜</th>
            <th scope="col">최근방문시간</th>   
        
         </tr>
       </thead>
     <tbody class="movie-board-detail">
      <c:forEach items="${list}" var="member">
         <tr class="trboard">

            <td><a href="admin_member_modify?id=${member.id}">${member.id}</a></td>  
            <td>${member.name}</td>
            <td>${member.email}</td>
            <td>${member.regdate}</td>
            <td>${member.updatedate}</td>
            <td>${member.connection_time}</td>
            
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
            <c:choose>
                <c:when test="${num == pageDTO.page}"><a href="javascript:goPage(${num})" class="choice">${num}</a></c:when>
                <c:otherwise><a class="paginate_button" href="${num}">${num} </a></c:otherwise>
            </c:choose>   
         </c:forEach>
               
         <c:if test="${pageDTO.next}">
            <a class="paginate_button" href="${pageDTO.endPage +1}">다음</a>
         </c:if>
      </c:if>
      
    <script type="text/javascript" src="http://code.jquery.com/jquery-1.11.0.min.js"></script>
	
	<script>
	   console.log($("#keyword").val(""));
	  
	   $(document).ready(function(){
	      $(".paginate_button").click(function(e){
	         e.preventDefault();
	      
	         var pageNum = $(this).attr("href");
	           console.log("pageNum:" , pageNum);
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
    
    
  </div>  
</form>
</body>
</html>