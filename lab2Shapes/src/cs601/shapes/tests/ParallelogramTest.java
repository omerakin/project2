package cs601.shapes.tests;

import org.junit.Assert;
import org.junit.Test;

import cs601.shapes.Parallelogram;

public class ParallelogramTest {

	private final static double EPS = 0.001;
	
	@Test
	public void testArea() {
		String testName = "testArea";
		double actual1,actual2;
		double expected1,expected2;
		
		Parallelogram parallelogram = new Parallelogram(1.0, 1.0, 30.0);
		Parallelogram parallelogram2 = new Parallelogram(5.5, 2.0, 90.0);
				
		actual1 = parallelogram.area();
		expected1 = 0.5;
		
		actual2 = parallelogram2.area();
		expected2 = 11;

		Assert.assertEquals(String.format("%n" + "Test Case: %s%n", testName), expected1, actual1, EPS);
		Assert.assertEquals(String.format("%n" + "Test Case: %s%n", testName), expected2, actual2, EPS);
	}

	@Test
	public void testPerimeter() {
		String testName = "testPerimeter";
		double actual1,actual2;
		double expected1,expected2;
		
		Parallelogram parallelogram = new Parallelogram(2.8, 1.125, 45.0);
		Parallelogram parallelogram2 = new Parallelogram(3.55, 1.83, 90.0);
				
		actual1 = parallelogram.perimeter();
		expected1 = 7.85;
		
		actual2 = parallelogram2.perimeter();
		expected2 = 10.76;

		Assert.assertEquals(String.format("%n" + "Test Case: %s%n", testName), expected1, actual1, EPS);
		Assert.assertEquals(String.format("%n" + "Test Case: %s%n", testName), expected2, actual2, EPS);
	}

}
