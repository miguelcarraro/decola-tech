package decola_tech.aulaJPA.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import decola_tech.aulaJPA.model.User;


public interface UserRepository extends JpaRepository<User, Integer> {
}
