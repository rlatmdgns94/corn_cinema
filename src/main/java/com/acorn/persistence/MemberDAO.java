package com.acorn.persistence;

import com.acorn.domain.MemberVo;

public interface MemberDAO {

	
	public abstract String getTime () throws Exception;

	public abstract void insertMember(MemberVo vo) throws Exception;
	
}
