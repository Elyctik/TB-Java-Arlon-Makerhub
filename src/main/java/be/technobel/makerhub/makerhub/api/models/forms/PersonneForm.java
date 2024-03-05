package be.technobel.makerhub.makerhub.api.models.forms;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
@Getter
@Setter
public class PersonneForm {
    private String nom;
    private String prenom;
    private String sexe;
    private LocalDate dateDeNaissance;

}
