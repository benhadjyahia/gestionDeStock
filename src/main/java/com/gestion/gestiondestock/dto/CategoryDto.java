package com.gestion.gestiondestock.dto;

import lombok.Builder;
import lombok.Data;
import java.util.List;

@Builder
@Data
public class CategoryDto {
    String code ;
    String designation;

    List<ArticleDto> articles ;

}
