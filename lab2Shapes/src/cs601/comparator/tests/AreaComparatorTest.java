package cs601.comparator.tests;

import java.util.ArrayList;
import java.util.Collections;
import org.junit.Assert;
import org.junit.Test;

import cs601.shapes.AreaComparator;
import cs601.shapes.Circle;
import cs601.shapes.ConvexRegularPolygon;
import cs601.shapes.Parallelogram;
import cs601.shapes.Shape;
import cs601.shapes.Sphere;

public class AreaComparatorTest {

	@Test
	public void test() {
		String testName = "test";		
		ArrayList<Shape> actual1 = new ArrayList<>();
		ArrayList<Shape> expected1 = new ArrayList<>();
		
		Circle circle = new Circle(5.0);
		Parallelogram parallelogram = new Parallelogram(1.0, 1.0, 30.0);
		ConvexRegularPolygon convexRegularPolygon = new ConvexRegularPolygon(5,1.0);
		Sphere sphere = new Sphere(1.5);
		
		actual1.add(circle);
		actual1.add(parallelogram);
		actual1.add(convexRegularPolygon);
		actual1.add(sphere);
		Collections.sort(actual1, new AreaComparator());
		expected1.add(0, parallelogram); // Area = 0.5
		expected1.add(1, convexRegularPolygon); // Area = 1.720477400588967
		expected1.add(2, sphere); // Area = 28.274333882308138
		expected1.add(3, circle); // Area = 78.539816339744830961566084581988
		
		Assert.assertEquals(String.format("%n" + "Test Case: %s%n", testName), actual1, expected1);		
	}

}
