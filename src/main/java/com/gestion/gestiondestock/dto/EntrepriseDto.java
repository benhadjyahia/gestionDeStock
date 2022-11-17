package com.gestion.gestiondestock.dto;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Builder
@Data
public class EntrepriseDto {
    String nom ;
    String Desciption ;
    AdresseDto adresse ;
    String codeFiscale ;
    String Photo ;
    String email ;
    String numTel ;
    String siteWeb;
    List<UtilisateurDto> utilisateurs ;
}
