package ro.fortech.userregistration.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import ro.fortech.userregistration.entities.Users;

public interface UsersRepo extends JpaRepository<Users, Long> {
}
