package com.acorn.persistence;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.acorn.domain.MemberVo;

import lombok.extern.log4j.Log4j;

@Log4j
@Repository

public class MemberDAOImpl implements MemberDAO {

	@Inject
	private SqlSession sqlSession;
	
	private static final String namespace = "com.acorn.mapper.MemberMapper";
		
	
	
	@Override
	public String getTime() {
	   log.info("::MemberDAOImpl getTime() Invoked::");
		return sqlSession.selectOne(namespace+".getTime");
	}

	@Override
	public void insertMember(MemberVo vo) throws Exception {
		log.info("insertMember invoked");
   
		   sqlSession.insert(namespace+".insertMember", vo);
		
	}

	
}
