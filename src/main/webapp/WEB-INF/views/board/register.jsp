<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.util.*"%>

<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html lang="en">
<body>
	<jsp:include page="../MN_header.jsp"  flush="false"/>
	<div class="notice-content-write">
	    <div class="board-write ">
	     	<h3 class="notice_title">공지사항</h3>
			<form method="post">
               <div align="center">
	               <table>
		               <tr>
		                  <th>제  목 </th>
		                 <td>
		                   <input type="text" size="60" name='title' Maxlength="30" class="board-title-input">
		                 </td>
		               </tr>
		               <tr>
		                 <th>본  문</th> 
		                 <td><textarea rows="15" cols="60" name="content" class="board-textarea"></textarea></td>
		               </tr>        
	               </table>
	               <div class="board-btn-area">
	                	<input type="submit" value="등 록" class="board-btn board-btn_submit">
	                    <a href="/board/listAll"  class="board-btn board-btn_submit">메인으로</a>
	               </div>
               </div>  
            </form>
	    </div>
     </div>
</body>


</html>
