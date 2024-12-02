package com.sts.user.vo;

import com.sts.user.entity.User;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserDeptVO {

	private User user;
	private Department department;
	
}
