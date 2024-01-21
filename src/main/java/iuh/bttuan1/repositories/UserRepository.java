package iuh.bttuan1.repositories;

import com.example.api_week01.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    List<User> findByName(String name);

    Optional<User> findById(Long id);
}
