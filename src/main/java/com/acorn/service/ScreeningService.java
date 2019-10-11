package com.acorn.service;

import java.util.List;

import com.acorn.domain.BookingDTO;

public interface ScreeningService {
	
	//tbl_screening에 있는 모든 레코드를 반환한다.
	
	
	//tbl_screening
	public abstract List<String> getCities(BookingDTO dto) throws Exception;
	
	public abstract List<String> getDistricts(BookingDTO dto) throws Exception;
	
	public abstract List<String> getDates(BookingDTO dto) throws Exception;
	
	public abstract List<String> getTimes(BookingDTO dto) throws Exception;
	
	public abstract List<String> getSeats(BookingDTO dto) throws Exception;


}
