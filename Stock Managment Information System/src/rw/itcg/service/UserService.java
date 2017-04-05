package rw.itcg.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import rw.itcg.domain.User;
import rw.itcg.exceptionHandling.ManageExceptions;
import rw.itcg.genericDao.GenericDaoImpl;

/**
 * @author NIYOMWUNGERI Mar 29, 2017, 4:24:13 PM
 */
@Service
public class UserService extends TransactionAware {

	@Autowired
	private GenericDaoImpl<User> userDao;

	public String createUser(User user) {
		try {
			userDao.save(user);
			return "User " + user.getFirstName() + " created successfully";
		} catch (Exception e) {
			e.printStackTrace();
			throw new ManageExceptions("User " + user.getUsername() + " Already exist");
		}
	}

	public List<User> findAll() {
		try {
			return userDao.findAll();
		} catch (Exception e) {
			throw new ManageExceptions("No user found!");
		}
	}

	public User findById(String username) {
		try {
			return userDao.findOne(username);
		} catch (Exception e) {
			throw new ManageExceptions("No user found!");
		}
	}
}
