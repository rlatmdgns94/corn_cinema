package com.acorn.persistence;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Controller;

import com.acorn.domain.BoardVO;
import com.acorn.domain.Criteria;

import lombok.extern.log4j.Log4j;

@Log4j
@Controller
public class BoardDAOImpl 
	implements BoardDAO {
	
	@Inject
	private SqlSession sqlSession;
	private final String namespace = "com.acorn.mapper.BoardMapper";
	
	
	@Override
	public void create(BoardVO vo) throws Exception {
		log.info("BoardDAOImpl :: create(BoardVO vo) invoked.");
		sqlSession.insert(namespace + ".create", vo);
	}//create
	

	@Override
	public BoardVO read(int bno) throws Exception {
		log.info("BoardDAOImpl :: read(BoardVO vo) invoked.");		
		return sqlSession.selectOne(namespace + ".read", bno);
	}//read

	@Override
	public void update(BoardVO vo) throws Exception {
		log.info("BoardDAOImpl :: update(BoardVO vo) invoked.");
		sqlSession.update(namespace + ".update", vo);		
	}//update

	@Override
	public void delete(Integer bno) throws Exception {
		log.info("BoardDAOImpl :: delete(BoardVO vo) invoked.");
		sqlSession.delete(namespace+".delete", bno);		
	}//delete

	@Override
	public List<BoardVO> listAll() throws Exception {
		log.info("BoardDAOImpl :: listAll(BoardVO vo) invoked.");		
		return sqlSession.selectList(namespace+".listAll");
	}//listAll

	@Override
	public List<BoardVO> listPage(int page) throws Exception {
		log.info("BoardDAOImpl :: listPage(int page) invoked.");
		if(page <= 0) {
			page = 1;
		}
		page = (page-1)*10;
		
		return sqlSession.selectList(namespace + "listPage", page);
	}//listPage


	@Override
	public List<BoardVO> listCriteria(Criteria cri) throws Exception {		
		log.info("BoardDAOImpl :: listCriteria(Criteria cri) invoked.");
		return sqlSession.selectList(namespace + ".listCriteria", cri);
	}//listCriteria


	@Override
	public int countPaging(Criteria cri) throws Exception {		
		log.info("BoardDAOImpl :: countPaging(Criteria cri) invoked.");
		return sqlSession.selectOne(namespace + ".countPaging", cri);
	}//countPaging

}//endclass
