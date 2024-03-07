package be.technobel.makerhub.makerhub.api.models.forms;


import be.technobel.makerhub.makerhub.dal.Enum.UserRole;
import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Getter
@Setter
public class UserForm {
    private String nom;

    private Set<UserRole> roles;

    private String login;
    private String password;

}
