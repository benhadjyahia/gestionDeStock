package com.gestion.gestiondestock.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.gestion.gestiondestock.model.Category;
import lombok.Builder;
import lombok.Data;
import java.util.List;

@Builder
@Data
public class CategoryDto {
    Integer Id ;
    String code ;
    String designation;
    @JsonIgnore
    List<ArticleDto> articles ;

    public  CategoryDto fromEntity(Category category){
        if (category == null){
            return  null;
        }
       return CategoryDto.builder()
                .code(category.getCode())
                .Id(category.getId())
                .designation(category.getDesignation())
                .build();
    }
    public  Category toEntity(CategoryDto categoryDto){
        if (categoryDto == null){
            return  null;
        }
        Category category = new Category();
        category.setId(categoryDto.getId());
        category.setCode(categoryDto.getCode());
        category.setDesignation(categoryDto.getDesignation());
        return  category;
    }


}
