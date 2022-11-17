package com.gestion.gestiondestock.model;

import lombok.*;

import javax.persistence.Entity;
import java.time.Instant;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Entity
public class Ventes extends AbstractEntity {
    String code;
    Instant dateVente;
    String commentaire;

}
