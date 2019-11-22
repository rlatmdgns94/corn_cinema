package com.acorn.persistence;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import lombok.extern.log4j.Log4j;

@Log4j
@Repository
public class MnMainDAOImpl 
	implements MnMainDAO{
	
	@Inject
	private SqlSession sqlSession;
	private final String namespace = "com.acorn.mapper.mnScreeningMapper";

	@Override
	public int total(int cinema_num) throws Exception {
		log.info("MnMainDAOImpl :: total(int cinema_num) invoked.");
		return sqlSession.selectOne(namespace + ".totalsales", cinema_num);
	}//total

	@Override
	public int today(int cinema_num) throws Exception {
		log.info("MnMainDAOImpl :: today(int cinema_num) invoked.");
		return sqlSession.selectOne(namespace + ".todaysales", cinema_num);
	}//today

	@Override
	public int month(int cinema_num) throws Exception {
		log.info("MnMainDAOImpl :: month(int cinema_num) invoked.");
		return sqlSession.selectOne(namespace+".monthsales", cinema_num);
	}//month

}//MnMainDAOImpl
