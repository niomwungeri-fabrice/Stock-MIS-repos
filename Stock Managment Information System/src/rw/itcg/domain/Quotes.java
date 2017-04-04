package rw.itcg.domain;

import javax.persistence.Column;
import javax.persistence.Entity;

/**
 * @author NIYOMWUNGERI Apr 4, 2017, 12:50:44 PM
 */
@Entity
public class Quotes extends GenericDomain {

	private static final long serialVersionUID = 1L;
	
	@Column(unique = true)
	private String quotesName;
	
}
