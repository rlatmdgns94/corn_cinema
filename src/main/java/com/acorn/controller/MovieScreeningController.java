package com.acorn.controller;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.acorn.domain.MovieScreeningVO;
import com.acorn.service.MovieScreeningService;

import lombok.extern.log4j.Log4j;

@Log4j
@RequestMapping("contents/*")
@Controller
public class MovieScreeningController {
	
	@Inject
	private MovieScreeningService service;
	
	@RequestMapping("/movie")
	public void MoiveScreeningGetMovie( Model model ) throws Exception {
		log.info("MovieScreeningController::MoiveScreeningGetMovie invoked");
		
		List<MovieScreeningVO> list = service.movieList();
		model.addAttribute("list", list);
	
		
		
	}
	
	

}
