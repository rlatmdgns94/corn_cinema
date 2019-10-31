package com.acorn.persistence;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.acorn.domain.MypageVO;
import com.acorn.model.LoginDTO;

import lombok.extern.log4j.Log4j;
@Log4j
@Repository
public class MypageDAOImpl implements MypageDAO {
   @Inject
   private SqlSession sqlSession;
   private final String namespace = "com.acorn.mapper.MemberMapper";   
   
   @Override
   public List<MypageVO> selectReservation(LoginDTO dto) throws Exception {
      log.info("MypageDAOImpl::selectReservation invoked.");
      return sqlSession.selectList(namespace + ".selectReservation", dto);
   }//selectReservation
   
}//MypageDAOImpl