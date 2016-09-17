package cs601.shapes;

public class ConvexRegularPolygon extends Shape2D {

	private int numberOfEdges;
	private double lengthOfEdge;
	
	public ConvexRegularPolygon(int numberOfEdges, double lengthOfEdge) {
		// TODO Auto-generated constructor stub
		this.numberOfEdges = numberOfEdges;
		this.lengthOfEdge = lengthOfEdge;
	}

	@Override
	public double perimeter() {
		// TODO Auto-generated method stub
		return numberOfEdges*lengthOfEdge;
	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return (1.0/4)*(numberOfEdges)*(lengthOfEdge)*(lengthOfEdge)*(1.0/Math.tan(Math.PI/numberOfEdges));
	}

	public int getNumberOfEdges() {
		return numberOfEdges;
	}

	public void setNumberOfEdges(int numberOfEdges) {
		this.numberOfEdges = numberOfEdges;
	}

	public double getLengthOfEdge() {
		return lengthOfEdge;
	}

	public void setLengthOfEdge(double lengthOfEdge) {
		this.lengthOfEdge = lengthOfEdge;
	}

}
