package be.technobel.makerhub.makerhub.dal.repositories;

import be.technobel.makerhub.makerhub.dal.entities.BienImmobilier;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BienImmobilierRepository extends JpaRepository<BienImmobilier, Long> {
}
