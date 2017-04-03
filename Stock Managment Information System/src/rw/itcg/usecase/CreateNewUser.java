package rw.itcg.usecase;

import java.util.List;

import javax.faces.bean.ManagedBean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import rw.itcg.domain.User;
import rw.itcg.service.UserService;

/**
 * @author NIYOMWUNGERI Mar 28, 2017, 9:13:40 PM
 */
@Component
@ManagedBean
public class CreateNewUser {
	@Autowired
	private UserService userService;
	private List<User> getAllusers;

	//return all users
	public CreateNewUser() {
		getAllusers = userService.findAll();
	}

	public List<User> getGetAllusers() {
		return getAllusers;
	}

	public void setGetAllusers(List<User> getAllusers) {
		this.getAllusers = getAllusers;
	}

}
