package be.technobel.makerhub.makerhub.bll;

import be.technobel.makerhub.makerhub.api.models.forms.BienImmobilierForm;
import be.technobel.makerhub.makerhub.dal.entities.BienImmobilier;
import be.technobel.makerhub.makerhub.dal.repositories.BienImmobilierRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BienImmobilierServiceImpl implements BienImmobilierService{

    private BienImmobilierRepository bienImmobilierRepository;

    public BienImmobilierServiceImpl(BienImmobilierRepository bienImmobilierRepository) {
        this.bienImmobilierRepository = bienImmobilierRepository;
    }

    @Override
    public Optional<BienImmobilier> getOne(Long id) {
        return bienImmobilierRepository.findById(id);
    }

    @Override
    public void create(BienImmobilierForm form) {

    }

    @Override
    public void update(BienImmobilierForm form, Long id) {

    }

    @Override
    public List<BienImmobilier> getAll() {
        return null;
    }

    @Override
    public void delete(Long id) {

    }
}
