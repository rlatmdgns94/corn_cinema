package com.acorn.persistence;

import java.util.List;

import com.acorn.domain.MypageDTO;
import com.acorn.domain.MypageVO;


public interface MypageDAO {
	
	public abstract List<MypageVO> selectReservation(MypageDTO dto) throws Exception;
	
	
}
