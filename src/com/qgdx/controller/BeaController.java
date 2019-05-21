package com.qgdx.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.qgdx.entity.Bea;
import com.qgdx.service.BeaService;

@Controller
public class BeaController {
	@Resource(name="beaService")
	BeaService service;
	
	@RequestMapping("beautifulList.do")
	public String dologin(HttpServletRequest request){
		List<Bea> beas = new ArrayList<Bea>();
		beas=service.findAllBea();
		request.setAttribute("beas", beas);
		return "beautifulList";
	}
	
	//查询
	@RequestMapping("seek1.do")
	public String seek1(HttpServletRequest request,String bname){
		//System.out.println("进入seek1.do请求");
		System.out.println(bname);
		List<Bea> beas=new ArrayList<Bea>();
		beas=service.doseek1(bname);
		request.setAttribute("beas", beas);
		return "beautifulList";
	}
	
	//查看
	@RequestMapping("beautifulView.do")
	public String beautifulView(HttpServletRequest request,int bid){
		System.out.println("进入beautifulView.do请求");
		System.out.println(bid);
		Bea bea=service.beautifulView(bid);
		request.setAttribute("bea", bea);
		return "beautifulView";
	}
	
	//删除
	@RequestMapping("beaDelete.do")
	public String delete(HttpServletRequest request,int bid){
		System.out.println("进入beaDelete.do请求");
		System.out.println(bid);
		service.dodelete1(bid);
		List<Bea> beas=new ArrayList<Bea>();
		beas=service.findAllBea();
		request.setAttribute("beas", beas);
		return "beautifulList";
	}
	
}
