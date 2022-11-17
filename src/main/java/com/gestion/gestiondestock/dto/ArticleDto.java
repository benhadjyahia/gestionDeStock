package com.gestion.gestiondestock.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.gestion.gestiondestock.model.Adresse;
import com.gestion.gestiondestock.model.Article;
import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;

@Builder
@Data
public class ArticleDto {
    Integer Id ;
    String codeArticle ;
    String designation;
    BigDecimal prixUnitaireHt;
    BigDecimal tauwTva;
    BigDecimal prixUnitaireTtc ;
    String photo ;
@JsonIgnore
    CategoryDto category ;

    public  ArticleDto fromEntity(Article article){
        if (article == null){
            return  null;
        }
        return ArticleDto.builder()
                .Id(article.getId())
                .codeArticle(article.getCodeArticle())
                .designation(article.getDesignation())
                .prixUnitaireHt(article.getPrixUnitaireHt())
                .tauwTva(article.getTauxTva())
                .prixUnitaireTtc(article.getPrixUnitaireTtc())
                .photo(article.getPhoto())
                .build();
    }
    public  Article toEntity(ArticleDto articleDto){
        if (articleDto == null){
            return  null;
        }
        Article article = new Article();
        article.setId(articleDto.getId());
        article.setCodeArticle(articleDto.getCodeArticle());
        article.setDesignation(articleDto.getDesignation());
        article.setPrixUnitaireHt(articleDto.getPrixUnitaireHt());
        article.setPrixUnitaireTtc(articleDto.getPrixUnitaireTtc());
        article.setTauxTva(articleDto.getTauwTva());
        article.setPhoto(articleDto.getPhoto());


        return  article;
    }
}
