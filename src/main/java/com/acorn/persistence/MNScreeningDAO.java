package com.acorn.persistence;

import java.util.List;

import com.acorn.domain.Criteria;
import com.acorn.domain.MNScreeningDTO;
import com.acorn.domain.MovieViewJoinResultVO;
import com.acorn.model.LoginDTO;

public interface MNScreeningDAO {
	
	//검색 리스트 뽑기
	public abstract List<MNScreeningDTO> selectTitle() throws Exception;
	public abstract List<MNScreeningDTO> selectCinema() throws Exception;
	public abstract List<MNScreeningDTO> selectMovieTime() throws Exception;
	public abstract List<MNScreeningDTO> selectDist() throws Exception;
	// 전체 리스트
	public abstract List<MNScreeningDTO> selectScreeningList() throws Exception;

	// 페이징 처리
	public abstract List<MNScreeningDTO> mnScreeningListPage(int page) throws Exception;

	public abstract List<MNScreeningDTO> mnScreeningListCriteria(Criteria cri) throws Exception;

	//삽입
	public abstract void mnScreeningRegist(MNScreeningDTO dto) throws Exception;
	
	public void delete(MNScreeningDTO dto) throws Exception;
	
	public abstract int countPaging(Criteria cri) throws Exception;
	
	
	

}
