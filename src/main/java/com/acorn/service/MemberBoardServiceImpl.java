package com.acorn.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.acorn.domain.MemberBoardVO;
import com.acorn.persistence.MemberBoardDAO;

@Service
public class MemberBoardServiceImpl implements MemberBoardService{
	
	@Inject
	private MemberBoardDAO dao;
	
	@Override
	public List<MemberBoardVO> MemberBoardList() throws Exception{
		return dao.MemberBoardList();
	}
	
}
