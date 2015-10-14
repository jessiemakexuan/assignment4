package reverse;


import static org.junit.Assert.*;

import org.junit.Test;


public class Reversetest {

	@Test
	public void test() {
		Reverse test=new Reverse();
		String before="I love the object oriented program course in NEU";
		String actual=test.makeReverse(before);
		String expected="NEU in course program oriented object the love I";
        assertEquals(expected, actual);
	}

}
