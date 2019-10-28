package com.acorn.domain;

import java.sql.Date;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MemberVo {

	private String id;
	private String password;
	private String name;
	private String email;
	private Date regdate;
	private Date updatedate;

	private List<ReplyVO> replyvo;
	
	public List<ReplyVO> setReplyList(List<ReplyVO> replyvo){
		return this.replyvo = replyvo;
	}
	
	public void addReplyvo(ReplyVO vo) {
		replyvo.add(vo);
	}
	
	
}


