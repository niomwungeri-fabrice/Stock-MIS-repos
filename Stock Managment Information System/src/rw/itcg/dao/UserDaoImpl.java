package rw.itcg.dao;

import org.springframework.stereotype.Repository;

import rw.itcg.domain.User;
import rw.itcg.genericDao.GenericDaoImpl;

/**
 * @author NIYOMWUNGERI Mar 28, 2017, 8:42:17 PM
 */
@Repository
public class UserDaoImpl extends GenericDaoImpl<User> implements UserDao {

	@Override
	public User save(User g) {
		sessionfactory().save(g);
		sessionfactory().flush();
		return g;
	}

	@Override
	public User update(User g) {
		sessionfactory().update(g);
		sessionfactory().flush();
		return g;
	}

	@Override
	public User delete(User g) {
		sessionfactory().delete(g);
		sessionfactory().flush();
		return g;
	}

	@Override
	public User findOne(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Long countRows() {
		// TODO Auto-generated method stub
		return null;
	}

}
