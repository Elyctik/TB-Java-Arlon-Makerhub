package be.technobel.makerhub.makerhub.dal.entities;

import be.technobel.makerhub.makerhub.dal.Enum.UserRole;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.Set;


@Entity
@Getter
@Setter
public class Personne {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO )
    private long id;
    private String nom;
    private String prenom;
    private String sexe;
    private LocalDate dateDeNaissance;
    private Set<UserRole> roles;

}
