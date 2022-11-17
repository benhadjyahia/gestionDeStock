package com.gestion.gestiondestock.dto;


import lombok.Builder;
import lombok.Data;

import java.time.Instant;
import java.util.List;
@Builder
@Data
public class CommandeFournisseurDto {
    String code ;
    Instant dateCommande;
    List<LigneCommandeFournisseurDto> ligneCommandeFournisseurs;

    FournisseurDto fournisseur;
}
