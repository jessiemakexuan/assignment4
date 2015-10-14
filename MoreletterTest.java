package moreletter;

import static org.junit.Assert.*;

import org.junit.Test;

public class MoreletterTest {

	@Test
	public void test() {
		Moreletter mtest=new Moreletter();
		String before="Java is a cool OOP. It doesnt have multiple inheritance";
		String actual=mtest.countLetter(before);
		String expected="Java\ncool\ndoesnt\nhave\nmultiple\ninheritance";
        assertEquals(expected, actual);
	}

}
