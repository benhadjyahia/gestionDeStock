package com.gestion.gestiondestock.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import java.math.BigDecimal;
import java.time.Instant;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Entity
public class MvtStk extends AbstractEntity{
    Instant DateMvt;
            BigDecimal quantity ;
            TypeMvtStk TypeMvt ;
    @ManyToOne
    Article article ;

}
