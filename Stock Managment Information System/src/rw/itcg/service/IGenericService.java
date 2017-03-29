package rw.itcg.service;

import java.io.Serializable;
import java.util.List;

/**
 * @author NIYOMWUNGERI Mar 29, 2017, 4:19:53 PM
 */
public interface IGenericService<G extends Serializable> {

	G save(final G g);

	G update(final G g);

	G delete(final G g);

	G findOne(final String id);

	List<G> findAll();

	Long countRows();
}
