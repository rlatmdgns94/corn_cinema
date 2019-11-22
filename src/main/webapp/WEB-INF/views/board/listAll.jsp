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
<script type="text/javascript"	src="http://code.jquery.com/jquery-3.2.0.min.js"></script>
</head>
<body>
<jsp:include page="../MN_header.jsp"  flush="false"/>
	<div class="movie-list-board-cinema">
		<div class="movie-list-board-title-main">
			<h3 class="movie-board-title"></h3>
		</div>
		<span class="screening-list">공 지 사 항</span>
		<table class="movie-board-table">

			<!-- 바디부 -->
			<colgroup>
				<col width="14%" />
				<col width="40%" />
				<col width="18%" />
				<col width="15%" />				
			</colgroup>

			<thead class="thead-movie-board">
				<tr class="tr">				
					<th>번호</th>
					<th>제목</th>									
					<th>등록날짜</th>
					<th>작성자</th>					
				</tr>
			</thead>
			
			<tbody class="movie-board-detail">
				<c:forEach items="${list}" var="BoardVO">			
					<tr>			
	                    <td class="tdNo">${BoardVO.bno}</td>
	                    <td class="tdTitle"><a href="/board/read?bno=${BoardVO.bno}">${BoardVO.title}</a></td>
	                    <td class="tdDate">
	                    <fmt:formatDate pattern="yyyy-MM-dd HH:mm" value ="${BoardVO.regdate}"/></td>	
	                    <td>관리자</td>               		
					</tr>
				</c:forEach>
			</tbody>
		</table>

		<div class="movie-writing"></div>
		<!--버텀부-->
		<div class="movie-reg-button-wrapper">
			<a href="/board/register"  class="board-btn board-btn_submit">등록</a>
		</div>
		
		<tr>
	         <!--  <td colspan="5" class="tdFoot">  -->	         
	          <c:if test="${pageMaker.prev}">
	          <a href="${path}/board/listAll?page=${pageMaker.startPage-1}&laquo;"><</a>
	          </c:if> 
	          <c:forEach begin="${pageMaker.startPage}" end = "${pageMaker.endPage}" var = "idx">	
	          	<%-- 	<c:out value="${pageMaker.cri.page==idx?'class=active':''}"/> --%>
	           	<a href="${path}/board/listAll?page=${idx}">${idx}</a>	          
	          </c:forEach>
	        	<c:if test = "${pageMaker.next && pageMaker.endPage > 0}">
	          	<a href="${path}/board/listAll?page=${pageMaker.endPage+1}">&raquo;</a>
	          </c:if> 	         
	       <!--   </td> -->
        </tr>
	</div>
</body>
</html>