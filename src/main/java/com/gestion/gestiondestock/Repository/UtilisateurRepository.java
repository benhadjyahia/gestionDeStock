package com.gestion.gestiondestock.Repository;

import java.util.Optional;

import com.gestion.gestiondestock.model.Utilisateur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UtilisateurRepository extends JpaRepository<Utilisateur, Integer> {

  // JPQL query
  @Query(value = "select u from Utilisateur u where u.email = :email")
  Optional<Utilisateur> findUtilisateurByEmail(@Param("email") String email);

}
