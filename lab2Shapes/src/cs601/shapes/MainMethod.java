package cs601.shapes;



public class MainMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ShapeSorter shapeSorter = new ShapeSorter();
		shapeSorter.loadShapes("shapesFile.txt");
		shapeSorter.printToFile("outputFile.txt");
		
		//Parallelepiped parallelepiped = new Parallelepiped(1.0, 2.0, 4.0, 45.0, 45.0);
		
		//System.out.println(parallelepiped.volume());
		
	}

}
