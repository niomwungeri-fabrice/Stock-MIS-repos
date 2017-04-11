package rw.itcg.dao;

import java.util.List;

import org.hibernate.Query;
import org.springframework.stereotype.Repository;

import rw.itcg.domain.User;
import rw.itcg.genericDao.GenericDaoImpl;

/**
 * @author NIYOMWUNGERI Mar 29, 2017, 4:08:21 PM
 */
@Repository
public class UserDao extends GenericDaoImpl<User> {

	public boolean checkUserExistence(String username) {
		return isUserRegister(username);
	}

	@SuppressWarnings("unchecked")
	public List<User> findByIdList(String username) {
		Query query = sessionfactory().createQuery("select u from User u where u.username = :username");
		query.setParameter("username", username);
		return query.list();
	}

	public User findById(String username) {
		Query query = sessionfactory().createQuery("select u from User u where u.username = :username");
		query.setParameter("username", username);
		return (User) query.uniqueResult();
	}

	public boolean isUserRegister(String username) {
		Query query = sessionfactory().createQuery("select 'A' from User u where username = :username");
		query.setParameter("username", username);
		return query.list().size() > 0;
	}
}
