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
	
	//��ѯ
	@RequestMapping("seek1.do")
	public String seek1(HttpServletRequest request,String bname){
		//System.out.println("����seek1.do����");
		System.out.println(bname);
		List<Bea> beas=new ArrayList<Bea>();
		beas=service.doseek1(bname);
		request.setAttribute("beas", beas);
		return "beautifulList";
	}
	
	//�鿴
	@RequestMapping("beautifulView.do")
	public String beautifulView(HttpServletRequest request,int bid){
		System.out.println("����beautifulView.do����");
		System.out.println(bid);
		Bea bea=service.beautifulView(bid);
		request.setAttribute("bea", bea);
		return "beautifulView";
	}
	
	//ɾ��
	@RequestMapping("beaDelete.do")
	public String delete(HttpServletRequest request,int bid){
		System.out.println("����beaDelete.do����");
		System.out.println(bid);
		service.dodelete1(bid);
		List<Bea> beas=new ArrayList<Bea>();
		beas=service.findAllBea();
		request.setAttribute("beas", beas);
		return "beautifulList";
	}
	
}
