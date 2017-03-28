package rw.itcg.genericDao;

import java.io.Serializable;

public interface GenericDao<G extends Serializable> {

	public abstract G save(final G g);

	public abstract G update(final G g);

	public abstract G delete(final G g);
	
	public abstract G findOne(final String id);

	public abstract Long countRows();

}
