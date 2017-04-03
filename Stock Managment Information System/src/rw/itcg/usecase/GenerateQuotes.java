package rw.itcg.usecase;

import java.util.Random;

import javax.faces.bean.ManagedBean;

/**
 * @author NIYOMWUNGERI Apr 3, 2017, 9:40:57 PM
 */
@ManagedBean
public class GenerateQuotes {

	public String generateRandomQuotes() {
		String[] array = {
				"“Success is no accident. It is hard work, perseverance, learning, studying, sacrifice and most of all, love of what you are doing or learning to do”.” - Pele",
				"“Success means doing the best we can with what we have. Success is the doing, not the getting; in the trying, not the triumph. Success is a personal standard, reaching for the highest that is in us, becoming all that we can be.”<br /> – Zig Ziglar" };
		Random rand = new Random();
		int lenngth = rand.nextInt(array.length);
		return array[lenngth];
	}
}
