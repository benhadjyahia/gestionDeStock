package com.gestion.gestiondestock.dto;

import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;

@Builder
@Data
public class LigneCommandeFournisseurDto {
    BigDecimal quantity ;
    BigDecimal prixUnitaire ;

    ArticleDto article ;

    CommandeFournisseurDto commandefournisseur;
}