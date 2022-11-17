package com.gestion.gestiondestock.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Entity
public class Entreprise extends AbstractEntity{
    String nom ;
    String Desciption ;
    Adresse adresse ;
    String codeFiscale ;
    String Photo ;
    String email ;
    String numTel ;
    String siteWeb;
    @OneToMany(mappedBy = "entreprise")
    List<Utilisateur> utilisateurs ;

}
