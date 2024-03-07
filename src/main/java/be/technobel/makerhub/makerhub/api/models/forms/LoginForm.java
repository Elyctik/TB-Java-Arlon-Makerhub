package be.technobel.makerhub.makerhub.api.models.forms;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class LoginForm {
    private String login;
    private String password;
}
