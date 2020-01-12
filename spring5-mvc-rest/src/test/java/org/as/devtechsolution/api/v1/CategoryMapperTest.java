package org.as.devtechsolution.api.v1;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.as.devtechsolution.api.v1.dto.CategoryDTO;
import org.as.devtechsolution.api.v1.mapper.CategoryMapper;
import org.as.devtechsolution.entity.Category;
import org.junit.jupiter.api.Test;

public class CategoryMapperTest {

    public static final String NAME = "Joe";
    public static final long ID = 1L;

    CategoryMapper categoryMapper = CategoryMapper.INSTANCE;

    @Test
    public void categoryToCategoryDTO() throws Exception {

        //given
        Category category = new Category();
        category.setName(NAME);
        category.setId(ID);

        //when
        CategoryDTO categoryDTO = categoryMapper.categoryToCategoryDto(category);

        //then
        assertEquals(Long.valueOf(ID), categoryDTO.getId());
        assertEquals(NAME, categoryDTO.getName());
    }

}