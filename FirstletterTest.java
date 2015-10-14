package firstletter;

import static org.junit.Assert.*;

import org.junit.Test;

public class FirstletterTest {

	@Test
	public void test() {
		Firstletter ftest=new Firstletter();
		String before="we love seattle and will live here for a long time.";
		String actual=ftest.largerletter(before);
		String expected="We Love Seattle And Will Live Here For A Long Time.";
        assertEquals(expected, actual);
	}

}
