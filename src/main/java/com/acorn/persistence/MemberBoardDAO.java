package com.acorn.persistence;

import java.util.List;

import com.acorn.domain.MemberBoardVO;

public interface MemberBoardDAO {

	public List<MemberBoardVO> MemberBoardList() throws Exception;
	//회원목록 
	
}
