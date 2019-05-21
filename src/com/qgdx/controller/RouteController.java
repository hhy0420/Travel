package com.qgdx.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.qgdx.entity.Route;
import com.qgdx.service.RouteService;

@Controller
public class RouteController {
	@Resource(name="routeSrevice")
	RouteService service;
	
	@RequestMapping("routeList.do")
	public String dologin(HttpServletRequest request){
		List<Route> routes=new ArrayList<Route>();
		routes=service.findAllRoute();
		request.setAttribute("routes", routes);
		return "routeList";
	}
	
	//��ѯ
	@RequestMapping("seek2.do")
	public String seek2(HttpServletRequest request,String rscenery){
		System.out.println("����seek2.do");
		System.out.println(rscenery);
		List<Route> routes=new ArrayList<Route>();
		routes=service.doseek2(rscenery);
		request.setAttribute("routes", routes);
		return "routeList";
	}
	
	//�鿴
	@RequestMapping("routeView.do")
	public String routeView(HttpServletRequest request,int rid){
		System.out.println("����routeView.do����");
		System.out.println(rid);
		Route routes=service.routeView(rid);
		request.setAttribute("routes", routes);
		return "routeView";
	}
	
	//ɾ��
	@RequestMapping("routeDelete.do")
	public String delete(HttpServletRequest request,int rid){
		System.out.println("����routeDelete.do����");
		System.out.println(rid);
		service.dodelete2(rid);
		List<Route> routes=new ArrayList<Route>();
		routes=service.findAllRoute();
		request.setAttribute("routes", routes);
		return "routeList";
	}
}
