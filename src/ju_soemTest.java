

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class ju_soemTest {
	
	private static int some;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		some = 0;
		System.out.println("Before Class, some:  "+ some);
	}

	@Before
	public void setUp() throws Exception {
		some++;
		System.out.println("Before, some:  " + some);
	}

	@After
	public void tearDown() throws Exception {
		some--;
		System.out.println("After, some:  " + some);
	}

	@Test
	public void test() {
		System.out.println(" test, some:  "+ some);
		if(some!=0) some = 0; // ______________!!!
		assertEquals("co to ? ", 0, some);
		assertFalse("is false? ", true);
	}

}
