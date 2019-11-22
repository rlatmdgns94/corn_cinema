<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
  <link rel="stylesheet" href="/resources/css/style.css">
</head>

<body>
  <jsp:include page="../header.jsp" flush="false" />
  <div class="notice-area">
    <div class="notice-top">
      <h2 class="tit">공지사항</h2>
      <p class="sub-tit">CORN CINEMA의 주요한 이슈 및 여러가지 소직들 확인할 수 있습니다.</p>
    </div>
    <form role="form" method="post">
      <input type='hidden' name='bno' value="${boardVO.bno}">
    </form>
    <div class="board_view_area">
      <ul class="top-title-faq">
        <li class="title"><strong>${boardVO.title}</strong></li>
        <li class="stit-area">
        </li>
      </ul>
      <div class="view-area">
        <p>
          ${boardVO.content}
        </p>
      </div>
    </div>
    <div class="notice-button-wrap">
      <!--  <a class="board-btn board-btn_submit"
                href="/board/listAll">�������</a>
                <a class="board-btn"
                href="/board/modify">�����ϱ�</a>
                <a class="board-btn board-btn_submit"
                href="/board/remove">�����ϱ�</a> -->
      <!-- <button id="modify" type="submit" class="board-btn board-btn_submit">�����ϱ�</button>
				<button id="delete" type="submit" class="board-btn">�����ϱ�</button>
				<button id="list" 	type="submit" class="board-btn board-btn_submit">�������</button> -->
      <a href="/" class="board-btn board-btn_submit">��������</a>
    </div>
  </div>
  <jsp:include page="../footer.jsp" flush="false" />
</body>
<script>
  $(document).ready(function () {
    var formObj = $("form[role='form']");
    console.log(formObj);
    $('#modify').on("click", function () {
      formObj.attr("action", "/board/modify");
      formObj.attr("method", "get");
      formObj.submit();
    });

    $('#delete').on("click", function () {
      formObj.attr("action", "/board/remove");
      formObj.submit();
    });

    $('#list').on("click", function () {
      self.location = "/board/listAll";
    });

  });
</script>

</html>