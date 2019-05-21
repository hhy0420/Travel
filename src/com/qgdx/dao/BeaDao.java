package com.qgdx.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.qgdx.entity.Bea;
@Repository("beaDao")
public interface BeaDao {

	List<Bea> findAllBea();

	List<Bea> doseek1(String bname);

	Bea beautifulView(int bid);

	void dodelete1(int bid);
	
}
