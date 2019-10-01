package com.acorn.persistence;

import java.util.List;

import com.acorn.domain.MovieScreeningVO;

public interface MovieScreeningDAO {


	public abstract List<MovieScreeningVO> movieList() throws Exception;

}
