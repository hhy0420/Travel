package com.qgdx.service;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.qgdx.dao.RouteDao;
import com.qgdx.entity.Route;

@Service("routeSrevice")
public class RouteService {

	@Resource(name="routeDao")
	RouteDao routeDao;
	
	public List<Route> findAllRoute() {
		List<Route> routes=new ArrayList<Route>();
		routes=routeDao.findAllRoute();
		return routes;
	}

	public List<Route> doseek2(String rscenery) {
		List<Route> routes=new ArrayList<Route>();
		routes=routeDao.doseek2(rscenery);
		return routes;
	}

	public Route routeView(int rid) {
		Route routes=routeDao.routeView(rid);
		return routes;
	}

	public void dodelete2(int rid) {
		routeDao.dodelete2(rid);
		
	}

	

	

}
