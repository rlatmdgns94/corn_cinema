package com.acorn.controller;

import javax.inject.Inject;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.acorn.domain.MemberVo;
import com.acorn.email.Email;
import com.acorn.email.EmailSender;
import com.acorn.getPw.getPassword;
import com.acorn.model.FindDTO;
import com.acorn.security.Sha256;
import com.acorn.service.FindService;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.extern.log4j.Log4j;

@AllArgsConstructor
@NoArgsConstructor
@Log4j
@Controller
@RequestMapping("/find/*")

public class findController {
	
	
	@Inject
	private FindService findservice;
	
	@Autowired
	private Email email;
	
	@Autowired
	private EmailSender emailSender;

	
    @GetMapping("/find_id")
    public void idfind() {
    	
    log.info("idfind!!!");
    	
    }
   
    @PostMapping("/find_resultid")          //모델 없어도댐 그냥 출력용
    public void idfind_POST(FindDTO dto , Model model) throws Exception {
	log.info("::: idfind_POST :::");
	
	MemberVo vo = new MemberVo();
	
	String name = dto.getName();
	String mail = dto.getEmail();

	vo.setName(name);
	vo.setEmail(mail);
	
	String id = findservice.findId(vo);
	vo.setId(id);     
	
	log.info("vo----------------------:"+ vo);
	
	model.addAttribute("userid" , vo);
	

	
	if(id!=null) {
		
		email.setContent("아이디는 "+id+" 입니다");
		email.setReceiver(mail);
		email.setSubject(name+"님 corn_movie 'ID' 찾기 메일입니다");
		emailSender.SendEmail(email);
		log.info(mail +"로아이디값 전송 !");
	}else {
		;;
	}//if-else
	
  } //find_id
    
    //-------------------------------------------------------------------------------------//
    
    
    @GetMapping("/find_pw")
    public void findpwd_GET() {
    	
    log.info("find_password() invoked");
   
    }
    
    
    @PostMapping("find_resultpw")
    public void findpwd_POST(FindDTO dto , Model model) throws Exception {
    	log.info("::: findpwd_POST :::");
    	
    	MemberVo vo = new MemberVo();
    	
    	String id = dto.getId();
    	String mail = dto.getEmail();
    	String newPassword = getPassword.newPw();
    
    	log.info("newPassword:" + newPassword);
    	
    	String encryPassword = Sha256.encrypt(newPassword);  //newPassword 암호화

    	vo.setId(id);
    	vo.setEmail(mail);
    	vo.setPassword(encryPassword);                    
    	
    	String password = findservice.findPw(vo);
    	log.info(": : password ::" + password);
    	
    	   //새로운 비밀번호 세팅
    	
    	model.addAttribute("userpw" , vo);
    	
    	if(password!=null) {
    		
    		email.setContent("비밀번호는 "+newPassword+" 입니다");
    		email.setReceiver(mail);
    		email.setSubject(id+"님 corn_movie 'password' 찾기 메일입니다");
    		emailSender.SendEmail(email);
    		log.info(mail +"로아이디값 전송 !");
    		findservice.updatePw(vo);
    		
    	}else {
    		;;
    	}//if-else
    	
      } //findpwd_POST
    		
    	
}
