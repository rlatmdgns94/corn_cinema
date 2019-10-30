package com.acorn.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.acorn.domain.MemberBoardVO;
import com.acorn.email.Email;
import com.acorn.email.EmailSender;
import com.acorn.service.LoginService;
import com.acorn.service.MemberBoardService;
import com.acorn.service.MemberService;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.extern.log4j.Log4j;

@AllArgsConstructor
@NoArgsConstructor
@Controller
@Log4j
@RequestMapping("/manager/*")
public class MemberBoardCotroller {
	
	@Autowired
    private MemberBoardService memberboardservice;
	
	public String memberBoardList(Model model) throws Exception {
		List<MemberBoardVO> list = memberboardservice.MemberBoardList();
		model.addAttribute("list", list);
		
		return "/";
	}
}
