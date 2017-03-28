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
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("classpath:rw/itcg/config/app-context.xml");
		UserService uService = context.getBean(UserService.class);
		User u = new User();
		u.setFirstName("Mutangana");
		u.setLastName("Jean D'amour");
		u.setPassword("12345");
		u.setPhone("+2578521255");
		u.setState(true);
		u.setUsername("mtee");
		u.setState(true);
		System.out.println(uService.createUser(u));
	}

}
