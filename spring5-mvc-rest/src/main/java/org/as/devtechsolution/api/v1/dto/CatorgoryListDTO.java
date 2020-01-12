package org.as.devtechsolution.api.v1.dto;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class CatorgoryListDTO {
	
	List<CategoryDTO> categories;
}
