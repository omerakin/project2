package cs601.shapes.tests;

import org.junit.Assert;
import org.junit.Test;

import cs601.shapes.Parallelepiped;

public class ParallelepipedTest {
	
	private final static double EPS = 0.001;
	
	@Test
	public void testArea() {
		String testName = "testArea";
		double actual1,actual2;
		double expected1,expected2;
		
		Parallelepiped parallelepiped = new Parallelepiped(1.0, 1.0, 1.0, 30.0, 45.0);
		Parallelepiped parallelepiped2 = new Parallelepiped(5.0, 6.0, 5.0, 90.0, 45.0);
		
		actual1 = parallelepiped.area();
		expected1 = 3.82842712474619;
		
		actual2 = parallelepiped2.area();
		expected2 = 137.78174593052023;

		Assert.assertEquals(String.format("%n" + "Test Case: %s%n", testName), expected1, actual1, EPS);
		Assert.assertEquals(String.format("%n" + "Test Case: %s%n", testName), expected2, actual2, EPS);
	}

	@Test
	public void testVolume() {
		String testName = "testVolume";
		double actual1,actual2;
		double expected1,expected2;
		
		Parallelepiped parallelepiped = new Parallelepiped(1.0, 2.0, 4.0, 45.0, 450);
		Parallelepiped parallelepiped2 = new Parallelepiped(1.0, 2.0, 1.0, 45.0, 45.0);
		
		actual1 = parallelepiped.volume();
		expected1 = 5.65685424949238;
		
		actual2 = parallelepiped2.volume();
		expected2 = 0.9101797211244541;

		Assert.assertEquals(String.format("%n" + "Test Case: %s%n", testName), expected1, actual1, EPS);
		Assert.assertEquals(String.format("%n" + "Test Case: %s%n", testName), expected2, actual2, EPS);
	}

}
