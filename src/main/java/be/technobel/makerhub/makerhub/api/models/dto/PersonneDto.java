package be.technobel.makerhub.makerhub.api.models.dto;

import be.technobel.makerhub.makerhub.dal.entities.Personne;

import java.time.LocalDate;

public record PersonneDto(long id,
                          String nom,
                          String prenom,
                          String sexe,
                          LocalDate dateDeNaissance) {

    public static PersonneDto fromEntity(Personne entity){
        return new PersonneDto(entity.getId(), entity.getNom(), entity.getPrenom(), entity.getSexe(),entity.getDateDeNaissance());
    }
}