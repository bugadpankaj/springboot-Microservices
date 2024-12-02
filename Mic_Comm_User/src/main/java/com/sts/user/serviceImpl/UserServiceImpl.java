package com.sts.user.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.sts.user.entity.User;
import com.sts.user.repository.UserRepository;
import com.sts.user.service.UserService;
import com.sts.user.vo.Department;
import com.sts.user.vo.UserDeptVO;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private RestTemplate restTemplate;

	@Override
	public User addUser(User user) {
		
		return userRepository.save(user);
	}

	@Override
	public UserDeptVO getUserWithDept(long userId) {
			
		UserDeptVO userDeptVO = new UserDeptVO();
		User user = userRepository.findById(userId).get();
		
		Department department = restTemplate.getForObject("http://DEPARTMENT-SERVICE/dept/" + user.getDepartmentId(), Department.class);
		log.info("******************************* inside get User with Dept ******************************* ");
		userDeptVO.setUser(user);
		userDeptVO.setDepartment(department);
		return userDeptVO;
	}

	@Override
	public List<User> getAllUsers() {
		log.info("inside get all users with dept from user service impl");
		return userRepository.findAll();
	}

}
