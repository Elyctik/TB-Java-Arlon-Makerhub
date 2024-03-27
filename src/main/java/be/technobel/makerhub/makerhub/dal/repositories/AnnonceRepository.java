package be.technobel.makerhub.makerhub.dal.repositories;

import be.technobel.makerhub.makerhub.dal.entities.Annonce;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AnnonceRepository extends JpaRepository<Annonce, Long> {
}
