package com.gestion.gestiondestock.model;

import com.gestion.gestiondestock.dto.CommandeFournisseurDto;
import com.gestion.gestiondestock.dto.FournisseurDto;
import com.gestion.gestiondestock.dto.LigneCommandeFournisseurDto;
import lombok.*;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.time.Instant;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Entity
public class Ventes extends AbstractEntity {
    @Column(name = "code")
    private String code;

    @Column(name = "datevente")
    private Instant dateVente;

    @Column(name = "commentaire")
    private String commentaire;

    @Column(name = "identreprise")
    private Integer idEntreprise;

    @OneToMany(mappedBy = "vente")
     List<LigneVente> ligneVentes;

}
