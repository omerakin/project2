package cs601.shapes.tests;

import org.junit.Assert;
import org.junit.Test;

import cs601.shapes.PlatonicSolid;

public class PlatonicSolidTest {
		
	private final static double EPS = 0.001;

	@Test
	public void testArea() {
		String testName = "testArea";
		double actual1,actual2;
		double expected1,expected2;
		
		PlatonicSolid platonicSolid = new PlatonicSolid(3, 3, 1.0);
		PlatonicSolid platonicSolid2 = new PlatonicSolid(5, 3, 1.0);
				
		actual1 = platonicSolid.area();
		expected1 = 1.7320508075688772;
		
		actual2 = platonicSolid2.area();
		expected2 = 20.645728807067602;

		Assert.assertEquals(String.format("%n" + "Test Case: %s%n", testName), expected1, actual1, EPS);
		Assert.assertEquals(String.format("%n" + "Test Case: %s%n", testName), expected2, actual2, EPS);
	}

	@Test
	public void testVolume() {
		String testName = "testVolume";
		double actual1,actual2;
		double expected1,expected2;
		
		PlatonicSolid platonicSolid = new PlatonicSolid(3, 5, 1.0);
		PlatonicSolid platonicSolid2 = new PlatonicSolid(3, 4, 1.0);
				
		actual1 = platonicSolid.volume();
		expected1 = 2.18169;
		
		actual2 = platonicSolid2.volume();
		expected2 = 0.471405;

		Assert.assertEquals(String.format("%n" + "Test Case: %s%n", testName), expected1, actual1, EPS);
		Assert.assertEquals(String.format("%n" + "Test Case: %s%n", testName), expected2, actual2, EPS);
	}

}
