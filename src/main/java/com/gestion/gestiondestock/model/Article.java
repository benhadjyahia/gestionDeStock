package com.gestion.gestiondestock.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "article")
public class Article extends AbstractEntity {


    String codeArticle ;
    String designation;
    BigDecimal prixUnitaireHt;
    BigDecimal tauwTva;
    BigDecimal prixUnitaireTtc ;
    String photo ;
    @ManyToOne
    Category category ;

}
