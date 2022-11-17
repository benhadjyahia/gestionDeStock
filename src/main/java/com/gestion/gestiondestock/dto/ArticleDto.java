package com.gestion.gestiondestock.dto;

import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;

@Builder
@Data
public class ArticleDto {
    String codeArticle ;
    String designation;
    BigDecimal prixUnitaireHt;
    BigDecimal tauwTva;
    BigDecimal prixUnitaireTtc ;
    String photo ;

    CategoryDto category ;
}
