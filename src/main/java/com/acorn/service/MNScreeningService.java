package com.acorn.service;

import java.util.List;

import com.acorn.domain.Criteria;
import com.acorn.domain.MNScreeningDTO;
import com.acorn.domain.MemberBoardVO;
import com.acorn.domain.MovieViewJoinResultVO;
import com.acorn.model.PageDTO;

public interface MNScreeningService {
	
	//검색 리스트 뽑기
	public abstract List<MNScreeningDTO> getTitle() throws Exception;
	public abstract List<MNScreeningDTO> getCinema() throws Exception;
	public abstract List<MNScreeningDTO> getMovieTime() throws Exception;
	public abstract List<MNScreeningDTO> getDist() throws Exception;
	public abstract List<MNScreeningDTO> getScreeningList() throws Exception;

	//페이징 처리
	//상영으로 바꾸기
	public abstract List<MNScreeningDTO>  mnScreeningListCriteria(Criteria cri) throws Exception;
	
	//상영으로 바꾸기
	public abstract int mnScreeninglistCountCriteria(Criteria cri) throws Exception;
	
	//삽입
	public abstract void mnScreeningRegist(MNScreeningDTO dto) throws Exception;

	public void deletea(MNScreeningDTO dto) throws Exception;
	
	//페이징 처리
}
