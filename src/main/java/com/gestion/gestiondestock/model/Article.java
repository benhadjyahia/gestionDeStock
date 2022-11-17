package com.gestion.gestiondestock.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.math.BigDecimal;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "article")
public class Article extends AbstractEntity {


    String codeArticle ;
    String designation;
    BigDecimal prixUnitaireHt;
    BigDecimal tauxTva;
    BigDecimal prixUnitaireTtc ;
    String photo ;
    @ManyToOne
    Category category ;

}
