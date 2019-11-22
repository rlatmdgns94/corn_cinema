package com.acorn.domain;

import com.acorn.model.LoginDTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Value;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class MNScreeningDTO {
   
   private String title;
   private String local_info_city;
   private String local_info_dist;
   private String movie_start_time;
   
   private int screening_num;
}
