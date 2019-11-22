package com.acorn.service;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.acorn.persistence.MnMainDAO;

import lombok.extern.log4j.Log4j;

@Service
@Log4j
public class MnServiceImpl implements MnService {
	
	@Inject
	MnMainDAO dao;

	@Override
	public int total(int cinema_num) throws Exception {
		log.info("MnServiceImpl :: total(int cinema_num) invoked.");
		return dao.total(cinema_num);
	}

	@Override
	public int today(int cinema_num) throws Exception {
		log.info("MnServiceImpl :: today(int cinema_num) invoked.");
		return dao.today(cinema_num);
	}

	@Override
	public int month(int cinema_num) throws Exception {
		log.info("MnServiceImpl :: month(int cinema_num) invoked.");
		return dao.month(cinema_num);
	}
	

}//MnServiceImpl
