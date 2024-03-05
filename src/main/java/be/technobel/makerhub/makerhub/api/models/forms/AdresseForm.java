package be.technobel.makerhub.makerhub.api.models.forms;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AdresseForm {
    private String rue;
    private String numero;
    private String ville;
    private long codePostale;
    private String Pays;
}
