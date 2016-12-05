import static org.junit.Assert.*; 

import org.junit.Test;


public class junitTest {

	@Test
	public void MultiplyTest() {
		SimpleJunit test = new SimpleJunit();

		int result = test.muliply(7, 7);

		assertEquals(49, result);

	}
}