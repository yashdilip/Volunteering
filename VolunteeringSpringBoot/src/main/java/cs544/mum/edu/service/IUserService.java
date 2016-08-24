/**
 * 
 */
package cs544.mum.edu.service;

import java.util.List;

import org.springframework.stereotype.Service;

import cs544.mum.edu.domain.Address;
import cs544.mum.edu.domain.User;

/**
 * @author Dilip
 *
 */
@Service
public interface IUserService {
	void create(User user);
	boolean authenticateUser(User user);
	List<User> getAllUsers();
	User findUserByUserId(int userId);
}
