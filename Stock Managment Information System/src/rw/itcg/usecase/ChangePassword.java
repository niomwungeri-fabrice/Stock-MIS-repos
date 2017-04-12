package rw.itcg.usecase;

import javax.faces.bean.ManagedBean;

import org.springframework.stereotype.Component;

/**
 * @author NIYOMWUNGERI Apr 12, 2017, 9:35:25 AM
 */
@ManagedBean
@Component
public class ChangePassword {
	private String username;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getNewPassword() {
		return newPassword;
	}

	public void setNewPassword(String newPassword) {
		this.newPassword = newPassword;
	}

	private String newPassword;

	public void changeNewPassword() {

	}
}
