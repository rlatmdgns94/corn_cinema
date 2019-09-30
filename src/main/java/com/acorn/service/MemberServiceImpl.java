package com.acorn.service;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.acorn.domain.MemberVo;
import com.acorn.persistence.MemberDAO;

import lombok.extern.log4j.Log4j;

@Log4j
@Service


public class MemberServiceImpl implements MemberService {

@Inject
private MemberDAO dao ;	
	
	@Override
	public void regist(MemberVo vo) throws Exception {
	       log.info("\t dao:" + dao ); 
	       log.info("\t+ vo:" + vo);

	       dao.insertMember(vo);
		
	} //regist

	@Override
	public void modify(MemberVo vo) throws Exception {
        log.info("modify invoked");
        log.info("vo:"+ vo);
		dao.updateProfile(vo);
		
	} //modify

	@Override
	public String ModificationTime() throws Exception {
	      log.info("ModificationTime invoked");
		  return dao.updateTime();
		

	} //ModificationTime

	@Override
	public void remove(MemberVo vo) throws Exception {
         log.info("remove invoked");
         log.info("vo:" + vo);
         dao.deleteProfile(vo);
     
		
	}

}
