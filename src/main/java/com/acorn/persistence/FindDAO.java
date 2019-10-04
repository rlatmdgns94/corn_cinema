package com.acorn.persistence;

import com.acorn.domain.MemberVo;
import com.acorn.model.FindDTO;

public interface FindDAO {

	public abstract String findId(MemberVo vo) throws Exception;
	
	
	
}


