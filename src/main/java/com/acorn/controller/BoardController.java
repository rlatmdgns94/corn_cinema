package com.acorn.controller;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.acorn.domain.BoardVO;
import com.acorn.domain.Criteria;
import com.acorn.domain.PageMaker;
import com.acorn.service.BoardService;

import lombok.extern.log4j.Log4j;

@Log4j
@Controller
@RequestMapping("/board/*")
public class BoardController {
	
	@Inject
	private BoardService service;
	
	@GetMapping("/register")
	public void registerGET(BoardVO board, Model model) throws Exception{
		log.info("BoardController :: registerGET invoked.");		
	}//registerGET
	
	
	@PostMapping("/register")
	public String registPost(BoardVO board, RedirectAttributes rttr) throws Exception{
		log.info("BoardController :: registPost invoked.");
		
		service.regist(board);
		rttr.addAttribute("result", "success");

		return "redirect:/board/listAll";
	}//registPost
		
	@GetMapping("/read")
	public void read(@RequestParam("bno") int bno, Model model) throws Exception {
		log.info("BoardController :: listAll read.");
		model.addAttribute(service.read(bno));		
	}//read
	
	@GetMapping("/mainread")
	public void mainread(@RequestParam("bno") int bno, Model model) throws Exception {
		log.info("BoardController :: listAll read.");
		model.addAttribute(service.read(bno));		
	}//mainread

	@PostMapping("/remove")
	public String remove(@RequestParam("bno") int bno, 
		RedirectAttributes rttr) throws Exception {
		log.info("BoardController :: remove invoked.");
		service.remove(bno);
		rttr.addFlashAttribute("msg", "SUCCESS");
		return "redirect:/board/listAll";		
	}//remove
	
	@GetMapping("/modify")
	public void modifyGET(int bno, Model model) throws Exception {
		log.info("BoardController :: modifyGET invoked.");
	    model.addAttribute(service.read(bno));
	}//modifyGET
	
	@PostMapping("/modify")
	public String modifyPOST(BoardVO board,
			RedirectAttributes rttr) throws Exception {
		log.info("BoardController :: modifyPOST invoked.");
		service.modify(board);
		rttr.addFlashAttribute("msg", "SUCCESS");
		return "redirect:/board/listAll";
	}//modifyPOST	

	@GetMapping("/listAll")
	public void listAll(@ModelAttribute("cri") Criteria cri, Model model) throws Exception{
		log.info("BoardController :: listAll invoked.");		
//		model.addAttribute("list", service.listAll());	
		log.info(cri.toString());
		
		model.addAttribute("list", service.listCriteria(cri));
		PageMaker pageMaker = new PageMaker();
		pageMaker.setCri(cri);
		pageMaker.setTotalCount(service.listCountCriteria(cri));		
		
		model.addAttribute("pageMaker", pageMaker);
	}//listAll
	
	@GetMapping("/mainlistAll")
	public void mainlistAll(@ModelAttribute("cri") Criteria cri, Model model) throws Exception{
		log.info("BoardController :: listAll invoked.");		
//		model.addAttribute("list", service.listAll());	
		log.info(cri.toString());
		
		model.addAttribute("list", service.listCriteria(cri));
		PageMaker pageMaker = new PageMaker();
		pageMaker.setCri(cri);
		pageMaker.setTotalCount(service.listCountCriteria(cri));		
		
		model.addAttribute("pageMaker", pageMaker);
	}//listAll
	
//	@GetMapping("/listCri")
//	public void listAll(Criteria cri, Model model) throws Exception{
//		log.info("BoardController :: listAll(Criteria cri, Model model) invoked.");
//		model.addAttribute("list", service.listCriteria(cri));
//	}//listAll
	
//	@GetMapping("/listPage")
//	public void listPage(@ModelAttribute("cri") Criteria cri, Model model) throws Exception{
//		log.info(cri.toString());
//		
//		model.addAttribute("list", service.listCriteria(cri));
//		PageMaker pageMaker = new PageMaker();
//		pageMaker.setCri(cri);
////		pageMaker.setTotal(131);
//		pageMaker.setTotalCount(service.listCountCriteria(cri));		
//		
//		model.addAttribute("pageMaker", pageMaker);
//	}//listPage
	
}//end class
















