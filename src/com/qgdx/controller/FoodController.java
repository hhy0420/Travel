package com.qgdx.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.qgdx.entity.Food;
import com.qgdx.service.FoodService;

@Controller
public class FoodController {
	@Resource(name="foodService")
	FoodService service;
	
	@RequestMapping("foodList.do")
	public String dologin(HttpServletRequest request){
		List<Food> foods=new ArrayList<Food>();
		foods=service.findAllFood();
		request.setAttribute("foods", foods);
		return "foodList";
	}
	
	//��ѯ
	@RequestMapping("seek3.do")
	public String seek3(HttpServletRequest request,String fname){
		System.out.println("����seek3.do����");
		System.out.println(fname);
		List<Food> foods=new ArrayList<Food>();
		foods=service.doseek3(fname);
		request.setAttribute("foods", foods);
		return "foodList";
	}
	
	//�鿴
	@RequestMapping("foodView.do")
	public String foodView(HttpServletRequest request,int fid){
		System.out.println("����foodView.do����");
		System.out.println(fid);
		Food foods=service.foodView(fid);
		request.setAttribute("foods", foods);
		return "foodView";
	}
	
	//ɾ��
	@RequestMapping("foodDelete.do")
	public String delete(HttpServletRequest request,int fid){
		System.out.println("����foodDelete.do����");
		System.out.println(fid);
		service.dodelete3(fid);
		List<Food> foods=new ArrayList<Food>();
		foods=service.findAllFood();
		request.setAttribute("foods", foods);
		return "foodList";
	}
}
