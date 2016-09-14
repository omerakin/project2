package cs601.shapes;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/** A class that stores a collection of shapes, and is able to sort 
 * shapes based on different criteria. Stores shapes in three lists:
 * allShapes, shapes2D, shapes3D. 
 * For general shapes: sorting is by area or by name.
 * For 2d shapes, sorting is by area, by name or by perimeter.
 * For 3d shapes, sorting is by area, by name or by volume.
 * @author okarpenko
 *
 */
public class ShapeSorter {
	
	// FILL IN CODE:
	// Store in three data structures: 1) all shapes; 2) all 2D shapes;  3) all 3D shapes
	
	/** A default constructor for class ShapeSorter */
	public ShapeSorter() {
		// FILL IN CODE
		// Initialize the data structures
	}

	/** Read a given file, create different shapes, and add them to the data structures
	 *  @param filename
	 *  	      The name of the file that contains info about the shapes.
	 */
	public void loadShapes(String filename) {
		// FILL IN CODE
	}

	
	/** Sort a list of Shape-s 
	 * @param whichShapes
	 * 		 A string, either "all", "2D" or "3D" - specifies which list of shapes to sort
	 * @param comparator
	 * 		 A Comparator object that tells the method how to sort shapes.
	 */
	private void sortShapes(String whichShapes, Comparator<Shape> comparator) {
		// FILL IN CODE
		
		
	}

	
	/** Print the list of shapes to a file as following:
	 * First, all 2d shapes (one line per shape),  followed by an empty line. 
	 * Then all 3d shapes,  followed  by an empty line.. 
	 * Then all shapes from the list. Each shape should be printed according to the format
	 * specified in the toString() method of the corresponding parent class
	 * @param filename
	 * 	    The name of the file where the results are going to be printed.
	 */
	public void printToFile(String filename) {
		// FILL IN CODE
	}

}
