<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.util.*"%>

<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8" />
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
<meta http-equiv="X-UA-Compatible" content="ie=edge" />
<title>상영관 스케줄 등록 페이지</title>


<link rel="stylesheet"
	href="//code.jquery.com/ui/1.11.4/themes/smoothness/jquery-ui.css">
<script src="//code.jquery.com/jquery.min.js"></script>
<script src="//code.jquery.com/ui/1.11.4/jquery-ui.min.js"></script>
<link rel="stylesheet"
	href="//cdn.rawgit.com/fgelinas/timepicker/master/jquery.ui.timepicker.css">
<script
	src='//cdn.rawgit.com/fgelinas/timepicker/master/jquery.ui.timepicker.js'></script>


</head>
<body>
<jsp:include page="../MN_header.jsp"  flush="false"/>
	<div class="title_booking">
		<h2>영화상영등록</h2>
		<p>
			안녕하세요. 영화 상영에 필요한 정보를 입력하는 페이지 입니다.<br /> 아래의 사항들을 빠짐없이 선택해 주세요.
		</p>
	</div>

	<div class="wrap_table_form">
		<form class="mn-screening-register-form" role="form" method="POST">
			
			<table class="movie_book_table">
				<thead>
					<tr>
						<th scope="cols"></th>
						<th scope="cols"></th>
					</tr>
				</thead>
				<tbody>
					<tr>
						<th scope="row">영화선택</th>
						<td colspan="2"><select id="movie_name" name="title">
								<option value="" selected disabled hidden>영화를 선택해주세요</option>
								<c:forEach items="${listTitle}" var="listTitle">
									<option value="${listTitle.title}">${listTitle.title}</option>
								</c:forEach>
						</select></td>
					</tr>
					<tr>
						<th scope="row">영화관지정</th>
						<td  ><select id="aaa" name="local_info_city">
								<option value="" selected disabled hidden>도시를 선택해주세요</option>
								<c:forEach items="${listCinema}" var="listCinema">
									<option value="${listCinema.local_info_city}">${listCinema.local_info_city}</option>
								</c:forEach>
						</select></td>
						<td><select id="aaa" name="local_info_dist">
								<option value="" selected disabled hidden>지역을 선택해주세요</option>
								<c:forEach items="${listDist}" var="listDist">
									<option value="${listDist.local_info_dist}">${listDist.local_info_dist}</option>
								</c:forEach>
						</select></td>
					</tr>
					<tr>
						<th scope="row">상영날짜</th>
						<td colspan="2"><input type="text" id="a" placeholder="2000-00-00 00:00"
							 name="movie_start_time"></td>
					</tr>
					
				</tbody>
			</table>
			<input type="submit" class="mypage-btn" value="등록"	>
		</form>
	</div>

</body>

<style>
.mypage-btn {
  margin: 5px 0px 0px 180px;
  padding: 5px 10px;
  color: #fff;
  background: #666;
}
</style>


</html>
