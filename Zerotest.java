package groupszero;

// please do not use wildcard import
import static org.junit.Assert.*;

import org.junit.Test;

public class Zerotest {

	@Test
	// please add more UTs, especially for edge cases.
	public void test() {
		Zero zerotest=new Zero();
		int array[]={1, 0, 0 , 1, 0, 1, 1, 0, 0, 0, 0, 0, 0, 1, 0, 0 };
		String test=zerotest.findzero(array);
		String expect="00 occurs @ index 1\n000000 occurs @ index 7\n00 occurs @ index 14\n";
		assertEquals(expect, test);
	}

}
