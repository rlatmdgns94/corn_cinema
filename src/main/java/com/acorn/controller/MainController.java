package com.acorn.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.extern.log4j.Log4j;


@Controller
@Log4j

public class MainController {

	  @GetMapping("/")  
	  public String Main() {
		   log.info("Get-Main");	   
		  return "index";	  
	  }
	  
	  @GetMapping("/index.html")
	  public String Main_index() {
		  log.info("Get-Main-Re");
		  return "redirect:/";  	  
	  }
	
	  
	  
}//end class
