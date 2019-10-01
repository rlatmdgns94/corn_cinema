package com.acorn.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.acorn.domain.MovieScreeningVO;
import com.acorn.persistence.MovieScreeningDAO;

@Service
public class MovieScreeningServiceImpl implements MovieScreeningService {

	@Inject
	MovieScreeningDAO dao;

	@Override
	public List<MovieScreeningVO> movieList() throws Exception{
		return dao.movieList();
	}

}
