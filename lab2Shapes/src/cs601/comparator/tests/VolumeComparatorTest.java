package cs601.comparator.tests;

import java.util.ArrayList;
import java.util.Collections;
import org.junit.Assert;
import org.junit.Test;
import cs601.shapes.Parallelepiped;
import cs601.shapes.PlatonicSolid;
import cs601.shapes.Shape3D;
import cs601.shapes.Sphere;
import cs601.shapes.VolumeComparator;

public class VolumeComparatorTest {

	@Test
	public void test() {
		String testName = "test";		
		ArrayList<Shape3D> actual1 = new ArrayList<>();
		ArrayList<Shape3D> expected1 = new ArrayList<>();
		
		Sphere sphere = new Sphere(1.5);
		Parallelepiped parallelepiped = new Parallelepiped(1.0, 2.0, 4.0, 45.0, 450);
		PlatonicSolid platonicSolid = new PlatonicSolid(3, 5, 1.0);
		actual1.add(sphere);
		actual1.add(parallelepiped);
		actual1.add(platonicSolid);
		Collections.sort(actual1, new VolumeComparator());
		expected1.add(0, platonicSolid); // Volume = 2.18169
		expected1.add(1, parallelepiped); // Volume = 5.65685424949238
		expected1.add(2, sphere); // Volume = 14.137166941154067
		
		Assert.assertEquals(String.format("%n" + "Test Case: %s%n", testName), actual1, expected1);
	}

}
