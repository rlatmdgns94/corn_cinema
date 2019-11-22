package com.acorn.persistence;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.acorn.domain.Criteria;
import com.acorn.domain.MNScreeningDTO;
import com.acorn.domain.MovieAvgScoreResultVO;
import com.acorn.domain.MovieViewJoinResultVO;

import lombok.extern.log4j.Log4j;
@Log4j
@Repository
public class MNScreeningDAOImpl implements MNScreeningDAO {

	
	@Inject
	private SqlSession sqlSession;
	private static final String namespace="com.acorn.mapper.mnScreeningMapper";
	
	
	@Override
	public List<MNScreeningDTO> selectTitle() throws Exception {
		return sqlSession.selectList(namespace+".mnScreeningTitle");
	}


	@Override
	public List<MNScreeningDTO> selectCinema() throws Exception {
		return sqlSession.selectList(namespace+".mnScreeningCinema");
	}


	@Override
	public List<MNScreeningDTO> selectMovieTime() throws Exception {
		return sqlSession.selectList(namespace+".mnScreeningStartTime");
	}
	
	@Override
	public List<MNScreeningDTO> selectScreeningList() throws Exception {
		
		return sqlSession.selectList(namespace+".showScreeningList");
	}
	
	@Override
	public List<MNScreeningDTO> mnScreeningListPage(int page) throws Exception {
		if(page <= 0 ) {
			page = 1;
		} 
		page = (page -1) * 10;
		return sqlSession.selectList(namespace + ".mnScreeningListPage", page);
	
	}
	@Override
	public List<MNScreeningDTO> mnScreeningListCriteria(Criteria cri) throws Exception {
		//상영으로 바꾸기
		return sqlSession.selectList(namespace + ".mnScreeningListCriteria",  cri);
	}
	@Override
	public int countPaging(Criteria cri) throws Exception {
		//상영으로 바꾸기
		return sqlSession.selectOne(namespace + ".mnScreeningListCountPaging",cri);
	}


	@Override
	public void mnScreeningRegist(MNScreeningDTO dto) throws Exception {
	     sqlSession.insert(namespace + ".InsertmnScreening" , dto); 
	}


	@Override
	public List<MNScreeningDTO> selectDist() throws Exception {
		return sqlSession.selectList(namespace + ".mnScreeningDist");
	}


	@Override
	public void delete(MNScreeningDTO dto) throws Exception {
		sqlSession.delete(namespace+".mnScreeningDelete", dto);
	}



}
