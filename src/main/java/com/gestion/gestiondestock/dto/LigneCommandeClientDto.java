package com.gestion.gestiondestock.dto;

import com.gestion.gestiondestock.model.Article;
import com.gestion.gestiondestock.model.CommandeClient;
import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;

@Builder
@Data
public class LigneCommandeClientDto {
    Integer Id ;
    BigDecimal quantity ;

    BigDecimal prixUnitaire ;

    ArticleDto article ;

    CommandeClientDto commandeclient;
}
