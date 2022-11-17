package com.gestion.gestiondestock.dto;

import com.gestion.gestiondestock.model.TypeMvtStk;
import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;
import java.time.Instant;

@Builder
@Data
public class MvtStckDto {
    Instant DateMvt;
    BigDecimal quantity ;
    TypeMvtStk TypeMvt ;

    ArticleDto article ;
}
