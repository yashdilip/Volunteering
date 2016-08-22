package cs544.mum.edu.repository;

import cs544.mum.edu.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Dilip
 *
 */
@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
