package com.acorn.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.acorn.domain.MemberReplyJoinResultVO;
import com.acorn.persistence.ReplyDAO;

import lombok.extern.log4j.Log4j;

@Log4j
@Service
public class ReplyServiceImpl implements ReplyService {

	
	@Inject
	ReplyDAO dao;
	
	//댓글정보 서비스
	
	@Override
	public List<MemberReplyJoinResultVO> replyList(String movie_num) throws Exception {
		return dao.replyList(movie_num);
	}  //replyList

	@Override
	public void replyCreate(MemberReplyJoinResultVO vo) throws Exception {
		 dao.replyCreate(vo);

	}  //replyCreate

	@Override
	public void replyUpdate(MemberReplyJoinResultVO vo) throws Exception {
		dao.replyUpdate(vo);

	}  //replyUpdate

	@Override
	public int replyDelete(String id) throws Exception {
		 return dao.replyDelete(id);
	}  //replyDelete

}
