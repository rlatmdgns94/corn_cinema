package com.acorn.controller;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.acorn.domain.Criteria;
import com.acorn.domain.MNScreeningDTO;
import com.acorn.domain.PageMaker;
import com.acorn.model.LoginDTO;
import com.acorn.service.MNScreeningService;

import lombok.extern.log4j.Log4j;

@Controller
@RequestMapping("/MN_Screening_Board/*")
@Log4j
public class MnScreeningBoardController {

	@Inject
	private MNScreeningService service;

	@RequestMapping(value = "MN_screening_list", method = RequestMethod.GET)
	public void listPage(@ModelAttribute("cri") Criteria cri, Model model) throws Exception {
		
		log.info(cri.toString());
		model.addAttribute("list", service.mnScreeningListCriteria(cri));
		model.addAttribute("listTitle", service.getTitle());
		model.addAttribute("listCinema", service.getCinema());
		model.addAttribute("listStartTime", service.getMovieTime());
		
		MNScreeningDTO dto = new MNScreeningDTO();
		
		PageMaker pageMaker = new PageMaker();
		pageMaker.setCri(cri);
		pageMaker.setTotalCount(service.mnScreeninglistCountCriteria(cri));

		model.addAttribute("pageMaker", pageMaker);
		
	} // listPage

	/* 상영정보 등록페이지 */
	@RequestMapping(value = "MN_screening_register", method = RequestMethod.GET)
	public void mnScreeningRegisterGET(MNScreeningDTO dto, Model model) throws Exception {
		log.info("mnScreeningRegisterGET");
		model.addAttribute("listTitle", service.getTitle());
		model.addAttribute("listCinema", service.getCinema());
		model.addAttribute("listDist", service.getDist());
		model.addAttribute("listStartTime", service.getMovieTime());
	}

	
	@RequestMapping(value ="MN_screening_register", method = RequestMethod.POST)
	public String mnScreeningRegistPOST(
			MNScreeningDTO dto, Model model) throws Exception {
		
		log.info("mnScreeningRegistPOST");
		
		
		service.mnScreeningRegist(dto);
		return "redirect:/MN_Screening_Board/MN_screening_list";

	}// mnMovieDetailInfo

	
	@GetMapping("MN_screening_list/delete")
    public String delete(@RequestParam("screening_num") int screening_num) throws Exception{
       log.info("++++++++++++++screening_num: " + screening_num);
       MNScreeningDTO dto = new MNScreeningDTO();
       dto.setScreening_num(screening_num);
       
       service.deletea(dto);
       
       return "redirect:/MN_Screening_Board/MN_screening_list/";
 } 
}
