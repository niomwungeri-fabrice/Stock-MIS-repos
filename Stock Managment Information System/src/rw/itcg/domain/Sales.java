package rw.itcg.domain;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 * @author NIYOMWUNGERI Apr 4, 2017, 11:38:46 AM
 */
@Entity
public class Sales extends GenericDomain {

	private static final long serialVersionUID = 1L;
	
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int salesId;

	@ManyToOne
	@JoinColumn(name = "userId")
	private User user;
	
	private Date date = new Date();

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

}
