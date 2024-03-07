package be.technobel.makerhub.makerhub.api.models.dto;

import be.technobel.makerhub.makerhub.dal.entities.User;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class UserDTO {
    public static UserDTO fromEntityToDTO(User entity) {
        return UserDTO.builder()
                .build();
    }

    //TODO Ici, je n'ai pas ton histoire de badge, du coup je me demande si je dois mettre quelque chose.
}
