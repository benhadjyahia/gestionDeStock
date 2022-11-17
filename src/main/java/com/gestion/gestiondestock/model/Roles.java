package com.gestion.gestiondestock.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Entity
public class Roles extends AbstractEntity{
    String roleName ;
    @ManyToOne
    Utilisateur utilisateur;

}
