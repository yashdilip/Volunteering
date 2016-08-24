package cs544.mum.edu.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import cs544.mum.edu.domain.Project;
import cs544.mum.edu.domain.User;

/**
 * @author Dilip
 *
 */
@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
	@Query("from User u where u.name like CONCAT('%',:keyword,'%') ")
	List<User> findAllUserByKeyword(@Param("keyword") String keyword);
}
