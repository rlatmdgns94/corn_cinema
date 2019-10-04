package com.acorn.service;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.acorn.domain.MemberVo;
import com.acorn.persistence.FindDAO;

import lombok.extern.log4j.Log4j;

@Log4j
@Service


public class FindServiceImpl implements FindService {

	@Inject
	private FindDAO dao;
	
	@Override
	public String findId(MemberVo vo) throws Exception {

         log.info("findId");
         log.info("FindServiceImpl vo:" + vo );
         
		return dao.findId(vo);
	} //findId

	
	
}
