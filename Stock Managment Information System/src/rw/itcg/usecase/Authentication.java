package rw.itcg.usecase;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import rw.itcg.domain.User;
import rw.itcg.service.UserService;

/**
 * @author NIYOMWUNGERI Apr 4, 2017, 1:27:10 PM
 */

@ManagedBean
@Component
public class Authentication {

	@Autowired
	private UserService userService;

	private String username;
	private String password;

	public String authenticate() {
		User user = userService.findById(this.username);
		if (user.getUsername().equals(this.username) && user.getPassword().equals(this.password)) {
			return "home";
		} else {
			FacesContext.getCurrentInstance().addMessage(null,
					new FacesMessage(FacesMessage.SEVERITY_INFO, null, "Login"));
			return "index";
		}

	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
