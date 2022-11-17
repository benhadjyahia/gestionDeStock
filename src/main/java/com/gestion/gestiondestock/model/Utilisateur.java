package com.gestion.gestiondestock.model;

import lombok.*;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.time.Instant;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Entity
public class Utilisateur extends AbstractEntity{
    String nom ;
    String prenom;
    @Embedded
    Adresse adresse;
    String photo;
    String mail;
    String numTel;
    String password;
    Instant DateDeNaissance ;
    @ManyToOne
    Entreprise entreprise ;
    @OneToMany(mappedBy = "utilisateur")
    List<Roles> roles ;

}
