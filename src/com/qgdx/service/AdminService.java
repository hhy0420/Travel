package com.qgdx.service;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.qgdx.dao.AdminDao;
import com.qgdx.entity.Admin;
@Service("adminService")
public class AdminService {

	@Resource(name="adminDao")
	AdminDao adminDao;
	public Admin dologin1(String adminname) {
		Admin admin=adminDao.adologin(adminname);
		return admin;
	}
	public List<Admin> fingAllAdmin() {
		List<Admin> admins=new ArrayList<Admin>();
		admins=adminDao.findAllAdmin();
		return admins;
	}

}
