package com.gestion.gestiondestock.dto;

import lombok.Builder;
import lombok.Data;


import java.util.List;

@Builder
@Data
public class FournisseurDto {
    String nom ;
    String prenom;

    AdresseDto adresse;
    String photo;
    String mail;
    String numTel;
    List <CommandeFournisseurDto> commandeFournisseurs;
}
