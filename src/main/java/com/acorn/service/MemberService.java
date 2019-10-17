package com.acorn.service;


import java.util.*;
import com.acorn.domain.MemberVo;

public interface MemberService {

	
   public abstract void regist(MemberVo vo) throws Exception;
   
   public abstract void modify(MemberVo vo) throws Exception;
   
   public abstract void remove(MemberVo vo) throws Exception;
   
   public abstract int DuplicateId(String user_id) throws Exception; 

   public abstract int DuplicatePhone(String user_phone) throws Exception;
   
   public abstract int DuplicateEmail(String user_email) throws Exception;
   
   public abstract int emailModifyCk(String myEmail) throws Exception;
  
}
