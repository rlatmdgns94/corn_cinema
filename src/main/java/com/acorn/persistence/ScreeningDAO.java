package com.acorn.persistence;

import java.util.List;

import com.acorn.domain.BookingDTO;

public interface ScreeningDAO {
   
   
   //tbl_screening
   public abstract List<String> selectCities(BookingDTO dto) throws Exception;
   
   public abstract List<String> selectDistricts(BookingDTO dto) throws Exception;//복수형으로
   
   public abstract List<String> selectDates(BookingDTO dto) throws Exception;
   
   public abstract List<String> selectTimes(BookingDTO dto) throws Exception;
   
   public abstract List<String> selectSeats(BookingDTO dto) throws Exception;
   
   public abstract List<String> selectTotalSeats(BookingDTO dto) throws Exception;
   
}