package q01;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import Q1.Triangle;

public class TriangleTest {

	private Triangle triangle;

	@Before
	public void setUp() throws Exception {
		triangle = new Triangle(1,1,1);
	}
	
		
	@Test
	public void triangleTest() {
		assertFalse(new Triangle(0,0,0).Triangle());
		assertTrue(new Triangle(12,9,6).Triangle());
	}
	
	@Test
	public void equilateralTest() {
		assertTrue(new Triangle(2,2,2).Equilateral());
		assertFalse(new Triangle(1,3,1).Equilateral());
	}
	
	@Test
	public void scaleneTest() {
		assertFalse(new Triangle(2,2,2).Scalene());
		assertTrue(new Triangle(12,9,6).Scalene());
	}
	
	@Test
	public void isoscelesTest() {
		assertTrue(new Triangle(10,10,12).Isoceles());
		assertFalse(new Triangle(10,10,-4).Isoceles());
		assertFalse(new Triangle(10,10,0).Isoceles());
	}
}
