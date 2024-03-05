package be.technobel.makerhub.makerhub.dal.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Adresse {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id_adresse;
    private String rue;
    private String numero; // String car parfois 32/A
    private String ville;
    private long codePostale;
    private String Pays;

}
