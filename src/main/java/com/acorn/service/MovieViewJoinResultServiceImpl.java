package com.acorn.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.acorn.domain.MovieViewJoinResultVO;
import com.acorn.persistence.MovieViewJoinResultDAO;

import lombok.extern.log4j.Log4j;


@Log4j
@Service
public class MovieViewJoinResultServiceImpl 
	implements MovieViewJoinResultService {

	@Autowired
	MovieViewJoinResultDAO dao;
	
	@Override
	public List<MovieViewJoinResultVO> movieList() throws Exception {
		
		return dao.movieList();
		
	}  //movieList()
	
	
	  @Override 
	  public MovieViewJoinResultVO movieRead(String movie_num) throws Exception{
	  
	  return dao.movieRead(movie_num); 
	  
	  }
	 

}  //end class
