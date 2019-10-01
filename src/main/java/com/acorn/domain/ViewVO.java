package com.acorn.domain;

import org.apache.ibatis.type.Alias;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Alias("viewVO")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class ViewVO {

	private String movie_num;
	private String view_path;
	
}
