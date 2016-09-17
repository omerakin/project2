package cs601.shapes;



public class MainMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ShapeSorter shapeSorter = new ShapeSorter();
		shapeSorter.loadShapes("shapesFile.txt");
		shapeSorter.printToFile("outputFile.txt");
		
	}

}
