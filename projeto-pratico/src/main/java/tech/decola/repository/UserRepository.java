package tech.decola.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tech.decola.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
