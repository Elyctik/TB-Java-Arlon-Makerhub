package be.technobel.makerhub.makerhub.dal.repositories;

import be.technobel.makerhub.makerhub.dal.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByLogin(String login);
}
