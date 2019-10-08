package com.acorn.persistence;

import java.util.Map;

import com.acorn.domain.MemberVo;

public interface MemberDAO {

	
   public abstract void insertMember(MemberVo vo) throws Exception;

   public abstract void updateProfile(MemberVo vo) throws Exception;
   
   public abstract void deleteProfile(MemberVo vo) throws Exception;



	
}
