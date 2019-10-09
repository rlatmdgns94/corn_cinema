package com.acorn.persistence;

import java.util.Map;

import com.acorn.domain.MemberVo;

public interface MemberDAO {

	
   public abstract void insertMember(MemberVo vo) throws Exception;

   public abstract void updateProfile(MemberVo vo) throws Exception;
   
   public abstract void deleteProfile(MemberVo vo) throws Exception;

   public abstract int idCheck(String user_id) throws Exception ;

   public abstract int phoneCheck(String user_phone) throws Exception;
   
   public abstract int emailCheck(String user_email) throws Exception;
   
	
}
