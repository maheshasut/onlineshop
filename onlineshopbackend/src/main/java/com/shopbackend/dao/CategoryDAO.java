package com.shopbackend.dao;

import java.util.List;

import com.shopbackend.dto.Category;

public interface CategoryDAO {

	List<Category>  list();
	Category get(int id);
	
	
}
