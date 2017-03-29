package rw.itcg.genericDao;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Projections;
import org.springframework.beans.factory.annotation.Autowired;


public abstract class GenericDaoImpl<G extends Serializable> implements GenericDao<G> {

	@Autowired
	private SessionFactory sessionFactory;

	protected Session sessionfactory() {
		return sessionFactory.getCurrentSession();
	}

	private Class<G> type;

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public GenericDaoImpl() {
		Type g = getClass().getGenericSuperclass();
		ParameterizedType pt = (ParameterizedType) g;
		type = (Class) pt.getActualTypeArguments()[0];
	}

	@Override
	public G save(G g) {
		sessionfactory().saveOrUpdate(g);
		sessionfactory().flush();
		return g;
	}

	@Override
	public G delete(G g) {
		sessionfactory().delete(g);
		sessionfactory().flush();
		return g;
	}

	@Override
	public G findOne(String id) {
		return (G) sessionfactory().get(this.type, id);
	}

	@Override
	public Long countRows() {
		return (Long) sessionfactory().createCriteria(this.type).setProjection(Projections.rowCount()).uniqueResult();
	}

	@Override
	public G update(G g) {
		sessionfactory().update(g);
		sessionfactory().flush();
		return g;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<G> findAll() {
		return sessionfactory().createCriteria(this.type).list();
	}

}
