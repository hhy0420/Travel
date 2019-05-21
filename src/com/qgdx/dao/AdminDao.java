package com.qgdx.dao;

import java.util.List;


import org.springframework.stereotype.Repository;

import com.qgdx.entity.Admin;
@Repository("adminDao")
public interface AdminDao {
	

	Admin adologin(String adminname);

	List<Admin> findAllAdmin();

	

}
