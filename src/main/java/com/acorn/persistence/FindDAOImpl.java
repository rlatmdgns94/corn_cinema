package com.acorn.persistence;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.acorn.domain.MemberVo;
import com.acorn.model.FindDTO;

import lombok.extern.log4j.Log4j;

@Log4j
@Repository


public class FindDAOImpl implements FindDAO {

	@Inject
	private SqlSession sqlSession;
	
	private static final String namespace = "com.acorn.mapper.FindMapper";

	@Override
	public String findId(MemberVo vo) throws Exception {
		log.info("idFind");
		log.info( "FindDAOImpl vo : " + vo);
		
		return sqlSession.selectOne(namespace+".findId" , vo);
	}

} //finId


