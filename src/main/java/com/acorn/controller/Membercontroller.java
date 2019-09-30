package com.acorn.controller;

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
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.extern.log4j.Log4j;

@AllArgsConstructor
@NoArgsConstructor
@Controller
@Log4j
@RequestMapping("/member/*")

public class Membercontroller {
	
	@Autowired  
	private MemberService memberservice;
	
	@Autowired
	private LoginService loginservice;
	
	
	
	
	@GetMapping("/login")
	public void login() {
		log.info("Get-Login");	
	} //login()

	
    @PostMapping("login_Post")
    public String login_result(LoginDTO dto , Model model) throws Exception{
  	    log.info("POST-Login");
	    log.info(" dto:" + dto );	
	    log.info(" model:" + model);
        log.info("loginservice:" + loginservice);
    
     MemberVo vo = loginservice.checkLogin(dto);
        
       if(vo==null) {
         log.info("로그인 실패 !");		    
           return "redirect:/member/login";      // return"/member/login"; << 대신 redirect 사용 안그러면 홈페이지 오류! ( F5 눌렀을때오류)
        }   	
        
      	//로그인에 성공했다면 찾아낸 사용자 정보를 view 로 전달
 		 log.info("vo전달 !! : :" + vo);
 		 model.addAttribute("userVO",vo);       //requset 영역 공유 !! ★ ★ ★ 
           return "/index";  
        } //login_POST()
    	
    
 //-----------------------------------------------------------------------------//
	
    
    @GetMapping("/join")
	public void join(){
		log.info("Get-join");
		
	} //join()
     
	@PostMapping("/join")
	public String join_result(MemberDTO dto) throws Exception {
		log.info("POST_result");
		
		MemberVo vo = new MemberVo();
		
          vo.setId(dto.getId());
		  vo.setPassword(dto.getPassword());
		  vo.setName(dto.getName());
		  vo.setPhone(dto.getPhone());
		  vo.setEmail(dto.getEmail());

		  memberservice.regist(vo);
		  
		return "/member/join_result";
	} //join_result()
	
	
	 //-----------------------------------------------------------------------------//

		
	  @GetMapping("/member_modify")
	  public void modify() {
	      log.info("in회원정보수정페이지");
		}
		
	  
	  @PostMapping("/member_modify")
	  public String member_modify(MemberDTO dto) throws Exception{
	    
		  MemberVo vo = new MemberVo();
		  
		  vo.setId(dto.getId());
		  vo.setPassword(dto.getPassword());
		  vo.setPhone(dto.getPhone());
		  vo.setEmail(dto.getEmail());  
		  log.info("member_modify :: vo"+ vo);
		  memberservice.modify(vo);
		  
		  vo.setUpdatedate(dto.getUpdatedate());
		  log.info("member_modify :: vo"+ vo);
		  memberservice.ModificationTime();
		  
		  	  
		  return "redirect:/";
	               
	  }
	 
	  @PostMapping("/withdrawal_result")
	  public void withdrawal_result(MemberDTO dto) throws Exception{
		  
		  MemberVo vo = new MemberVo();
		  
		  vo.setId(dto.getId());  
		  log.info("withdrawal_result vo : " + vo);
		  memberservice.remove(vo);
		  
	  }
	  
	  
	  
	  
	  
	  
	  
	@GetMapping("/mypage")
	public void mypage() {
		log.info("mypage");
	}
	
	
	 //-----------------------------------------------------------------------------//
	
	


	
} //end class