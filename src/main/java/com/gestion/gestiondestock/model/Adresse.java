package com.gestion.gestiondestock.model;

import lombok.*;

import javax.persistence.Embeddable;
@Getter
@Setter
@Data
@NoArgsConstructor
@AllArgsConstructor
@Embeddable
public class Adresse {
    private  String adresse1;
    private  String adresse2;
    private  String ville;
    private  String codePostale;
    private  String pays;
}
