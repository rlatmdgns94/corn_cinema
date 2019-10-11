package com.acorn.persistence;

import com.acorn.domain.ReplyVO;
import com.acorn.model.ReplyDTO;

public interface ReplyDAO {

	public abstract ReplyVO create(ReplyDTO dto) throws Exception;
	
	
}
