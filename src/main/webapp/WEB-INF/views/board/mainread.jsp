<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
	<link rel="stylesheet" href="/resources/css/style.css"> 
</head>
<body>
<jsp:include page="../header.jsp"  flush="false"/>
        <div class="notice-area">
            <div class="notice-top">
                <h2 class="tit">공지사항</h2>
                <p class="sub-tit">CON CINEMA 의 주요한 이슈 및 여러가지 소식들을 확인할실 수 있습니다.</p>
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
                href="/board/listAll">목록으로</a>
                <a class="board-btn"
                href="/board/modify">수정하기</a>
                <a class="board-btn board-btn_submit"
                href="/board/remove">삭제하기</a> -->
                <!-- <button id="modify" type="submit" class="board-btn board-btn_submit">수정하기</button>
				<button id="delete" type="submit" class="board-btn">삭제하기</button>
				<button id="list" 	type="submit" class="board-btn board-btn_submit">목록으로</button> -->
				<a href="/"  class="board-btn board-btn_submit">메인으로</a>
			</div>
        </div>
        <jsp:include page="../footer.jsp"  flush="false"/>
</body>

<script>
	
	$(document).ready(function(){
		
		var formObj = $("form[role='form']");
		
		console.log(formObj);
		
		$('#modify').on("click", function(){
			formObj.attr("action", "/board/modify");
			formObj.attr("method", "get");		
			formObj.submit();
		});
		
		$('#delete').on("click", function(){
			formObj.attr("action", "/board/remove");
			formObj.submit();
		});
		
		$('#list').on("click", function(){
			self.location = "/board/listAll";
		});
		
	});

</script>
</html>