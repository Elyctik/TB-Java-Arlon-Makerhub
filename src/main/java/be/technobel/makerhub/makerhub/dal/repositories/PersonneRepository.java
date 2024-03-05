package be.technobel.makerhub.makerhub.dal.repositories;

import be.technobel.makerhub.makerhub.dal.entities.Personne;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonneRepository extends JpaRepository<Personne, Long> {

}
