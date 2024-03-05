package be.technobel.makerhub.makerhub.bll;

import be.technobel.makerhub.makerhub.api.models.forms.PersonneForm;
import be.technobel.makerhub.makerhub.dal.entities.Personne;

import java.util.List;
import java.util.Optional;

public interface PersonneService {

    Optional<Personne> getOne(Long id);
    void create(PersonneForm form);
    void update(PersonneForm form, Long id);
    List<Personne> getAll();
    void delete(Long id);
}
