package com.gestion.gestiondestock.dto;

import lombok.Builder;
import lombok.Data;

import java.time.Instant;
import java.util.List;
@Builder
@Data
public class CommandeClientDto {
    String code;

    Instant dateDeCommande;

    ClientDtio client;

    List<LigneCommandeClientDto> ligneCommandeClients ;

}
