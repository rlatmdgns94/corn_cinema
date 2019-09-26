package com.acorn.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.extern.log4j.Log4j;

@Log4j
@Controller
@RequestMapping("/find/*")

public class findController {

	    @GetMapping("/find_id")
	    public void idfind() {
	    	
	    log.info("idfind!!!");
	    	
	    	
	    }
	
	
	
}
