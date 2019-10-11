package com.acorn.domain;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class ReplyVO {

	private String id;
	private String movie_num;
	private String comment;
	private double score;
	
	private Date regdate;
	private Date updatedate;

}
