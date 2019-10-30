package com.acorn.service;

import java.util.List;

import com.acorn.domain.MemberBoardVO;

public interface MemberBoardService {
	//회원리스트
	public List<MemberBoardVO> MemberBoardList() throws Exception;
}
