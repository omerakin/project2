package cs601.comparator.tests;

import java.util.ArrayList;
import java.util.Collections;
import org.junit.Assert;
import org.junit.Test;
import cs601.shapes.Circle;
import cs601.shapes.ConvexRegularPolygon;
import cs601.shapes.Parallelogram;
import cs601.shapes.PerimeterComparator;
import cs601.shapes.Shape2D;

public class PerimeterComparatorTest {

	@Test
	public void test() {
		String testName = "test";		
		ArrayList<Shape2D> actual1 = new ArrayList<>();
		ArrayList<Shape2D> expected1 = new ArrayList<>();
		
		Circle circle = new Circle(5.0);
		Parallelogram parallelogram = new Parallelogram(1.0, 1.0, 30.0);
		ConvexRegularPolygon convexRegularPolygon = new ConvexRegularPolygon(5,1.0);
		
		actual1.add(circle);
		actual1.add(parallelogram);
		actual1.add(convexRegularPolygon);
		Collections.sort(actual1, new PerimeterComparator());
		expected1.add(0, parallelogram); // Perimeter = 4.0
		expected1.add(1, convexRegularPolygon); // 5.0
		expected1.add(2, circle); // Perimeter = 31.41592653589793
		
		Assert.assertEquals(String.format("%n" + "Test Case: %s%n", testName), actual1, expected1);
	}

}
