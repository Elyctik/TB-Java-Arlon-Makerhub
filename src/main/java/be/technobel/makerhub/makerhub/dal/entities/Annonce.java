package be.technobel.makerhub.makerhub.dal.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Annonce {
    @Id
    @GeneratedValue
    private long id;
    private String description;


}
