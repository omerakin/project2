package cs601.shapes.tests;

import org.junit.Assert;
import org.junit.Test;

import cs601.shapes.Sphere;

public class SphereTest {

	private final static double EPS = 0.001;
	
	@Test
	public void testArea() {
		String testName = "testArea";
		double actual1,actual2;
		double expected1,expected2;
		
		Sphere sphere = new Sphere(5.0);
		Sphere sphere2 = new Sphere(1.7568);
		
		actual1 = sphere.area();
		expected1 = 314.16;
		
		actual2 = sphere2.area();
		expected2 = 38.784;

		Assert.assertEquals(String.format("%n" + "Test Case: %s%n", testName), expected1, actual1, EPS);
		Assert.assertEquals(String.format("%n" + "Test Case: %s%n", testName), expected2, actual2, EPS);
	}

	@Test
	public void testVolume() {
		String testName = "testVolume";
		double actual1,actual2;
		double expected1,expected2;
		
		Sphere sphere = new Sphere(8.25);
		Sphere sphere2 = new Sphere(25.0);
		
		actual1 = sphere.volume();
		expected1 = 2352.07115;
		
		actual2 = sphere2.volume();
		expected2 = 65449.8469;

		Assert.assertEquals(String.format("%n" + "Test Case: %s%n", testName), expected1, actual1, EPS);
		Assert.assertEquals(String.format("%n" + "Test Case: %s%n", testName), expected2, actual2, EPS);
	}

}
