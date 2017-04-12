package rw.itcg.usecase;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import rw.itcg.domain.User;
import rw.itcg.service.UserService;

/**
 * @author NIYOMWUNGERI Apr 4, 2017, 10:37:53 AM
 */
@ManagedBean
@Component
public class CreateNewUser {
	
	private User user = new User();
	
	@Autowired
	private UserService userService;

	public void register() {
		String resp = "";
		resp = userService.createUser(user);
		FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, null, resp));
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
}
