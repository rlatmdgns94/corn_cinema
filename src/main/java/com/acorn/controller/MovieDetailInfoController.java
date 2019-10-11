
  package com.acorn.controller;
  
  import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import
  org.springframework.ui.Model;
import
  org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import
  org.springframework.web.bind.annotation.RequestParam;

import com.acorn.service.MovieViewJoinResultService;

import lombok.extern.log4j.Log4j;
  
  @Log4j	
  @RequestMapping("/")
  @Controller 
  public class MovieDetailInfoController {
  
  @Inject 
  private MovieViewJoinResultService service;
  
  
  @GetMapping("/movie_detail") 
  public void movieRead( 
    @RequestParam(value="movie_num", required = false) 
  	String movie_num, 
  	Model model) throws Exception{
  
  model.addAttribute("movieRead",service.movieRead(movie_num));
  
  
  }  //movieRead

}
 