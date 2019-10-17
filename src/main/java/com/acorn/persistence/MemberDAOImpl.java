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
	public void insertMember(MemberVo vo) throws Exception {
		
		log.info("sqlSession : " + sqlSession);
		log.info("insertMember invoked");
        sqlSession.insert(namespace+".insertMember", vo);
		
	} //insertMember
	
	@Override
	public void updateProfile(MemberVo vo) throws Exception {
		
        log.info("updateProfile invoked");
        sqlSession.update(namespace+".updateProfile", vo);
		
	} //updateProfile

	@Override
	public void deleteProfile(MemberVo vo) throws Exception {
		
	    log.info("deleteProfile invoked");
	    sqlSession.delete(namespace+".deleteProfile", vo);
		      
	} //deleteProfile

	@Override
	public int idCheck(String user_id) throws Exception {
	    
	
		return sqlSession.selectOne(namespace+".idCheck", user_id);
		
	} //idCheck

	@Override
	public int phoneCheck(String user_phone) throws Exception {
	
		return sqlSession.selectOne(namespace+".phoneCheck", user_phone);
		
	} //phoneCheck
 
	@Override                                 //회원가입  email
	public int emailCheck(String user_email) throws Exception {
		
		 return sqlSession.selectOne(namespace+".emailCheck", user_email);

	} //emailCheck

	@Override                                //회원수정 email 변경시
	public int emailUpdate(String myEmail) throws Exception {           

		return sqlSession.selectOne(namespace+".updateEmailCk", myEmail);
	
	} //emailUpdate


}
