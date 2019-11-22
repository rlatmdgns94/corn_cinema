package com.acorn.service;

import java.util.List;

import com.acorn.domain.BoardVO;
import com.acorn.domain.Criteria;

public interface BoardService {
	
	public void regist(BoardVO board) throws Exception;
	
	public BoardVO read(int bno) throws Exception;
	
	public void modify(BoardVO board) throws Exception;
	
	public void remove(int bno) throws Exception;
	
	public List<BoardVO> listAll() throws Exception;
	
	public List<BoardVO> listCriteria(Criteria cri) throws Exception;
	
	public int listCountCriteria(Criteria cri) throws Exception;

}//end interface
