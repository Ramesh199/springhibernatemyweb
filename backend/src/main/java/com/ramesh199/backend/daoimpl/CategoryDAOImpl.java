package com.ramesh199.backend.daoimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.ramesh199.backend.dao.CategoryDAO;
import com.ramesh199.backend.dto.Category;

@Repository("categoryDAO")
public class CategoryDAOImpl implements CategoryDAO {

	private static List<Category> categories = new ArrayList<>();

	static {
		Category category = new Category();

		// Adding first category
		category.setId(1);
		category.setName("Television");
		category.setDescription("Television category description");
		category.setImageurl("CAT_1.png");

		categories.add(category);

		// Adding second category
		category = new Category();
		category.setId(2);
		category.setName("Mobile");
		category.setDescription("Mobile category description");
		category.setImageurl("CAT_2.png");

		categories.add(category);

		// Adding third category
		category = new Category();
		category.setId(3);
		category.setName("Laptop");
		category.setDescription("Laptop category description");
		category.setImageurl("CAT_3.png");

		categories.add(category);

	}

	@Override
	public List<Category> list() {
		// TODO Auto-generated method stub
		return categories;
	}

	@Override
	public Category get(int id) {
		
		// enhanced for loop
		for(Category category : categories) {
			if(category.getId() == id) return category;
		}
		return null;
	}

}
