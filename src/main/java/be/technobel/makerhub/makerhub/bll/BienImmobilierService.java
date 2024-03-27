package be.technobel.makerhub.makerhub.bll;

import be.technobel.makerhub.makerhub.api.models.forms.BienImmobilierForm;
import be.technobel.makerhub.makerhub.dal.entities.BienImmobilier;

import java.util.List;
import java.util.Optional;

public interface BienImmobilierService {
    Optional<BienImmobilier> getOne(Long id);
    void create(BienImmobilierForm form);
    void update (BienImmobilierForm form, Long id);
    List<BienImmobilier> getAll();
    void delete(Long id);

}
