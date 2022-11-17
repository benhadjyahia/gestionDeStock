package com.gestion.gestiondestock.dto;

import com.gestion.gestiondestock.model.Adresse;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Builder
@Data
public class ClientDtio {
    String nom ;
    String prenom;
    AdresseDto adresse;
    String photo;
    String mail;
    String numTel;

    List<CommandeClientDto> commandeClients;
}
