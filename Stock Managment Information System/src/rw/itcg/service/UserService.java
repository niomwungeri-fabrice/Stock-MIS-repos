package rw.itcg.service;

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
			throw new ManageExceptions("User " + user.getFirstName() + " not created");
		}
	}
}
