package be.technobel.makerhub.makerhub.dal.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Entity
@Getter
@Setter
public class BienImmobilier {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String type;
    private long nbrePiece;
    private long nbreChambre;
    private String chauffage;
    private boolean garage;
    private boolean jardin;
    private boolean terasse;
    private boolean parking;
    private long surface;
    private String peb;
    private long loyer;
    private boolean disponibilite;
    private Date dateDisponible;

}
