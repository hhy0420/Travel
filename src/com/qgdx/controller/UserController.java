package com.qgdx.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.qgdx.entity.User;
import com.qgdx.service.UserService;

@Controller
public class UserController {
	//���ӵ�service��ͨ�������ҵ�service
	@Resource(name="userService")
	UserService service;
	
	//��¼
	@RequestMapping("login.do")
	public String dologin(HttpServletRequest request,String username,String password){
		System.out.println("����login.do����");
		User user=service.dologin(username);
		//System.out.println(user);
		if(user==null){
			System.out.println("�޷��鵽���˺�");
			return "redirect:index.html";
		}else{
			if(username.equals(user.getUsername())&&password.equals(user.getPassword())){
				List<User> users=new ArrayList<User>();
				users=service.findAllUser();
				System.out.println(users);
				request.setAttribute("users", users);
				return "inindex";
			}
			else{
				return "redirect:index.html";
			}
		}
	}

	//ע��
	@RequestMapping("regist.do")
	public String doregist(HttpServletRequest request,User user){
		System.out.println(user);
		service.doregist(user);
		return "redirect:login.html";
	}
	
	@RequestMapping("userList.do")
	public String userList(HttpServletRequest request){
		System.out.println("����list.do����");
				List<User> users=new ArrayList<User>();
				users=service.findAllUser();
				System.out.println(users);
				request.setAttribute("users", users);
				return "userList";
	}
	
	//��ѯ
	@RequestMapping("seek.do")
	public String seek(HttpServletRequest request,String name){
		System.out.println(name);
		List<User> users=new ArrayList<User>();
		users=service.doseek(name);
		request.setAttribute("users", users);
		return "userList";
	}
	
	//�鿴
	@RequestMapping("userView.do")
	public String userView(HttpServletRequest request,int userid){
		System.out.println("�鿴ʱ��������id:"+userid);
		User user=service.userView(userid);
		System.out.println(user);
		request.setAttribute("user", user);
		return "userView";
	}
	
	//�޸�
		@RequestMapping("userupdate.do")
		public String doupdate(HttpServletRequest request,int userid){
			System.out.println("�޸�ʱǰ��������idΪ:"+userid);
			User user=service.doupdate(userid);
			request.setAttribute("user", user);
			return "userUpdate";
		}
		//���
		@RequestMapping("updateaf.do")
		public String doupdateaf(HttpServletRequest request,User user){
			System.out.println(user);
			service.updateaf(user);
			List<User> users=new ArrayList<User>();
			users=service.findAllUser();
			request.setAttribute("users", users);
			return "";
		}
	
	//ɾ��
	@RequestMapping("userDelete.do")
	public String delete(HttpServletRequest request,int id){
		System.out.println(id);
		service.dodelete(id);
		List<User> users=new ArrayList<User>();
		users=service.findAllUser();
		request.setAttribute("users", users);
		return "userList";
	}
}
