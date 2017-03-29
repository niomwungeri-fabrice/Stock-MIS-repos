package rw.itcg.dao;

import java.util.List;

import rw.itcg.domain.User;
import rw.itcg.genericDao.GenericDao;

/**
 * @author NIYOMWUNGERI Mar 29, 2017, 4:08:21 PM
 */
public interface IUserDao extends GenericDao<User> {
	List<User> findByIdList(String username);
	boolean isUserRegister(String username);
}
