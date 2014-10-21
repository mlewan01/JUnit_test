
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * 
 */

/**
 * @author me
 *
 */
public class AdderTest {
	
	private static int firstInput;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		firstInput = 7;
		ile = 1;
	}
	@Test(timeout = 10)
	public void testWithSetUpBeforeClass() {
		int input1 = firstInput;
		int input2 = 5;
		int expectedOutput = 12;
		Adder addObj = new Adder();
		int actualOutput = addObj.add(input1,input2);
		assertEquals("Wrong answer!", expectedOutput, actualOutput);
	}
	
	private int expected;
	private static int ile;
	@Before
	public void setUp() throws Exception {
		System.out.println(ile +" executing "+ expected);
		expected = 8;
		ile++;
	}
	@Test
	public void testWithSetUp(){
		int i1 = 3;
		int i2 = 5;
		int eO = expected;
		
		Adder addObj = new Adder();
		int aO = addObj.add(i1,i2);
		
		assertEquals("Wrong answer", eO, aO);
	}

	@Test
	public void test() {
		int input1 = 3;
		int input2 = 5;
		int expectedOutput = 8;
		Adder addObj = new Adder();
		int actualOutput = addObj.add(input1,input2);
		assertEquals("Wrong answer!", expectedOutput, actualOutput);
	}
	
	@Test
	public void test2() {
		int input1 = 7;
		int input2 = 3;
		int expectedOutput = 10;
		Adder addObj = new Adder();
		int actualOutput = addObj.add(input1,input2);
		assertEquals("Wrong answer!", expectedOutput, actualOutput);
	}
	@Test
	public void test3(){
		int i1 = 10;
		int i2 = 10;
		int eO = 1;
		Adder addObj = new Adder();
		int aO = (addObj.substruct(i1, i2)>=0)? 1: -1;
		assertEquals(" zla odpowiedz!", eO, aO);
	}

}