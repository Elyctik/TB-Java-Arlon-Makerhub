package be.technobel.makerhub.makerhub.api.models.forms;


import java.time.LocalDate;

public record PersonneForm(
     String nom,
     String prenom,
     String sexe,
     LocalDate dateDeNaissance
) {
}
