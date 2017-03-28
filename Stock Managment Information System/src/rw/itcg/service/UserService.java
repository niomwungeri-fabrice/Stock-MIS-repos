package rw.itcg.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import rw.itcg.dao.UserDaoImpl;
import rw.itcg.domain.User;
import rw.itcg.exceptionHandling.ManageExceptions;

/**
 * @author NIYOMWUNGERI Mar 28, 2017, 8:50:49 PM
 */
@Service
public class UserService extends TransactionAware {
	@Autowired
	private UserDaoImpl userDao;

	public String createUser(User user) {
		try {
			userDao.save(user);
			return "User " + user.getFirstName() + " " + user.getLastName() + " " + "Created";
		} catch (Exception e) {
			throw new ManageExceptions(e.getMessage());
		}
	}

}
