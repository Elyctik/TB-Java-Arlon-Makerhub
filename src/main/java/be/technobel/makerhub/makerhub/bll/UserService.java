package be.technobel.makerhub.makerhub.bll;

import be.technobel.makerhub.makerhub.api.models.dto.AuthDTO;
import be.technobel.makerhub.makerhub.api.models.forms.LoginForm;
import be.technobel.makerhub.makerhub.api.models.forms.UserForm;
import be.technobel.makerhub.makerhub.dal.entities.User;

import java.util.Optional;
import java.util.Set;

public interface UserService {
    void register(UserForm form);
    AuthDTO login(LoginForm form);
    Optional<User> getOne(String login);
    Set<String> getAllName();

}
