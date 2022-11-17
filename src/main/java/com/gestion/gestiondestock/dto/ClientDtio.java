package com.gestion.gestiondestock.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.gestion.gestiondestock.model.Adresse;
import com.gestion.gestiondestock.model.Category;
import com.gestion.gestiondestock.model.Client;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Builder
@Data
public class ClientDtio {
    Integer Id ;
    String nom ;
    String prenom;
    AdresseDto adresse;
    String photo;
    String mail;
    String numTel;
    @JsonIgnore
    List<CommandeClientDto> commandeClients;

/*
    public  ClientDtio fromEntity(Client client){
        if (client == null){
            return  null;
        }
        return ClientDtio.builder()
                .Id(client.getId())
                .nom(client.getNom())
                .prenom(client.getPrenom())
                .photo()
                .build();
    }
    public  Category toEntity(CategoryDto categoryDto){
        if (categoryDto == null){
            return  null;
        }
        Category category = new Category();
        category.setId(categoryDto.getId());
        category.setCode(categoryDto.getCode());
        category.setDesignation(categoryDto.getDesignation());
        return  category;
    }*/
}
