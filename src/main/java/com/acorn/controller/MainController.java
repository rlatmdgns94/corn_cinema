package com.acorn.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

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
	
	  @GetMapping("/logout")
	   public String logout(HttpSession session) {
		   log.info("로그아웃!!");
		   session.removeAttribute("login");	   
		    return "redirect:/";  
	  }

	  
	  
	  
}//end class
