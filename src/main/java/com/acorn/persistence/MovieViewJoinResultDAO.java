package com.acorn.persistence;

import java.util.List;

import com.acorn.domain.MemberReplyJoinResultVO;
import com.acorn.domain.MovieViewJoinResultVO;
import com.acorn.model.MovieCommentsDTO;

public interface MovieViewJoinResultDAO {

	//영화리스트
	//최신 개봉작 영화 목록
	public abstract List<MovieViewJoinResultVO> newMovieList() throws Exception;
	
	//박스 오피스 영화 목록
	public abstract List<MovieViewJoinResultVO> boxMovieList() throws Exception;
	
	//영화별 정보
	public abstract MovieViewJoinResultVO movieRead(String movie_num) throws Exception;

	


}  //interface