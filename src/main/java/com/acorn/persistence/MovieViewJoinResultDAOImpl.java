package com.acorn.persistence;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.acorn.domain.MovieVO;
import com.acorn.domain.MovieViewJoinResultVO;
import com.acorn.domain.ViewVO;

@Repository
public class MovieViewJoinResultDAOImpl implements MovieViewJoinResultDAO {

	@Autowired
	private SqlSession sqlSession;
	private final String namespace="com.acorn.mapper.MovieViewJoinMapper";
	
	
	@Override
	public List<MovieViewJoinResultVO> movieList() throws Exception {
		
		List<MovieViewJoinResultVO> list = sqlSession.selectList(namespace + ".movieList");
		
		MovieVO movieVO = new MovieVO();
		List<ViewVO> movieViewList = new ArrayList<>();
		
	
		String movie_num = null;  //pk
		String title = null; //영화 제목
		String story = null;	//줄거리
		String actor = null;	//출연진
		String director = null;	//감독
		Date opening_day = null;	//영화 개봉일
		String film_rate = null;	//관람등급
		String running_time = null;	//상영시간
		double avg_score = 0.0;	// 영화별 평점
		String movie_genre = null;  //영화 장르
		String view_path = null;
		
		int recordNum = 0;
		
		for(MovieViewJoinResultVO vo : list) {
			++recordNum;
			
			if(recordNum == 1) {
				movieVO.setMovie_num(movie_num);
				movieVO.setTitle(title);
				movieVO.setStory(story);
				movieVO.setActor(actor);
				movieVO.setDirector(director);
				movieVO.setOpening_day(opening_day);
				movieVO.setFilm_rate(film_rate);
				movieVO.setRunning_time(running_time);
				movieVO.setAvg_score(avg_score);
				movieVO.setMovie_genre(movie_genre);
			}
			
			ViewVO viewVO = new ViewVO();
			viewVO.setMovie_num(movie_num);
			viewVO.setView_path(view_path);
			
			movieViewList.add(viewVO);
		}
		
		movieVO.setList(movieViewList);
		
		return list;
	}  //movieList


	@Override
	public MovieViewJoinResultVO movieRead(String movie_num) throws Exception{
		
		return sqlSession.selectOne(namespace + ".movieRead", movie_num);
		 
	} //movieRead

}
