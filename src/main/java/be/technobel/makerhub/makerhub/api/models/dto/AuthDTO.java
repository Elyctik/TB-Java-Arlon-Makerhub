package be.technobel.makerhub.makerhub.api.models.dto;

import be.technobel.makerhub.makerhub.dal.Enum.UserRole;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Getter
@Setter
@Builder
public class AuthDTO {
    private String login;
    private String token;
    private Set<UserRole> roles;
}
