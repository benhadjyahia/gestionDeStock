package com.gestion.gestiondestock.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Entity
public class LigneCommandeClient extends AbstractEntity {

    @ManyToOne
    Article article ;

    @ManyToOne
   CommandeClient commandeclient;
}
