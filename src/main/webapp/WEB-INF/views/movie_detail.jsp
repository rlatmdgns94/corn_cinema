<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html lang="ko">

<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <meta http-equiv="X-UA-Compatible" content="ie=edge">
  <title>최신 상영작</title>
  <link href="https://fonts.googleapis.com/css?family=Noto+Sans+KR:300,400,500,700&display=swap&subset=korean"
    rel="stylesheet">
  <link rel="stylesheet" href="resources/css/style.css">
  <link rel="stylesheet" href="resources/css/movie_detail.css">
</head>

<body>

  <div class="layout-content movie-detail-wrap">
    <div class="movie-detail">
      <div class="movie-detail-img">
        <a href="javascript:void(0);">
          <img src="resources/img/movie_poster/${movieRead.view_path}">
        </a>
      </div>
      <div class="movie-detail-info">
        <h3 class="info-title"><strong>${movieRead.title}</strong></h3>
        <div class="info-data">
          <span class="blind">영화 상세 정보</span>
          <span class="score"><em>관람평점 </em><span class="num">${movieRead.avg_score}</span></span>
          <ul class="da2ta-movie">
            <li><span><em>개봉일 : </em>
                <fmt:formatDate value="${movieRead.opening_day}" pattern="yyyy.MM.dd" /></span></li>
            <li><span><em>감독 : </em>${movieRead.director}</span></li>
            <li><span><em>출연진 : </em>${movieRead.actor}</span></li>
            <li><span><em>장르 : </em> ${movieRead.movie_genre} / <span>${movieRead.running_time}</span></span></li>
          </ul>
        </div>
        <a href="${path}/movie/screening/booking?movie_num=${movieRead.movie_num}" class="ticketing-btn">예매하기</a>
      </div>
    </div>
    <div class="movie-summary-area">
      <h4 class="summary-title">줄거리</h4>
      <p class="movie-summary">${movieRead.story}</p>
    </div>
    <div class="review-wrap">
      <div class="review-top">
        <h3 class="review-title">평점 및 영화 리뷰</h3>
        <p class="review-etc">영화를 관람 후 리뷰를 작성해주세요</p>
      </div>
      <div class="score-area">
        <form action="" method="">
          <fieldset>
            <legend class="blind">평점 및 영화 리뷰</legend>
            <div class="score-star">
              <select name="">
                <option value="0">0점</option>
                <option value="1">1점</option>
                <option value="2">2점</option>
                <option value="3">3점</option>
                <option value="4">4점</option>
                <option value="5">5점</option>
              </select>
            </div>
            <div class="score-textarea">
              <textarea id="txtComment" title="영화평 입력" cols="30" rows="10"></textarea>
            </div>
            <button class="review-btn">입력</button>
          </fieldset>
        </form>
      </div>
    </div>
    <div class="review-entry">
      <ul class="review-content">
        <li>
          <div class="review-box">
            <div class="result-score">
              <span>평점</span>
              <span>점수</span>
            </div>
            <p class="review-text-reulst">asdasdasdasdsads</p>
            <span class="review-date">2019.09.25</span>
          </div>
          <div class="review-name">
            <span>홍길동</span>
          </div>
        </li>
        <li>
          <div class="review-box">
            <div class="result-score">
              <span>평점</span>
              <span>7</span>
            </div>
            <p class="review-text-reulst">노잼노잼노잼노잼노잼노잼노잼노잼노잼
              노잼노잼노잼노잼노잼노잼노잼노잼노잼노잼노잼노잼노잼노잼노잼노잼노잼노잼노잼노
              잼노잼노잼노잼노잼노잼노잼노잼노잼노잼노잼노잼노잼노잼노잼노잼노잼노잼노잼노잼노잼노
              잼노잼노잼노잼노잼노잼노잼노잼노잼노잼노잼노잼노잼노잼노잼노잼노잼노잼노잼노잼노잼노잼노잼노잼노잼
              노잼노잼노잼노잼노잼노잼노잼노잼노잼노잼노잼노잼노잼노잼노잼노잼노잼노잼노잼노잼노잼노잼노잼노잼노잼노잼
              노잼노잼노잼노잼노잼노잼노잼노잼노잼노잼노잼노잼노잼노잼노잼노잼노잼노잼노잼노잼노잼노잼노잼노잼노잼노
              잼노잼노잼노잼노잼노잼노잼노잼노잼노잼노잼노잼노잼노잼노잼노잼노잼
              노잼노잼노잼노잼노잼노잼노잼노잼노잼노잼노잼노잼노잼노잼노잼노잼노잼노잼
            </p>
            <span class="review-date">2019.09.25</span>
          </div>
          <div class="review-name">
            <span>아귀</span>
          </div>
        </li>
        <li>
          <div class="review-box">
            <div class="result-score">
              <span>평점</span>
              <span>점수</span>
            </div>
            <p class="review-text-reulst">asdasdasdasdsads</p>
            <span class="review-date">2019.09.25</span>
          </div>
          <div class="review-name">
            <span>홍길동</span>
          </div>
        </li>
        <li>
          <div class="review-box">
            <div class="result-score">
              <span>평점</span>
              <span>점수</span>
            </div>
            <p class="review-text-reulst">asdasdasdasdsads</p>
            <span class="review-date">2019.09.25</span>
          </div>
          <div class="review-name">
            <span>짝귀</span>
          </div>
        </li>
      </ul>
    </div>
  </div>
</body>

</html>