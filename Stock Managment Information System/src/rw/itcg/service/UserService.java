package rw.itcg.service;

import org.springframework.beans.factory.annotation.Autowired;

import rw.itcg.dao.UserDaoImpl;
import rw.itcg.domain.User;
import rw.itcg.exceptionHandling.ManageExceptions;

/**
 * @author NIYOMWUNGERI Mar 29, 2017, 4:24:13 PM
 */
public class UserService {
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
