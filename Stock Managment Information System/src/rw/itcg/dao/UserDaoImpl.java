package rw.itcg.dao;

import java.util.List;

import org.hibernate.Query;
import org.springframework.stereotype.Repository;

import rw.itcg.domain.User;
import rw.itcg.genericDao.GenericDaoImpl;

/**
 * @author NIYOMWUNGERI Mar 28, 2017, 8:42:17 PM
 */
@Repository
public class UserDaoImpl extends GenericDaoImpl<User> implements IUserDao {

	@SuppressWarnings("unchecked")
	@Override
	public List<User> findByIdList(String username) {
		Query query = sessionfactory().createQuery("FROM User u where u.username:=username");
		return query.list();
	}

	@Override
	public boolean isUserRegister(String username) {
		Query query = sessionfactory().createQuery("select 'A' from User u where username=:username");
		query.setParameter("username", username);
		return query.list().size() > 0;
	}

}
