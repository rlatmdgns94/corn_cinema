package com.acorn.domain;

import java.sql.Date;

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
	private String phone;
	private String email;
	private Date regdate;
	private Date updatedate;

	// private List<TicketVO> ticket;
	
	
}
