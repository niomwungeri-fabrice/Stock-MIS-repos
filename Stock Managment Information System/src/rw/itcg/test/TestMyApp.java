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
			user.setFirstName("Mutangana");
			user.setLastName("Jean D'amour");
			user.setPassword("123456");
			user.setPhone("+250783741085");
			user.setState(true);
			user.setUsername("fab");
			String d = userService.createUser(user);
			System.out.println(d);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
