package com.acorn.persistence;

import java.util.List;

import com.acorn.domain.MovieViewJoinResultVO;

public interface MovieViewJoinResultDAO {

	public abstract List<MovieViewJoinResultVO> movieList() throws Exception;
	
	public abstract MovieViewJoinResultVO movieRead(String movie_num) throws Exception;

}  //interface