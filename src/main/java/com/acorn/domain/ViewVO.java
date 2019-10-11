package com.acorn.domain;

import java.sql.Date;
import java.util.List;

import org.apache.ibatis.type.Alias;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class ViewVO {

	private String movie_num;   // FK
	private String view_path;
	
}
