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
		

	@Override                                 //회원가입
	public void insertMember(MemberVo vo) throws Exception {
		
		log.info("sqlSession : " + sqlSession);
		log.info("insertMember invoked");
        sqlSession.insert(namespace+".insertMember", vo);
		
	} //insertMember
	
	@Override                                 //회원정보수정
	public void updateProfile(MemberVo vo) throws Exception {
		
        log.info("updateProfile invoked");
        sqlSession.update(namespace+".updateProfile", vo);
		
	} //updateProfile

	@Override                                 //회원탈퇴
	public int deleteProfile(MemberVo vo) throws Exception {
		
	    int userRemoveCount = sqlSession.delete(namespace+".deleteProfile", vo);
	    return userRemoveCount;
		      
	} //deleteProfile

	@Override                                //회원가입 id 중복체크
	public int idCheck(String user_id) throws Exception {
	    
	   return sqlSession.selectOne(namespace+".idCheck", user_id);
		
	} //idCheck


	@Override                                 //회원가입  email 중복체크
	public int emailCheck(String user_email) throws Exception {
		
	   return sqlSession.selectOne(namespace+".emailCheck", user_email);

	} //emailCheck


}
