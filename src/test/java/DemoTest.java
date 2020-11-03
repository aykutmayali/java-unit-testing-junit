/**
 * The class containing your tests for the {@link Demo} class.  Make sure you
 * test all methods in this class (including both 
 * {@link Demo#main(String[])} and 
 * {@link Demo#isTriangle(double, double, double)}).
 */


import static org.junit.Assert.*;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.Test;

public class DemoTest {
	@Test
	public void test_is_triangle_1() {
		assertTrue(Demo.isTriangle(3, 4, 5));
	}
	
	@Test
	public void test_is_triangle_2() {
		assertTrue(Demo.isTriangle(5, 12, 13));
	}
	
	@Test
	public void test_is_triangle_3() {
		assertTrue(Demo.isTriangle(12, 13, 5));
	}
	
	@Test
	public void test_is_triangle_4() {
		assertTrue(Demo.isTriangle(12, 5, 13));
	}
	
	@Test
	public void test_is_Not_triangle_1() {
		assertFalse(Demo.isTriangle(7, 5, 13));
	}
	
	@Test
	public void test_is_Not_triangle_2() {
		assertFalse(Demo.isTriangle(13, 5, 7));
	}
	
	@Test
	public void test_is_Not_triangle_3() {
		assertFalse(Demo.isTriangle(7, 13, 5));
	}
	
	@Test
	public void test_is_Not_triangle_4() {
		assertFalse(Demo.isTriangle(7, 1, 5));
	}
	
	@Test
	public void test_is_Not_triangle_5() {
		assertFalse(Demo.isTriangle(7, 5, 0));
	}
	
	@Test
	public void test_is_Not_triangle_6() {
		assertFalse(Demo.isTriangle(1, 5, -1));
	}
	
		
	@Test
	public void test_main_program_1() {
		String input = "5\n12\n13";
		
		ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
		System.setIn(in);
		
		ByteArrayOutputStream out = new ByteArrayOutputStream();
		System.setOut(new PrintStream(out));
		
		String[] args = {};
		Demo.main(args);
		
		
		 String consoleOutput = "Enter side 1: "+ System.lineSeparator();
		 consoleOutput += "Enter side 2: "+ System.lineSeparator();
		 consoleOutput += "Enter side 3: "+ System.lineSeparator();
		 consoleOutput += "This is a triangle."+ System.lineSeparator();
						
		assertEquals(consoleOutput, out.toString());	
		
    
	}
}
