package com.acorn.controller;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.acorn.domain.MovieViewJoinResultVO;
import com.acorn.service.MNScreeningService;
import com.acorn.service.MnService;
import com.acorn.service.MovieViewJoinResultService;

import lombok.extern.log4j.Log4j;

@Log4j
@Controller
public class MnMainController {
	
	@Inject
	private MnService service;
	
	@GetMapping("/mn_main")
	public String Mnmain( Model model) throws Exception {
		for(int i=1;i<=4;i++) {
			model.addAttribute("today"+i, service.today(i));
		}//매장별 당일 매출현황
		
		for(int i=1;i<=4;i++) {
			model.addAttribute("month"+i, service.month(i));
		}//매장별 이번달 매출현황
		
		List<String> arr = new ArrayList<>();
		for(int i=1;i<=4;i++) {
			arr.add(service.total(i)+" ");
		}
		log.info(arr);
		
		model.addAttribute("arr",arr);
		
		return "mn_main";
		
	}
}
