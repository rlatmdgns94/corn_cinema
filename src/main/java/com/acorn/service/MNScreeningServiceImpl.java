package com.acorn.service;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Service;

import com.acorn.domain.Criteria;
import com.acorn.domain.MNScreeningDTO;
import com.acorn.domain.MovieViewJoinResultVO;
import com.acorn.persistence.MNScreeningDAO;
import com.acorn.persistence.MnMovieBoardDAO;

@Service
public class MNScreeningServiceImpl implements MNScreeningService {

	@Inject
	MNScreeningDAO dao;

	@Override
	public List<MNScreeningDTO> getTitle() throws Exception {
		return dao.selectTitle();
	}

	@Override
	public List<MNScreeningDTO> getCinema() throws Exception {
		return dao.selectCinema();
	}

	@Override
	public List<MNScreeningDTO> getMovieTime() throws Exception {
		return dao.selectMovieTime();
	} 
	@Override
	public List<MNScreeningDTO> getScreeningList() throws Exception {
		return dao.selectScreeningList();
	}

	@Override
	public List<MNScreeningDTO> mnScreeningListCriteria(Criteria cri) throws Exception {
		return dao.mnScreeningListCriteria(cri);
	}

	@Override
	public int mnScreeninglistCountCriteria(Criteria cri) throws Exception {
		return dao.countPaging(cri);
	}

	@Override
	public void mnScreeningRegist(MNScreeningDTO dto) throws Exception {
		dao.mnScreeningRegist(dto);
	}

	@Override
	public List<MNScreeningDTO> getDist() throws Exception {
		return dao.selectDist();
	}

	@Override
	public void deletea(MNScreeningDTO dto) throws Exception {
		dao.delete(dto);
		
	}


	
	

}
