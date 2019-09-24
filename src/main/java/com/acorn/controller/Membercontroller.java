package com.acorn.controller;

import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.acorn.domain.MemberVo;
import com.acorn.model.LoginDTO;
import com.acorn.model.MemberDTO;
import com.acorn.service.LoginService;
import com.acorn.service.MemberService;
import com.mysql.fabric.Response;

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
	
	@Autowired
	private LoginService loginservice;
	
	
	
	@GetMapping("/login")
	public void login() {
		log.info("Get-Login");	
	}

    @PostMapping("/login")
    public String login_result (LoginDTO dto , Model model) throws Exception {
		log.info("POST-Login");
		log.info(" dto:" + dto );	
        log.info("loginservice:" + loginservice);
    
        MemberVo vo = loginservice.checkLogin(dto);
        
        if(vo==null) {
        	log.info("로그인 실패 !");
			 
//          return"/member/login"; << 대신 redirect 사용
            return "redirect:/member/login";
           
        }else {
        	return "/index";
        }
    

    }
    	
	@GetMapping("/join")
	public void join(){
		log.info("Get-join");
		
	}
     
	@PostMapping("/join")
	public String join_result(MemberDTO dto , Model model)throws Exception {
		log.info("POST_result");
		
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