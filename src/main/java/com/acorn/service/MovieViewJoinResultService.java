package com.acorn.service;

import java.util.List;

import com.acorn.domain.MemberReplyJoinResultVO;
import com.acorn.domain.MovieViewJoinResultVO;
import com.acorn.model.MovieCommentsDTO;

public interface MovieViewJoinResultService {

	//영화리스트
	public abstract List<MovieViewJoinResultVO> movieList() throws Exception; 
	//movie 목록
	
	public abstract MovieViewJoinResultVO movieRead(String movie_num) throws Exception;
	//movie detail 정보 가져오기
}  //end interface
