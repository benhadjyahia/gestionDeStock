package com.gestion.gestiondestock.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import java.math.BigDecimal;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Entity
public class LigneCommandeClient extends AbstractEntity {
BigDecimal quantity ;
BigDecimal prixUnitaire ;

    @ManyToOne
    Article article ;

    @ManyToOne
   CommandeClient commandeclient;
}
