package com.gestion.gestiondestock.dto;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class RolesDto {
    String roleName ;

    UtilisateurDto utilisateur;
}
