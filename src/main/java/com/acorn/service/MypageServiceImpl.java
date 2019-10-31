package com.acorn.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.acorn.domain.MypageVO;
import com.acorn.model.LoginDTO;
import com.acorn.persistence.MypageDAO;

import lombok.extern.log4j.Log4j;
@Log4j
@Service
public class MypageServiceImpl implements MypageService {
   
   @Inject
   MypageDAO dao;
   
   @Override
   public List<MypageVO> getReservation(LoginDTO dto) throws Exception {
      log.info("MypageServiceImpl::getReservation invoked.");
      return dao.selectReservation(dto);
   }//getReservation   

}//end class