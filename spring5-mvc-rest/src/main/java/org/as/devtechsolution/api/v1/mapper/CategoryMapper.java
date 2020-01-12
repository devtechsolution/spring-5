package org.as.devtechsolution.api.v1.mapper;


import org.as.devtechsolution.api.v1.dto.CategoryDTO;
import org.as.devtechsolution.entity.Category;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface CategoryMapper {

	CategoryMapper INSTANCE= Mappers.getMapper(CategoryMapper.class);
	
	CategoryDTO categoryToCategoryDto(Category category);
}
