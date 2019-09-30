package com.acorn.service;

import com.acorn.domain.MemberVo;

public interface MemberService {

	
   public abstract void regist(MemberVo vo) throws Exception;

   public abstract void modify(MemberVo vo) throws Exception;
   
   public abstract String ModificationTime() throws Exception;
   
   public abstract void remove(MemberVo vo) throws Exception;

	

	
	
}
