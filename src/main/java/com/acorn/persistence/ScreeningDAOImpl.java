package com.acorn.persistence;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.acorn.domain.BookingDTO;

import lombok.extern.log4j.Log4j;

@Log4j
@Repository
public class ScreeningDAOImpl 
   implements ScreeningDAO{
   
   @Inject
   private SqlSession sqlSession;
   private final String namespace = "com.acorn.mapper.Screening";
   
   
   @Override
   public List<String> selectCities(BookingDTO dto) {
      log.info("ScreeningDAOImpl :: selectCities(BookingDTO dto) invoked.");      
      return sqlSession.selectList(namespace + ".showcity", dto);   
   }//selectCities

   
   @Override
   public List<String> selectDistricts(BookingDTO dto) {
      log.info("ScreeningDAOImpl :: selectDistricts(BookingDTO dto) invoked.");      
      return sqlSession.selectList(namespace + ".showdist", dto);
   }//selectDistricts

   @Override
   public List<String> selectDates(BookingDTO dto) {
      log.info("ScreeningDAOImpl :: selectDates(BookingDTO dto) invoked.");      
      return sqlSession.selectList(namespace + ".showdate", dto);   
   }//selectDates

   @Override
   public List<String> selectTimes(BookingDTO dto) {
      log.info("ScreeningDAOImpl :: selectTimes(BookingDTO dto) invoked.");      
      return sqlSession.selectList(namespace + ".showtime", dto);      
   }//selectTimes

   @Override
   public List<String> selectSeats(BookingDTO dto) {
      log.info("ScreeningDAOImpl :: selectSeats(BookingDTO dto) invoked.");      
      return sqlSession.selectList(namespace + ".showseat", dto);      
   }//selectSeats


   @Override
   public List<String> selectTotalSeats(BookingDTO dto) throws Exception {
      log.info("ScreeningDAOImpl :: selectTotalSeats(BookingDTO dto) invoked.");      
      return sqlSession.selectList(namespace + ".showtotalseat", dto);   
   }

      
}//endclass