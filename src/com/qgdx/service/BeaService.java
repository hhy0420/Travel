package com.qgdx.service;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.qgdx.dao.BeaDao;
import com.qgdx.entity.Bea;

@Service("beaService")
public class BeaService {
	@Resource(name="beaDao")
	BeaDao beaDao;
	
	public List<Bea> findAllBea() {
		List<Bea> beas = new ArrayList<Bea>();
		beas=beaDao.findAllBea();
		return beas;
	}

	public List<Bea> doseek1(String bname) {
		List<Bea> beas=new ArrayList<Bea>();
		beas=beaDao.doseek1(bname);
		return beas;
	}

	public Bea beautifulView(int bid) {
		Bea bea=beaDao.beautifulView(bid);
		return bea;
	}

	public void dodelete1(int bid) {
		beaDao.dodelete1(bid);
		
	}


}
