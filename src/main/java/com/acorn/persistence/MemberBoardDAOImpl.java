package com.acorn.persistence;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.acorn.domain.MemberBoardVO;

@Repository
public class MemberBoardDAOImpl implements MemberBoardDAO{

	@Inject
	private SqlSession sqlSession;
	
    private static final String namespace="com.acorn.mapper.MemberMapper";
	
	public List<MemberBoardVO> MemberBoardList(){
		return sqlSession.selectList(namespace+".MemberBoardList");			
	}   
}
