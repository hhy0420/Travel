package com.qgdx.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.qgdx.entity.Food;

@Repository("foodDao")
public interface FoodDao {

	List<Food> findAllFood();

	List<Food> doseek3(String fname);

	Food foodView(int fid);

	void dodelete3(int fid);

}
