package com.ramesh199.backend.dao;

import java.util.List;

import com.ramesh199.backend.dto.Category;

public interface CategoryDAO {
	
	List<Category> list();
	Category get(int id);
}
