package be.technobel.makerhub.makerhub.bll;

import be.technobel.makerhub.makerhub.api.models.forms.PersonneForm;
import be.technobel.makerhub.makerhub.dal.entities.Personne;
import be.technobel.makerhub.makerhub.dal.repositories.PersonneRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PersonneServiceImpl implements PersonneService{

    private PersonneRepository personneRepository;


    public PersonneServiceImpl(PersonneRepository personneRepository) {
        this.personneRepository = personneRepository;
    }


    @Override
    public Optional<Personne> getOne(Long id) {
        return personneRepository.findById(id);
    }

    @Override
    public void create(PersonneForm form) {

        if (form == null)
            throw new IllegalArgumentException("Le formulaire ne peut pas être null");

        Personne personne = new Personne();
        personne.setNom(form.getNom());
        personne.setPrenom(form.getPrenom());
        personne.setSexe(form.getSexe());
        personne.setDateDeNaissance(form.getDateDeNaissance());
        personneRepository.save(personne);



    }

    @Override
    public void update(PersonneForm form, Long id) {

        if (form == null)
            throw new IllegalArgumentException("Le formulaire ne peut pas être null");

        Personne personne = getOne(id).orElseThrow(()-> new EntityNotFoundException("Pas trouvé"));
        personne.setNom(form.getNom());
        personne.setPrenom(form.getPrenom());
        personne.setSexe(form.getSexe());
        personne.setDateDeNaissance(form.getDateDeNaissance());
        personneRepository.save(personne);

    }

    @Override
    public List<Personne> getAll() {

        return personneRepository.findAll();
    }

    @Override
    public void delete(Long id) {
        personneRepository.deleteById(id);
    }
}
