package io.github.aplaraujo.repositories;

import io.github.aplaraujo.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.UserDetails;

public interface UserRepository extends JpaRepository<User, Long> {

    User findByNameAndLogin(String name, String login);

    UserDetails findByLogin(String login);
}
