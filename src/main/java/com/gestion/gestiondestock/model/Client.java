package com.gestion.gestiondestock.model;

import lombok.*;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Entity
public class Client extends  AbstractEntity{
String nom ;
String prenom;
@Embedded
Adresse adresse;
String photo;
String mail;
String numTel;
@OneToMany(mappedBy = "client")
List <CommandeClient> commandeClients;
}
