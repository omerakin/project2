package cs601.shapes.tests;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import org.junit.Assert;
import org.junit.Test;
import cs601.shapes.AreaComparator;
import cs601.shapes.NameComparator;
import cs601.shapes.PerimeterComparator;
import cs601.shapes.ShapeSorter;
import cs601.shapes.VolumeComparator;

public class ShapeSorterTest {

	@Test
	public void testPrintToFile() {
		String testName = "testPrintToFile";
		ShapeSorter sorter = new ShapeSorter();
		String inputShapeFile = "shapesFile.txt";
		sorter.loadShapes(inputShapeFile);	
		String studentOutput = "studentOutputUnsorted";
		sorter.printToFile(studentOutput);
		
		Path expected = Paths.get("expectedOutputUnsorted"); 											// output				
		// compare files
		Path actual = Paths.get(studentOutput);
		int count = 0;
		try {
			count = TestUtils.checkFiles(expected, actual);
			System.out.println(count);
		} catch (IOException e) {
			Assert.fail(String.format("%n" + "Test Case: %s%n" + " File check failed: %s%n", testName, e.getMessage()));
		}

		if (count <= 0) {
			Assert.fail(String.format("%n" + "Test Case: %s%n" + " Mismatched Line: %d%n", testName, -count));
		}

	}
	

	/** This test will call the loadShapes method first, then will call sortShapes 
	 *  3 times to sort three lists of shapes by area. 
	 *  Then it will print all three lists to the file and compare with the expected output.
	 */
	@Test
	public void testSortByArea() {
		String testName = "testSortByArea";
		ShapeSorter sorter = new ShapeSorter();
		String inputShapeFile = "shapesFile.txt";

		sorter.loadShapes(inputShapeFile);
		sorter.sortShapes("all", new AreaComparator());
		sorter.sortShapes("2D", new AreaComparator());
		sorter.sortShapes("3D", new AreaComparator());
		String studentOutput = "studentOutputByArea";
		sorter.printToFile(studentOutput);

		Path actual = Paths.get(studentOutput); // your	result																																	
		Path expected = Paths.get("expectedOutputByArea"); 
		int count = 0;
		try {
			count = TestUtils.checkFiles(expected, actual);
			System.out.println(count);
		} catch (IOException e) {
			Assert.fail(String.format("%n" + "Test Case: %s%n" + " File check failed: %s%n", testName, e.getMessage()));
		}

		if (count <= 0) {
			Assert.fail(String.format("%n" + "Test Case: %s%n" + " Mismatched Line: %d%n", testName, -count));
		}

	}
	
	/** This test will call the loadShapes method first, then will call sortShapes 
	 *  3 times to sort three lists of shapes by name. 
	 *  Then it will print all three lists to the file and compare with the expected output.
	 */
	@Test
	public void testSortByName() {
		String testName = "testSortByName";
		ShapeSorter sorter = new ShapeSorter();
		String inputShapeFile = "shapesFile.txt";

		sorter.loadShapes(inputShapeFile);
		sorter.sortShapes("all", new NameComparator());
		sorter.sortShapes("2D", new NameComparator());
		sorter.sortShapes("3D", new NameComparator());
		String studentOutput = "studentOutputByName";
		sorter.printToFile(studentOutput);

		Path actual = Paths.get(studentOutput); // your	result																																					
		Path expected = Paths.get("expectedOutputByName"); 
		int count = 0;
		try {
			count = TestUtils.checkFiles(expected, actual);
			System.out.println(count);
		} catch (IOException e) {
			Assert.fail(String.format("%n" + "Test Case: %s%n" + " File check failed: %s%n", testName, e.getMessage()));
		}

		if (count <= 0) {
			Assert.fail(String.format("%n" + "Test Case: %s%n" + " Mismatched Line: %d%n", testName, -count));
		}

	}
	
	/** This test will call the loadShapes method first, then will call sortShapes 
	 *  to sort a list of 2d shapes by perimeter. 
	 *  Note that other two lists will NOT be sorted.
	 *  Then it will print all three lists to the file and compare with the expected output.
	 *  Note that in the file, only the list of 2D shapes will be sorted by perimeter.
	 */
	@Test
	public void testSortByPerimeter() {
		String testName = "testSortByPerimeter";
		ShapeSorter sorter = new ShapeSorter();
		String inputShapeFile = "shapesFile.txt";

		sorter.loadShapes(inputShapeFile);
		sorter.sortShapes("2D", new PerimeterComparator());
		String studentOutput = "studentOutputByPerimeter";
		sorter.printToFile(studentOutput);

		Path actual = Paths.get(studentOutput); // your	result																																		
		Path expected = Paths.get("expectedOutputByPerimeter"); // expected result 
		int count = 0;
		try {
			count = TestUtils.checkFiles(expected, actual);
			System.out.println(count);
		} catch (IOException e) {
			Assert.fail(String.format("%n" + "Test Case: %s%n" + " File check failed: %s%n", testName, e.getMessage()));
		}

		if (count <= 0) {
			Assert.fail(String.format("%n" + "Test Case: %s%n" + " Mismatched Line: %d%n", testName, -count));
		}

	} 
	
	/** This test will call the loadShapes method first, then will call sortShapes 
	 *  to sort a list of 3d shapes by volume.
	 *  Note that other two lists of shapes will NOT be sorted.
	 *  Then it will print all three lists to the file and compare with the expected output.
	 *  Note that in the file, only the list of 3D shapes will be sorted by volume.
	 */
	@Test
	public void testSortByVolume() {
		String testName = "testSortByVolume";
		ShapeSorter sorter = new ShapeSorter();
		String inputShapeFile = "shapesFile.txt";

		sorter.loadShapes(inputShapeFile);
		sorter.sortShapes("3D", new VolumeComparator());
		String studentOutput = "studentOutputByVolume";
		sorter.printToFile(studentOutput);

		Path actual = Paths.get(studentOutput); // your	result																																		
		Path expected = Paths.get("expectedOutputByVolume"); // expected result 
		int count = 0;
		try {
			count = TestUtils.checkFiles(expected, actual);
			System.out.println(count);
		} catch (IOException e) {
			Assert.fail(String.format("%n" + "Test Case: %s%n" + " File check failed: %s%n", testName, e.getMessage()));
		}

		if (count <= 0) {
			Assert.fail(String.format("%n" + "Test Case: %s%n" + " Mismatched Line: %d%n", testName, -count));
		}

	} 
	
}


