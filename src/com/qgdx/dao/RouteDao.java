package com.qgdx.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.qgdx.entity.Route;

@Repository("routeDao")
public interface RouteDao {

	List<Route> findAllRoute();

	List<Route> doseek2(String rscenery);

	Route routeView(int rid);

	void dodelete2(int rid);


	

}
