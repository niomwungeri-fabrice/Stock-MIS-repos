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
			User user = userService.findById("niomwungeri.fabrice");
			System.out.println(user.getPassword());
			System.out.println(userService.checkUserExistence("niomwungeri.fabrice"));

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
