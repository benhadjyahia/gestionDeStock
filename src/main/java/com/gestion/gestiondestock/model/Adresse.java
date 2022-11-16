package com.gestion.gestiondestock.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.Embeddable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Embeddable
public class Adresse {
    private  String adresse1;
    private  String adresse2;
    private  String ville;
    private  String codePostale;
    private  String pays;
}
