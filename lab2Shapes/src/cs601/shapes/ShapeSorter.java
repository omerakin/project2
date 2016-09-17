package cs601.shapes;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Paths;
import java.util.ArrayList;
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
	private ArrayList<Shape> shape;
	private ArrayList<Shape2D> shape2d;
	private ArrayList<Shape3D> shape3d;
	
	
	/** A default constructor for class ShapeSorter */
	public ShapeSorter() {
		// FILL IN CODE
		// Initialise the data structures
		shape = new ArrayList<>();
		shape2d = new ArrayList<>();
		shape3d = new ArrayList<>();
	}

	/** Read a given file, create different shapes, and add them to the data structures
	 *  @param filename
	 *  	      The name of the file that contains info about the shapes.
	 */
	public void loadShapes(String filename) {
		// FILL IN CODE
		String line;
		String[] parts;
		Circle circle;
		Parallelogram parallelogram;
		ConvexRegularPolygon convexRegularPolygon;
		Sphere sphere;
		Parallelepiped parallelepiped;
		PlatonicSolid platonicSolid;
		try {
			BufferedReader bufferedReader = new BufferedReader(new FileReader(Paths.get(filename).toAbsolutePath().toString()));
			
			while((line = bufferedReader.readLine()) != null) {
				//System.out.println("line = " + line);
				parts = line.split(" ");
				if(line.contains("Circle")){
					circle = new Circle(Double.parseDouble(parts[1]));
					shape.add(circle);
					shape2d.add(circle);
				} else if(line.contains("Parallelogram")){
					parallelogram = new Parallelogram(Double.parseDouble(parts[1]), 
							Double.parseDouble(parts[2]), Double.parseDouble(parts[3]));
					shape.add(parallelogram);
					shape2d.add(parallelogram);
				} else if (line.contains("ConvexRegularPolygon")) {
					convexRegularPolygon = new ConvexRegularPolygon(Integer.parseInt(parts[1]), 
							Double.parseDouble(parts[2]));
					shape.add(convexRegularPolygon);
					shape2d.add(convexRegularPolygon);
				} else if (line.contains("Sphere")) {
					sphere = new Sphere(Double.parseDouble(parts[1]));
					shape.add(sphere);
					shape3d.add(sphere);
				} else if (line.contains("Parallelepiped")) {
					parallelepiped = new Parallelepiped(Double.parseDouble(parts[1]), 
							Double.parseDouble(parts[2]), Double.parseDouble(parts[3]), 
							Double.parseDouble(parts[4]), Double.parseDouble(parts[5]));
					shape.add(parallelepiped);
					shape3d.add(parallelepiped);
				} else if (line.contains("PlatonicSolid")) {
					platonicSolid = new PlatonicSolid(Integer.parseInt(parts[1]), 
							Integer.parseInt(parts[2]), Double.parseDouble(parts[3]));
					shape.add(platonicSolid);
					shape3d.add(platonicSolid);
				} else {
					System.out.println("Not defined Shape!!!");
				}
			}
			bufferedReader.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println("IOException occured.");
		}
	}

	
	/** Sort a list of Shape-s 
	 * @param whichShapes
	 * 		 A string, either "all", "2D" or "3D" - specifies which list of shapes to sort
	 * @param comparator
	 * 		 A Comparator object that tells the method how to sort shapes.
	 */
	public void sortShapes(String whichShapes, Comparator<Shape> comparator) {
		// FILL IN CODE
		
		if(whichShapes.trim().equals("all")){
			Collections.sort(shape, comparator);
		} else if (whichShapes.trim().equals("2D")) {
			Collections.sort(shape2d, comparator);
		} else if (whichShapes.trim().equals("3D")) {
			Collections.sort(shape3d, comparator);
		}
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
		try {
			
			PrintWriter printWriter = new PrintWriter(new FileWriter(Paths.get(filename).toAbsolutePath().toString()));
			for(Shape2D shapes: shape2d){
				printWriter.println(shapes.toString());
			}
			printWriter.println("");
			for(Shape3D shapes: shape3d){
				printWriter.println(shapes.toString());
			}
			printWriter.println("");
			for(Shape shapes: shape){
				printWriter.println(shapes.toString());
			}
			printWriter.flush();
			printWriter.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println("IOException occured.");
		}
	}

}
