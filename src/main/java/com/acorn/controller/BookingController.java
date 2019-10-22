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
import com.acorn.service.MovieViewJoinResultService;
import com.acorn.service.ScreeningService;

import lombok.extern.log4j.Log4j;

@Log4j
@RequestMapping("/movie/screening/*")
@Controller
public class BookingController {

//   public static final String MOVIE_NUM = "_MOVIE_NUM_";
   @Inject
   ScreeningService service;

   @Inject
   private MovieViewJoinResultService s2;

   @GetMapping("/booking")
   public String doBooking(@RequestParam(value = "movie_num", required = false) String movie_num, Model model)
         throws Exception {

      BookingDTO dto = new BookingDTO();
      model.addAttribute("movieRead", s2.movieRead(movie_num));

      // 영화정보 페이지에서 예약버튼을 누르면 해당 영화번호를 받아와서 set으로 설정한다.
      dto.setMovieNum(movie_num);

      List<String> list = service.getCities(dto);
      model.addAttribute("list", list); // 여기까지 했고 jsp에 for-each문 생각해보자

      return "reserve";
   }// doBooking

   @PostMapping("/districts")
   public @ResponseBody List<String> doDistricts(BookingDTO dto,
         @RequestParam(value = "cinema", required = false) String cinema,
         @RequestParam(value = "movie_num", required = false) String movie_num, Model model) throws Exception {

      model.addAttribute("movieRead", s2.movieRead(movie_num));

      dto.setMovieNum(movie_num);
      dto.setInfoCity(cinema);

      List<String> districts = service.getDistricts(dto);

      // 무비넘 가져오고 dto에 담기2
      log.info("cinema: " + cinema);
      return districts;
   }// doDistricts

   @PostMapping("/dates")
   public @ResponseBody List<String> doDates(BookingDTO dto,
         @RequestParam(value = "cinema", required = false) String cinema,
         @RequestParam(value = "movie_num", required = false) String movie_num,
         @RequestParam(value = "dist", required = false) String dist, Model model) throws Exception {

      model.addAttribute("movieRead", s2.movieRead(movie_num));

      dto.setMovieNum(movie_num);
      dto.setInfoCity(cinema);
      dto.setInfoDist(dist);
      /* dto.setInfoDist(dist); ajax로 변수 가져ㅗ기 */

      List<String> dates = service.getDates(dto);

      log.info(dates);

      return dates;
      
   }// doDates

   @PostMapping("/times")
   public @ResponseBody List<String> doTimes(BookingDTO dto,
         @RequestParam(value = "cinema", required = false) String cinema,
         @RequestParam(value = "movie_num", required = false) String movie_num,
         @RequestParam(value = "dist", required = false) String dist,
         @RequestParam(value = "dates", required = false) String dates, Model model) throws Exception {

      model.addAttribute("movieRead", s2.movieRead(movie_num));

      dto.setMovieNum(movie_num);
      dto.setInfoCity(cinema);
      dto.setInfoDist(dist);
      dto.setStartTime("\'"+dates+"\'");
      

      List<String> times = service.getTimes(dto);

      return times;
   }// doTimes

   @PostMapping("/seats")
   public @ResponseBody List<String> doSeats(BookingDTO dto,
         @RequestParam(value = "cinema", required = false) String cinema,
         @RequestParam(value = "movie_num", required = false) String movie_num,
         @RequestParam(value = "dist", required = false) String dist,
         @RequestParam(value = "dates", required = false) String dates,
         @RequestParam(value = "times", required = false) String times,
         Model model) throws Exception {

      model.addAttribute("movieRead", s2.movieRead(movie_num));
      
      dto.setMovieNum(movie_num);
      dto.setInfoCity(cinema);
      dto.setInfoDist(dist);
      
      String startTime = "\'"+ dates+" "+times+"\'";
      log.info("\t\tstartTime: "+startTime);
      
      dto.setStartTime(startTime);
      //남아있는 좌석 show
      List<String> seats = service.getSeats(dto);
      //남아있는 좌석의 수 show
      List<String> remainigseats = service.getTotalSeats(dto);
      log.info(remainigseats);
      //하........남은 좌석,,,,, 배열 길이로 보여주면 ㄷ됨 ㅜ 뻘짓해따라라라이이이
      return seats;
   }// doSeats

}// end controller