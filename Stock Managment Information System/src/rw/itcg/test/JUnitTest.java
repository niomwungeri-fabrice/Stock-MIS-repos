package rw.itcg.test;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import rw.itcg.domain.User;
import rw.itcg.service.UserService;

/**
 * @author NIYOMWUNGERI Mar 28, 2017, 9:15:45 PM
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:rw/itcg/config/app-context.xml")
public class JUnitTest {

	private UserService userService;

	@Test
	public void test() {
		List<User> l = userService.findAll();
		assertNull(l);
	}
	
}
