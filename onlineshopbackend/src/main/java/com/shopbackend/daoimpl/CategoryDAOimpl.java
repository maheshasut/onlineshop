package com.shopbackend.daoimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.shopbackend.dao.CategoryDAO;
import com.shopbackend.dto.Category;


@Repository("categoryDAO")
public class CategoryDAOimpl implements CategoryDAO {

	private static List<Category> categories= new ArrayList<>();
	
	static{
		//Adding our first category
		Category category= new Category();
		category.setId(1);
		category.setName("Television");
		category.setDesc("This is description for some television");
		category.setImgageUrl("CAT_1.png");
		categories.add(category);
		
		//Second category
		 category= new Category();
		category.setId(2);
		category.setName("Mobile");
		category.setDesc("This is description for mobile");
		category.setImgageUrl("CAT_2.png");
		categories.add(category);
		
		//Third category
				 category= new Category();
				category.setId(3);
				category.setName("Laptop");
				category.setDesc("This is description for Laptop");
				category.setImgageUrl("CAT_3.png");
				categories.add(category);
				
	}
	@Override
	public List<Category> list() {
		// TODO Auto-generated method stub
		return categories;
	}
	@Override
	public Category get(int id) {
		//Enchaced for loop
		
		for(Category category:categories){
			
			if(category.getId()==id)return category;
		}
		return null;
	}

}
