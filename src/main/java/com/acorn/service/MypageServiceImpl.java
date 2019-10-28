//package com.acorn.service;
//
//import java.util.List;
//
//import javax.inject.Inject;
//
//import org.springframework.stereotype.Service;
//
//import com.acorn.domain.MypageVO;
//import com.acorn.persistence.MypageDAO;
//
//import lombok.extern.log4j.Log4j;
//@Log4j
//@Service
//public class MypageServiceImpl implements MypageService {
//
//	@Inject
//	MypageDAO dao;
//	
//	@Override
//	public List<String> getReservationNum(MypageVO vo) throws Exception {
//		return dao.selectReservationNum(vo);
//	}
//
//	@Override
//	public List<String> getTitle(MypageVO vo) throws Exception {
//		return dao.selectTitle(vo);
//	}
//
//	@Override
//	public List<String> getDistricts(MypageVO vo) throws Exception {
//		return dao.selectDistricts(vo);
//	}
//
//	@Override
//	public List<String> getTimes(MypageVO vo) throws Exception {
//		return dao.selectTimes(vo);
//	}
//
//	@Override
//	public List<String> getReservationDate(MypageVO vo) throws Exception {
//		return dao.selectReservationDate(vo);
//	}
//
//}
