package rw.itcg.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import rw.itcg.service.UserService;

/**
 * @author NIYOMWUNGERI Mar 28, 2017, 9:15:45 PM
 */
@RunWith(SpringJUnit4ClassRunner.class)
@Configuration("classpath:rw/itcg/config/app-context.xml")
public class JUnitTest {
	
	private UserService userService;
	@Test
	public void test(){
		
	}
}
