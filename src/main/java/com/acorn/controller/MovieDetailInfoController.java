
  package com.acorn.controller;
  
  import javax.inject.Inject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import
  org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import
  org.springframework.web.bind.annotation.RequestParam;

import com.acorn.service.MovieViewJoinResultService;
import com.acorn.service.ReplyService;

import lombok.extern.log4j.Log4j;
  
  @Log4j	
  @RequestMapping("/")
  @Controller 
  public class MovieDetailInfoController {
  
	@Inject
	private MovieViewJoinResultService service;
	
	@Autowired
	private ReplyService replyService;
	
	@RequestMapping("/movie_detail")
	public void movieRead(@RequestParam(value = "movie_num", required = false) String movie_num, Model model)
			throws Exception {

		model.addAttribute("movieRead", service.movieRead(movie_num));
		
		  System.out.println("===================================movie_num:" + movie_num);
		model.addAttribute("replyList", replyService.replyList(movie_num));
		} // movieRead
	
	
}