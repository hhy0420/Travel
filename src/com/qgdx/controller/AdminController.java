package com.qgdx.controller;

import java.util.ArrayList;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.qgdx.entity.Admin;
import com.qgdx.service.AdminService;

@Controller
public class AdminController {

	@Resource(name="adminService")
	AdminService service;
	
	@RequestMapping("alogin.do")
	public String dologin1(HttpServletRequest request,String adminname,String adminpassword){
		System.out.println(adminname);
		System.out.println("进入alogin.do请求");
		Admin admin=service.dologin1(adminname);
		if(adminname==null){
			System.out.println("无法查到此账号");
			return "redirect:alogin.html";
		}else{
			if(adminname.equals(admin.getAdminname())&&adminpassword.equals(admin.getAdminpassword())){
				List<Admin> admins=new ArrayList<Admin>();
				admins=service.fingAllAdmin();
				System.out.println(admins);
				request.setAttribute("admins", admins);
				return "aindex";
			}
			else{
				return "redirect:alogin.html";
			}
		}
	}
}
