package rw.itcg.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import rw.itcg.dao.UserDaoImpl;
import rw.itcg.domain.User;
import rw.itcg.exceptionHandling.ManageExceptions;
import rw.itcg.genericDao.GenericDao;

/**
 * @author NIYOMWUNGERI Mar 28, 2017, 8:50:49 PM
 */
@Service
public class GenericServiceImpl extends TransactionAware implements GenericDao<G> {
	

	@Override
	public G save(G g) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public G update(G g) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public G delete(G g) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public G findOne(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<G> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Long countRows() {
		// TODO Auto-generated method stub
		return null;
	}

	

}
