package com.acorn.controller;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.acorn.domain.BookingDTO;
import com.acorn.service.ScreeningService;

import lombok.extern.log4j.Log4j;

@Log4j
@RequestMapping("/movie/screening/*")
@Controller
public class BookingController {
	
	public static final String MOVIE_NUM = "_MOVIE_NUM_";
			
	@Inject
	ScreeningService service;
	
	@GetMapping("/booking")
	public String doBooking(
//			BookingDTO dto,
			@RequestParam("movieNum")
			String movieNum,
			Model model) {
//		model.addAttribute(MOVIE_NUM, dto.getMovieNum());
		
		BookingDTO dto = new BookingDTO();
		//영화정보 페이지에서 예약버튼을 누르면 해당 영화번호를 받아와서 set으로 설정한다.
		dto.setMovieNum("001");
		model.addAttribute(dto);
		
		return "reserve";
	}//doBooking
	
	
	@PostMapping("/cities")	
	public @ResponseBody List<String> doCities(BookingDTO dto) throws Exception {		
		List<String> cities = service.getCities(dto);		
		return cities;			
	}//doCities
	
	
	@PostMapping("/districts")	
	public @ResponseBody List<String> doDistricts(BookingDTO dto) throws Exception {		
		List<String> districts = service.getDistricts(dto);		
		return districts;			
	}//doDistricts
	
	
	@PostMapping("/dates")	
	public @ResponseBody List<String> doDates(BookingDTO dto) throws Exception {		
		List<String> dates = service.getDates(dto);		
		return dates;			
	}//doDates
	
	@PostMapping("/times")	
	public @ResponseBody List<String> doTimes(BookingDTO dto) throws Exception {		
		List<String> times = service.getTimes(dto);		
		return times;			
	}//doTimes
	
	
	@PostMapping("/seats")	
	public @ResponseBody List<String> doSeats(BookingDTO dto) throws Exception {		
		List<String> seats = service.getSeats(dto);		
		return seats;			
	}//doSeats
	
		
}//end controller



















