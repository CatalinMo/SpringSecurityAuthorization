package ro.fortech.springsecurity.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ro.fortech.springsecurity.entity.EntityUser;

import java.util.Optional;

public interface EntityUserRepository extends JpaRepository<EntityUser, Long> {
    Optional<EntityUser> findByUserName(String userName);
}
