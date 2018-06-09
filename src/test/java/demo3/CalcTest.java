package demo3;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalcTest {
    private Calc c1;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		c1 = new Calc();
	}

	@After
	public void tearDown() throws Exception {
		c1=null;
	}

	@Test
	public void testAdd() {
		
		int i = c1.add(10,20); 
		assertTrue("add with 10,20",i==30);
	}
	
	@Test
	public void testDivide() {
		
		int i = c1.divide("20","10"); 
		assertTrue("add with 20,10",i==2);
	}
	
	@Test
	public void testDividebyzero() {
		try{
		int i = c1.divide("200","0"); 
		} catch (ArithmeticException e) {
		assertTrue("Divide by zero",true);
	}
	}
		
		@Test
		public void testDividebyNonNumeric() {
			try{
			int i = c1.divide("A0Q","0"); 
			} catch (NumberFormatException e) {
			assertTrue("NumberFormatException ",true);
		}
		}

}
