/**
 * 
 */
package algo;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * @author Dinesh
 *
 */
public class StringAlgoTest {
	String shared = ""; //if one test case changes the shared value, other test case must start from
	//same value 
	/**
	 * @throws java.lang.Exception
	 *  https://forms.office.com/r/iCsiwc3M2K
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("Runs before all the test cases : like n/w connection");
		System.out.println("db conneciton, dummy data insertion, login before test");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("Runs after all test cases, disconnect n/w, close db connection");
		System.out.println("remove dummy data, logout ... ");
	}
	@Before
	public void setUp() throws Exception {
		System.out.println("Before every test case , sets up some local shared data");
	}
	@After
	public void tearDown() throws Exception {
		System.out.println("After every test case , resets the local shared data");
	}

	@Test
	public void test() {
		StringAlgo algo = new StringAlgo();
		String input = "hello";
		String expected = "llohe";
		String actual = algo.shiftBy2Chars(input);
		assertEquals(expected,actual);
	}
	@Test(timeout = 2000)
	public void test2() {
		StringAlgo algo = new StringAlgo();
		String input = "ab";
		String expected = "ab";
		String actual = algo.shiftBy2Chars(input);
		assertEquals(expected,actual);
	}
	@Test
	public void test3() {
		StringAlgo algo = new StringAlgo();
		String input = "a";
		String expected = "a";
		try {
			String actual = algo.shiftBy2Chars(input);
		}
		catch(Exception e)
		{
			if(e instanceof IndexOutOfBoundsException)
				System.out.println("test case pass");
			else fail("Exception is not of type IndexOutOfBoundsException");
			return;
		}
		fail("No Exception thrown");
		
	}
	@Test(expected = IndexOutOfBoundsException.class)
	public void test4() {
		StringAlgo algo = new StringAlgo();
		String input = "a";
		String expected = "a";
		String actual = algo.shiftBy2Chars(input);
	}

}
