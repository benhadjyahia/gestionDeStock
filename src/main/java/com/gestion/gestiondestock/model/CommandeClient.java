package com.gestion.gestiondestock.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.time.Instant;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)

@Entity
public class CommandeClient extends AbstractEntity {
String code;
Instant dateDeCommande;

@ManyToOne
    Client client;
@OneToMany(mappedBy = "commandeclient")
List<LigneCommandeClient> ligneCommandeClients ;
}
