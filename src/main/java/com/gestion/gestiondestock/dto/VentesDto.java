package com.gestion.gestiondestock.dto;

import lombok.Builder;
import lombok.Data;

import java.time.Instant;
@Data
@Builder
public class VentesDto {
    Integer Id ;
    String code;
    Instant dateVente;
    String commentaire;
}
