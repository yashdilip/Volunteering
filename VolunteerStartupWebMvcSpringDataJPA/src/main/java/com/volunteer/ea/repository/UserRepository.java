package com.volunteer.ea.repository;

import com.volunteer.ea.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Dilip
 *
 */
@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
