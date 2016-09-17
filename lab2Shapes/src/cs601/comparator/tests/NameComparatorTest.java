package cs601.comparator.tests;

import java.util.ArrayList;
import java.util.Collections;
import org.junit.Assert;
import org.junit.Test;

import cs601.shapes.Circle;
import cs601.shapes.ConvexRegularPolygon;
import cs601.shapes.NameComparator;
import cs601.shapes.Parallelepiped;
import cs601.shapes.Parallelogram;
import cs601.shapes.PlatonicSolid;
import cs601.shapes.Shape;
import cs601.shapes.Sphere;

public class NameComparatorTest {

	@Test
	public void test() {
		String testName = "test";		
		ArrayList<Shape> actual1 = new ArrayList<>();
		ArrayList<Shape> actual2 = new ArrayList<>();
		ArrayList<Shape> expected1 = new ArrayList<>();
		ArrayList<Shape> expected2 = new ArrayList<>();
		
		Circle circle = new Circle(5.0);
		Parallelogram parallelogram = new Parallelogram(1.0, 1.0, 30.0);
		ConvexRegularPolygon convexRegularPolygon = new ConvexRegularPolygon(5,1.0);
		Sphere sphere = new Sphere(1.5);
		Parallelepiped parallelepiped = new Parallelepiped(1.0,1.0,1.0,30.0,45.0);
		PlatonicSolid platonicSolid = new PlatonicSolid(4, 3, 1.0);
		
		actual1.add(circle);
		actual1.add(parallelogram);
		actual1.add(convexRegularPolygon);
		actual1.add(sphere);
		actual1.add(parallelepiped);
		actual1.add(platonicSolid);
		Collections.sort(actual1, new NameComparator());
		expected1.add(0, circle);
		expected1.add(1, convexRegularPolygon);
		expected1.add(2, parallelepiped);
		expected1.add(3, parallelogram);
		expected1.add(4, platonicSolid);
		expected1.add(5, sphere);
		
		actual2.add(sphere);
		actual2.add(convexRegularPolygon);
		Collections.sort(actual2, new NameComparator());
		expected2.add(0, convexRegularPolygon);
		expected2.add(1, sphere);
		
		Assert.assertEquals(String.format("%n" + "Test Case: %s%n", testName), actual1, expected1);
		Assert.assertEquals(String.format("%n" + "Test Case: %s%n", testName), actual2, expected2);
	}

}
