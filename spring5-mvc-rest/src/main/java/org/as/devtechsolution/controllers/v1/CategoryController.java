package org.as.devtechsolution.controllers.v1;

import org.as.devtechsolution.api.v1.dto.CategoryDTO;
import org.as.devtechsolution.api.v1.dto.CatorgoryListDTO;
import org.as.devtechsolution.services.CategoryService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/categories/")
public class CategoryController {
	
	 private final CategoryService categoryService;

	    public CategoryController(CategoryService categoryService) {
	        this.categoryService = categoryService;
	    }

	    @GetMapping
	    public ResponseEntity<CatorgoryListDTO> getallCatetories(){

	        return new ResponseEntity<CatorgoryListDTO>(
	                new CatorgoryListDTO(categoryService.getAllCategories()), HttpStatus.OK);
	    }

	    @GetMapping("{name}")
	    public ResponseEntity<CategoryDTO> getCategoryByName( @PathVariable String name){
	        return new ResponseEntity<CategoryDTO>(
	                categoryService.getCategoryByName(name), HttpStatus.OK
	        );
	    }

}
