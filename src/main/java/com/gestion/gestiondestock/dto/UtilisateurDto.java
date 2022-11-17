package com.gestion.gestiondestock.dto;

import com.gestion.gestiondestock.model.Adresse;
import com.gestion.gestiondestock.model.Entreprise;
import com.gestion.gestiondestock.model.Roles;
import lombok.Builder;
import lombok.Data;

import javax.persistence.Embedded;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.time.Instant;
import java.util.List;

@Builder
@Data
public class UtilisateurDto {
    String nom ;
    String prenom;
    Adresse adresse;
    String photo;
    String mail;
    String numTel;
    String password;
    Instant DateDeNaissance ;

    EntrepriseDto entreprise ;
    List<RolesDto> roles ;
}
