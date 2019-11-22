<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.*" %>

<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html lang="en">

<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <meta http-equiv="X-UA-Compatible" content="ie=edge">
  <title>관리자 페이지</title>
 

  <link class="include" rel="stylesheet" type="text/css" href="jquery.jqplot.min.css" />
  <link rel="stylesheet" type="text/css" href="/resources/dist/jquery.jqplot.min.css" />
  <script type="text/javascript" src="/resources/dist/excanvas.min.js"></script>
  <script type="text/javascript" src="/resources/dist/jquery.min.js"></script>
  <script type="text/javascript" src="/resources/dist/jquery.jqplot.min.js"></script>
  <script type="text/javascript" src="/resources/dist/plugins/jqplot.barRenderer.min.js"></script>
  <script type="text/javascript" src="/resources/dist/plugins/jqplot.categoryAxisRenderer.min.js"></script>
  <script type="text/javascript" src="/resources/dist/plugins/jqplot.pointLabels.min.js"></script>
  <script type="text/javascript" src="/resources/dist/plugins/jqplot.canvasTextRenderer.min.js"></script>
  <script type="text/javascript" src="/resources/dist/plugins/jqplot.canvasAxisLabelRenderer.min.js"></script>
  <script type="text/javascript" src="/resources/dist/plugins/jqplot.canvasAxisTickRenderer.min"></script>
  <script type="text/javascript" src="/resources/dist/plugins/jqplot.canvasGridRenderer.min"></script>
  <script type="text/javascript" src="/resources/dist/plugins/jqplot.highlighter.js"></script>
  
  <script type="text/javascript" src="/resources/dist/plugins/jqplot.pointLabels.js"></script>


 
    
</head>

<body>
  <jsp:include page="MN_header.jsp"  flush="false"/>                                                                        
      
  <div class="container">
      <!-- main 콘텐츠 내용 -->
        <div class="main-title">
          <div class="title-icon"><img src="/resources/img/chartimg.png" width="25"height="25" alt="매출현황아이콘"></div>
          <h2 class="title_txt"> 예매현황</h2>
        </div>

        <div class="content-cover"> 
          
            <div class="chart-Sales"> <!-- 매출현황그래프 -->
              <br><br>
              <div id="chart"> 
                  
          
            </div> 
        
            <div class="reservation-status"> <!--매장별 예매현황-->
              <div class="citis">
                <p class="reservation-txt">지역별 매출현황</p>
                
                  
                <div class="city-1">
                  <h3 class="city">서울 강남</h3>
                  <div class="today">
                    <p class="today_txt">TODAY</p>
                    <p class="price">${today1}</p></p>
                  </div>
                  <div class="month">
                      <p class="month_txt">MONTH</p>
                      <p class="price">${month1}</p></p>
                  </div>
                </div>
              <br>
                <div class="city-2">
                  <h3 class="city">서울 강동</h3>
                  <div class="today">
                      <p class="today_txt">TODAY</p> 
                      <p class="price">${today2}</p></p>
                    </div>
                  <div class="month">
                      <p class="month_txt">MONTH</p> 
                      <p class="price">${month2}</p></p>
                  </div>
                </div>
                <br>
                <div class="city-3">
                  <h3 class="city">경기 수원</h3>
                  <div class="today">
                    <p class="today_txt">TODAY</p>
                    <p class="price">${today3}</p></p>
                  </div>
                  <div class="month">
                      <p class="month_txt">MONTH</p>
                      <p class="price">${month3}</p></p>
                  </div>
                </div>
                <br>
                <div class="city-4">
                  <h3 class="city">경기 용인</h3>
                  <div class="today">
                    <p class="today_txt">TODAY</p>
                    <p class="price">${today4}</p></p>
                  </div>
                  <div class="month">
                      <p class="month_txt">MONTH</p>
                      <p class="price">${month4}</p></p>
                  </div>
                </div>
                
                
              </div>
            </div> <!--reservation-status-->
        
      </div> <!--content-cover-->




    
  <script>
    //매출현황 그래프 JQ-Code
    var line = new Array();
    line=${arr};
    
    
    jQuery(document).ready(function () {
    	console.log("line",line);
    
    jQuery("#chart").jqplot([line], {
          title:"<h3>지점별 예매 현황</h3>",
            
            seriesColors:['rgb(168, 161, 161)', '#00749F', '#CEF279'], 
        seriesDefaults:{

    // jQuery.jqplot.BarRenderer 막대 그래프를 그리기위한 플러그인(기본은 꺾은선)
            renderer:jQuery.jqplot.BarRenderer
            ,rendererOptions:{
              varyBarColor:false,
            }
        }
        , axes:{
            xaxis:{
                  // jqplot.CategoryAxisRenderer 축을 카테고리 (범주)로 취급 그리드를 카테고리 구분선으로 표시 할 때 필요하다.
                  
                  renderer:jQuery.jqplot.CategoryAxisRenderer
                  // X축 차트의 각 부분의 범주
                , ticks:['서울 강남', '서울 강동', '경기 수원', '경기 용인']
            }
        }
    });
});


  </script>

</body>

</html>