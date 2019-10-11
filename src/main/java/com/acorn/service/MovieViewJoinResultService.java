package com.acorn.service;

import java.util.List;

import com.acorn.domain.MovieViewJoinResultVO;

public interface MovieViewJoinResultService {

	public abstract List<MovieViewJoinResultVO> movieList() throws Exception;
	
	public abstract MovieViewJoinResultVO movieRead(String movie_num) throws Exception;
}  //end interface
