package com.qgdx.dao;

import java.util.List;



import org.springframework.stereotype.Repository;

import com.qgdx.entity.User;

@Repository("userDao")
public interface UserDao {

	User dologin(String username);

	List<User> findAllUser();

	void doregist(User user);


	User userView(int userid);


	void dodelete(int id);

	List<User> doseek(String name);

	User doupdate(int userid);

	void updateaf(User user);

	
}
