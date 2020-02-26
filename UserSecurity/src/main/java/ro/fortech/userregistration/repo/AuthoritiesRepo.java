package ro.fortech.userregistration.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import ro.fortech.userregistration.entities.Authorities;

public interface AuthoritiesRepo extends JpaRepository<Authorities, Long> {
}
