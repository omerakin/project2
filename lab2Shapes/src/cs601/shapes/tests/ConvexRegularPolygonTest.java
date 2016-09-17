package cs601.shapes.tests;

import org.junit.Assert;
import org.junit.Test;
import cs601.shapes.ConvexRegularPolygon;

public class ConvexRegularPolygonTest {

	private final static double EPS = 0.001;
	
	@Test
	public void testArea() {
		String testName = "testArea";
		double actual1,actual2;
		double expected1,expected2;
		
		ConvexRegularPolygon convexRegularPolygon = new ConvexRegularPolygon(5, 2.5);
		ConvexRegularPolygon convexRegularPolygon2 = new ConvexRegularPolygon(7, 1.750);
		
		actual1 = convexRegularPolygon.area();
		expected1 = 10.753;
		
		actual2 = convexRegularPolygon2.area();
		expected2 = 11.1289;

		Assert.assertEquals(String.format("%n" + "Test Case: %s%n", testName), expected1, actual1, EPS);
		Assert.assertEquals(String.format("%n" + "Test Case: %s%n", testName), expected2, actual2, EPS);
	}

	@Test
	public void testPerimeter() {
		String testName = "testPerimeter";
		double actual1,actual2;
		double expected1,expected2;
		
		ConvexRegularPolygon convexRegularPolygon = new ConvexRegularPolygon(3, 2.5);
		ConvexRegularPolygon convexRegularPolygon2 = new ConvexRegularPolygon(7, 1.750);
		
		actual1 = convexRegularPolygon.perimeter();
		expected1 = 7.5;
		
		actual2 = convexRegularPolygon2.perimeter();
		expected2 = 12.25;

		Assert.assertEquals(String.format("%n" + "Test Case: %s%n", testName), expected1, actual1, EPS);
		Assert.assertEquals(String.format("%n" + "Test Case: %s%n", testName), expected2, actual2, EPS);
	}

}
