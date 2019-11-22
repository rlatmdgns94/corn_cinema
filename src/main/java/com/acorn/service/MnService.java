package com.acorn.service;

public interface MnService {
	
	public abstract int total(int cinema_num) throws Exception;
	
	public abstract int today(int cinema_num) throws Exception;
	
	public abstract int month(int cinema_num) throws Exception;

}//MnMainDAO
