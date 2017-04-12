package rw.itcg.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import rw.itcg.domain.User;
import rw.itcg.service.UserService;

/**
 * @author NIYOMWUNGERI Mar 28, 2017, 7:48:34 PM
 */
public class TestMyApp {

	/**
	 * @param args
	 */

	public static void main(String[] args) {
		try {
			@SuppressWarnings("resource")
			ApplicationContext context = new ClassPathXmlApplicationContext("classpath:rw/itcg/config/app-context.xml");
			UserService userService = context.getBean(UserService.class);

			User user = new User();
			user.setFirstName("Iradukunda");
			user.setUsername("niomwungeri.fabrice");
			user.setPhone("+250783741086");
			user.setLastName("jado");
			user.setState(true);
			user.setPassword("123458");
			System.out.println(userService.createUser(user));

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
