package be.technobel.makerhub.makerhub.api.models.forms;


public record AdresseForm(
     String rue,
     String numero,
     String ville,
     long codePostale,
     String Pays
) {
}
