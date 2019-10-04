package com.acorn.persistence;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.acorn.domain.MovieScreeningVO;

import lombok.extern.log4j.Log4j;

@Log4j
@Repository  //DAO 스프링에 인식
public class MovieScreeningDAOImpl implements MovieScreeningDAO {

	@Inject  //DB 커넥션과 클로즈를 자동으로 해주는 SqlSession
	private SqlSession sqlSession;    //Mapper.xml namespace명
	private final String namespace = "com.acorn.mapper.MovieScreeningMapper";
	
	
	@Override  
	public List<MovieScreeningVO> movieList() throws Exception {
										//xmapper.xml 쿼리문의 id
		
		log.info("MovieScreeningDAOImp sqlSession:" + sqlSession);
		return sqlSession.selectList(namespace + ".movieList");
	}	


}
