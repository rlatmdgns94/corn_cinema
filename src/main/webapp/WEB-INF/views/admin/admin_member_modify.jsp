<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>관리자 회원 수정</title>
</head>
<body>
<jsp:include page="../MN_header.jsp"  flush="false"/>

	    <%-- ${modifyId.id}
	 	${modifyId.name}
	    ${modifyId.email}
	    ${modifyId.regdate}
		${modifyId.updatedate}
		${modifyId.connection_time} --%>

 <div class="mn-member-modify">
      <form class="mn-member-modify-form" method="POST">
  
          <div class="mn-member-modify-wrap">
            <table class="mn-member-modify-table">
              <caption class="mn-member-modify-board-title"> 회원 정보 수정</caption>

              <tbody>

                  <tr>
                      <th><label for="modify-memberid"></label>회원ID : </label></th>
                      <td><input type="text" name="id" value ="${modifyId.id}" disabled/></td>
                  </tr>
                  <tr>
                    <th><label for="modify-membername">이  름 : </label></th>
                    <td><input type="text"  value = "${modifyId.name}" name="name"/></td>
                  </tr>
                <tr>
                    <th><label for="modify-email"></label>이메일 : </label></th>
                    <td><input type="text" value = "${modifyId.email}" name="email"/> </td>
                </tr>
              </tbody>
            </table>
          </div>

          <div class="modify-submit-wapper">
              <input type="button" value="완료" class="modify-submit-btn" />
              <input type="button" value="취소" class="modify-cancel-btn" />
          </div>

      </form>
    </div>


</body>


</html>