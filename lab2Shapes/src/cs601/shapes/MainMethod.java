package cs601.shapes;



public class MainMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ShapeSorter shapeSorter = new ShapeSorter();
		shapeSorter.loadShapes("shapesFile.txt");
		shapeSorter.printToFile("outputFile.txt");
		
		//PlatonicSolid platonicSolid = new PlatonicSolid(3, 4, 1.0);
		
		//System.out.println(platonicSolid.volume());
		
	}

}
