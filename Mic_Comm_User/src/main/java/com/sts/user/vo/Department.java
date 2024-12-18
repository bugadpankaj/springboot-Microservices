package com.sts.user.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Department {
	
	private long departmentID;
	
	private String departmentName;
	
	private String departmentAddress;
	
	private String departmentCode;

}
