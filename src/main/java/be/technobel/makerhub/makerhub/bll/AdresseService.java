package be.technobel.makerhub.makerhub.bll;

import be.technobel.makerhub.makerhub.dal.entities.Adresse;

import java.util.List;
import java.util.Optional;

public interface AdresseService {

    Optional<Adresse> getOne(Long id); //TODO :
    void create(AdresseForm form);
    void update(AdresseForm form, Long id);
    List<Adresse> getAll();
    void delete(Long id);
}
