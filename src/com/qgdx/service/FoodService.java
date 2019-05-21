package com.qgdx.service;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

import com.qgdx.dao.FoodDao;
import com.qgdx.entity.Food;

@Service("foodService")
public class FoodService {

	@Resource(name="foodDao")
	FoodDao foodDao;

	public List<Food> findAllFood() {
		List<Food> foods=new ArrayList<Food>();
		foods=foodDao.findAllFood();
		return foods;
	}

	public List<Food> doseek3(String fname) {
		List<Food> foods=new ArrayList<Food>();
		foods=foodDao.doseek3(fname);
		return foods;
	}

	public Food foodView(int fid) {
		Food foods=foodDao.foodView(fid);
		return foods;
	}

	public void dodelete3(int fid) {
		foodDao.dodelete3(fid);
		
	}	

}
