package com.sts.user.controlller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sts.user.entity.User;
import com.sts.user.service.UserService;
import com.sts.user.vo.UserDeptVO;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/user")
@Slf4j
public class UserController {
	
	@Autowired
	private UserService userService;
	
	
	@PostMapping("/")
	public User addUser(@RequestBody User user) {	
		log.info("Inside User Controller Post Method");
		return userService.addUser(user); 
	}
	
	
	@GetMapping("/{id}")
	public UserDeptVO getUserWithDept(@PathVariable("id") long userId) {
		log.info("Inside User Controller Get All Method");
		System.out.println("***************************");
		return userService.getUserWithDept(userId);
	}
	
	@GetMapping ("/")
	public List<User> getAllUser(){
		log.info("inside get all users with dept from user controller");
		return userService.getAllUsers();
	}

}
