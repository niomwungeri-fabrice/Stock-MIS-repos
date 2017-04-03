package rw.itcg.genericDao;

import java.util.List;

public interface GenericDao<G> {

	G save(final G g);

	G update(final G g);

	G delete(final G g);

	G findOne(final String id);

	List<G> findAll();

	Long countRows();
	
}
