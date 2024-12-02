package com.sts.user.service;

import java.util.List;

import com.sts.user.entity.User;
import com.sts.user.vo.UserDeptVO;

public interface UserService {
	
	public User addUser(User user);

	public UserDeptVO getUserWithDept(long userId);

	public List<User> getAllUsers();

}
