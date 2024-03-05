package be.technobel.makerhub.makerhub.bll;

import be.technobel.makerhub.makerhub.api.models.forms.AdresseForm;
import be.technobel.makerhub.makerhub.dal.entities.Adresse;
import be.technobel.makerhub.makerhub.dal.repositories.AdresseRepository;
import be.technobel.makerhub.makerhub.dal.repositories.PersonneRepository;

import java.util.List;
import java.util.Optional;

public class AdresseServiceImpl implements AdresseService{

    private AdresseRepository adresseRepository;

    public AdresseServiceImpl(AdresseRepository adresseRepository) {
        this.adresseRepository = adresseRepository;
    }
    @Override
    public Optional<Adresse> getOne(Long id) {
        return adresseRepository.findById(id);
    }

    @Override
    public void create(AdresseForm form) {

    }

    @Override
    public void update(AdresseForm form, Long id) {

    }

    @Override
    public List<Adresse> getAll() {
        return null;
    }

    @Override
    public void delete(Long id) {

    }
}
