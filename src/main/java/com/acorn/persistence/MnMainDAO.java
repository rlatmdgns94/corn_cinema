package com.acorn.persistence;

public interface MnMainDAO {
	
	public abstract int total(int cinema_num) throws Exception;
	
	public abstract int today(int cinema_num) throws Exception;
	
	public abstract int month(int cinema_num) throws Exception;

}//MnMainDAO
