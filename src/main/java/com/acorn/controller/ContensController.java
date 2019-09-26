package com.acorn.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.extern.log4j.Log4j;



@Controller
@RequestMapping("/contents/*")
@Log4j

public class ContensController {

	@GetMapping("/movie")
	public void login() {
		log.info("contens/movie");	
	} //login
	
	
	
}
