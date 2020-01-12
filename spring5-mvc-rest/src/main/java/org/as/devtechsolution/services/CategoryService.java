package org.as.devtechsolution.services;

import java.util.List;

import org.as.devtechsolution.api.v1.dto.CategoryDTO;

public interface CategoryService {
	 public List<CategoryDTO> getAllCategories();
	 public CategoryDTO getCategoryByName(String name);

}
