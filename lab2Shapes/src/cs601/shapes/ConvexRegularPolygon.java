package cs601.shapes;

/**
 * @author akin_
 *
 */
public class ConvexRegularPolygon extends Shape2D {

	private int numberOfEdges;
	private double lengthOfEdge;
	
	/**
	 * 
	 * @param numberOfEdges represent the number of edges
	 * @param lengthOfEdge represent the length of the edge
	 */
	public ConvexRegularPolygon(int numberOfEdges, double lengthOfEdge) {
		// TODO Auto-generated constructor stub
		this.numberOfEdges = numberOfEdges;
		this.lengthOfEdge = lengthOfEdge;
	}

	/**
	 * An abstract method for computing the perimeter of the shape.
	 * @return The perimeter of the shape
	 */
	@Override
	public double perimeter() {
		// TODO Auto-generated method stub
		return numberOfEdges*lengthOfEdge;
	}

	/**
	 * An abstract method for computing the area or the surface area of the shape.
	 * @return area of the shape
	 */
	@Override
	public double area() {
		// TODO Auto-generated method stub
		return (1.0/4)*(numberOfEdges)*(lengthOfEdge)*(lengthOfEdge)*(1.0/Math.tan(Math.PI/numberOfEdges));
	}

	/**
	 * 
	 * @return the number of edges
	 */
	public int getNumberOfEdges() {
		return numberOfEdges;
	}

	/**
	 * 
	 * @param numberOfEdges set the number of edges
	 */
	public void setNumberOfEdges(int numberOfEdges) {
		this.numberOfEdges = numberOfEdges;
	}

	/**
	 * 
	 * @return the length of the edge
	 */
	public double getLengthOfEdge() {
		return lengthOfEdge;
	}

	/**
	 * 
	 * @param lengthOfEdge set the length of the edge
	 */
	public void setLengthOfEdge(double lengthOfEdge) {
		this.lengthOfEdge = lengthOfEdge;
	}

}
