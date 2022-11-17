package com.gestion.gestiondestock.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "category")
public class Category extends  AbstractEntity {
String code ;
String designation;
 @OneToMany(mappedBy = "category")
 List <Article> articles ;


}
