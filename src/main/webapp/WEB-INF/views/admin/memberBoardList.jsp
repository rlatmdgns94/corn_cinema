<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page import="java.util.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table class="member-board" summary="회원 전체리스트">
		<caption> 회원 리스트</caption>
		<colgroup>
			<col width="12%">
			<col width="13%">
			<col width="9%">
			<col width="9%">
			<col width="9%">
			<col width="5%">
		</colgroup>
		<thead>
			<tr>
				<th scope="col">아이디</th>
				<th scope="col">이메일</th>
				<th scope="col">이름</th>
				<th scope="col">가입날짜</th>
				<th scope="col">회원수정날짜</th>
				<th scope="col">수정하기</th>
			</tr>
		</thead>
		<tbody>
		<c:forEach items="${list}" var="Member">
			<tr>
				<td>${Member.id}</td>
				<td>${Member.name}</td>
				<td>${Member.email}</td>
				<td>${Member.regdate}</td>
				<td>${Member.updatedate}</td>
				<td> <button> 수정하기</button> </td>
			</tr>
	     </c:forEach>
		</tbody>
	</table>
</body>
</html>