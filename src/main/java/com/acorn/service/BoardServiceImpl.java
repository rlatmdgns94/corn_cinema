package com.acorn.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.acorn.domain.BoardVO;
import com.acorn.domain.Criteria;
import com.acorn.persistence.BoardDAO;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class BoardServiceImpl 
	implements BoardService{
	
	@Inject
	private BoardDAO dao;

	@Override
	public void regist(BoardVO board) throws Exception {
		log.info("BoardServiceImpl::regist invoked.");
		dao.create(board);		
	}

	@Override
	public BoardVO read(int bno) throws Exception {
		log.info("BoardServiceImpl::read invoked.");
		return dao.read(bno);
	}

	@Override
	public void modify(BoardVO board) throws Exception {
		log.info("BoardServiceImpl::modify invoked.");
		dao.update(board);		
	}

	@Override
	public void remove(int bno) throws Exception {
		log.info("BoardServiceImpl::remove invoked.");
		dao.delete(bno);		
	}

	@Override
	public List<BoardVO> listAll() throws Exception {
		log.info("BoardServiceImpl::listAll invoked.");
		return dao.listAll();
	}

	@Override
	public List<BoardVO> listCriteria(Criteria cri) throws Exception {
		log.info("BoardServiceImpl::listAll invoked.");
		return dao.listCriteria(cri);
	}

	@Override
	public int listCountCriteria(Criteria cri) throws Exception {
		log.info("BoardServiceImpl::listCountCriteria invoked.");
		return dao.countPaging(cri);
	}

}//endclass
