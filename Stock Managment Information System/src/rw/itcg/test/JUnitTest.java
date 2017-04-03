package rw.itcg.test;

import rw.itcg.usecase.GenerateQuotes;

/**
 * @author NIYOMWUNGERI Mar 28, 2017, 9:15:45 PM
 */
public class JUnitTest {

	public static void main(String args[]) {

		GenerateQuotes a = new GenerateQuotes();
		System.out.println(a.generateRandomQuotes());
	}
}
