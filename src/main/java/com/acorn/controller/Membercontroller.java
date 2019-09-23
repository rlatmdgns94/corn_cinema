package com.acorn.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.acorn.domain.MemberVo;
import com.acorn.model.MemberDTO;
import com.acorn.service.MemberService;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.extern.log4j.Log4j;

@AllArgsConstructor
@NoArgsConstructor
@Controller
@Log4j
@RequestMapping("/member/*")

public class Membercontroller {
	
	@Autowired  // @Inject 같음
	private MemberService memberservice;
	
	
	@GetMapping("/login")
	public void regist() {
		log.info("Get-Login");	
	}

	/*
	  -----------------------------
	             POST  
	  -----------------------------
	*/
	
	
	@GetMapping("/join")
	public void join(){
		log.info("Get-join");
		
	}
     
	@PostMapping("/join")
	public String join_result(MemberDTO dto , Model model)throws Exception {
		log.info("join_result");
		
		MemberVo vo = new MemberVo();
		
          vo.setId(dto.getId());
		  vo.setPassword(dto.getPassword());
		  vo.setName(dto.getName());
		  vo.setPhone(dto.getPhone());
		  vo.setEmail(dto.getEmail());
		
		  memberservice.regist(vo);
		  

	      	 
		return "/member/join_result";
	}
	
	
	
	
	
} //end class