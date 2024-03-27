package be.technobel.makerhub.makerhub.api.models.forms;


import java.util.Date;


public record BienImmobilierForm(
     String type,
     long nbrePiece,
     long nbreChambre,
     String chauffage,
     boolean garage,
     boolean jardin,
     boolean terasse,
     boolean parking,
     long surface,
     String peb,
     long loyer,
     boolean disponibilite,
     Date dateDisponible
) {
}
