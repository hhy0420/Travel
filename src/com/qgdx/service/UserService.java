package com.qgdx.service;


import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.qgdx.dao.UserDao;
import com.qgdx.entity.User;


@Service("userService")
public class UserService {

	@Resource(name="userDao")
	UserDao userDao;
	public User dologin(String username) {
		User user=userDao.dologin(username);
		return user;
		
	}

	public List<User> findAllUser() {
		List<User> users=new ArrayList<User>();
		users=userDao.findAllUser();
		return users;
	}

	public void doregist(User user) {
		userDao.doregist(user);
		
	}

	public User userView(int userid) {
		User user=userDao.userView(userid);
		return user;
	}
	

	public void dodelete(int id) {
		userDao.dodelete(id);
		
	}

	public List<User> doseek(String name) {
		List<User> users=new ArrayList<User>();
		users=userDao.doseek(name);
		return users;
	}

	public User doupdate(int userid) {
		User user=userDao.doupdate(userid);
		return user;
	}

	public void updateaf(User user) {
		userDao.updateaf(user);
		
	}




	
	
}
