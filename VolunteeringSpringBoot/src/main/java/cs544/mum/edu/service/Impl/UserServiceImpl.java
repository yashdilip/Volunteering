/**
 * 
 */
package cs544.mum.edu.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cs544.mum.edu.domain.User;
import cs544.mum.edu.repository.UserRepository;
import cs544.mum.edu.service.IUserService;

/**
 * @author Dilip
 *
 */
@Service
public class UserServiceImpl implements IUserService{

	@Autowired
	UserRepository userRepository;
	/* (non-Javadoc)
	 * @see cs544.mum.edu.service.IUserService#create(cs544.mum.edu.domain.User)
	 */
	@Override
	public void create(User user) {
		// TODO Auto-generated method stub
		userRepository.save(user);
	}

	/* (non-Javadoc)
	 * @see cs544.mum.edu.service.IUserService#authenticateUser(cs544.mum.edu.domain.User)
	 */
	@Override
	public boolean authenticateUser(User user) {
		// TODO Auto-generated method stub
		return true;
	}

	/* (non-Javadoc)
	 * @see cs544.mum.edu.service.IUserService#getAllUsers()
	 */
	@Override
	public List<User> getAllUsers() {
		// TODO Auto-generated method stub
		return userRepository.findAll();
	}

}
