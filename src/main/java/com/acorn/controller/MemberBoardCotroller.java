package com.acorn.controller;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.acorn.domain.MemberBoardVO;
import com.acorn.service.MemberBoardService;

@Controller
@RequestMapping("/admin/*")
public class MemberBoardCotroller {
	
	@Inject
    private MemberBoardService memberboardservice;
	
	@GetMapping("/memberBoardList")
	public void memberBoardList(Model model) throws Exception {
		List<MemberBoardVO> list = memberboardservice.MemberBoardList();
		model.addAttribute("list", list);
		
		
	}
}
