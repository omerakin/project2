package cs601.shapes.tests;

import org.junit.Test;

import cs601.shapes.Circle;

import org.junit.Assert;

public class CircleTest {
	
	private final static double EPS = 0.001;
	
	@Test
	public void testArea() {
		String testName = "testArea";
		double actual1,actual2;
		double expected1,expected2;
		
		Circle circle = new Circle(5.0);
		Circle circle2 = new Circle(3.265);
		
		actual1 = circle.area();
		expected1 = 78.539816339744830961566084581988;
		
		actual2 = circle2.area();
		expected2 = 33.490084545614253625490432560521;

		Assert.assertEquals(String.format("%n" + "Test Case: %s%n", testName), expected1, actual1, EPS);
		Assert.assertEquals(String.format("%n" + "Test Case: %s%n", testName), expected2, actual2, EPS);
	}

	@Test
	public void testPerimeter() {
		String testName = "testPerimeter";
		double actual1,actual2;
		double expected1,expected2;
		
		Circle circle = new Circle(1.25);
		Circle circle2 = new Circle(4.96555);
		
		actual1 = circle.perimeter();
		expected1 = 7.8539816339744830961566084581988;
		
		actual2 = circle2.perimeter();
		expected2 = 31.199470802065595630496357703687;
		
		Assert.assertEquals(String.format("%n" + "Test Case: %s%n", testName), expected1, actual1, EPS);
		Assert.assertEquals(String.format("%n" + "Test Case: %s%n", testName), expected2, actual2, EPS);		
	}

}
