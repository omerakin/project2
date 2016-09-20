package cs601.shapes;

public class Circle extends Shape2D {
	
	private double radius;
	

	/**
	 * 
	 * @param radius Circle object's radius value
	 */
	public Circle(double radius) {
		// TODO Auto-generated constructor stub
		this.radius = radius;
	}

	/**
	 * An abstract method for computing the perimeter of the shape.
	 * @return The perimeter of the shape
	 */
	@Override
	public double perimeter() {
		// TODO Auto-generated method stub
		return 2*Math.PI*radius;
	}

	/**
	 * An abstract method for computing the area or the surface area of the shape.
	 * @return area of the shape
	 */
	@Override
	public double area() {
		// TODO Auto-generated method stub
		return Math.PI*radius*radius;
	}

	/**
	 * 
	 * @return radius of circle
	 */
	public double getRadius() {
		return radius;
	}

	/**
	 * 
	 * @param radius set radius of circle
	 */
	public void setRadius(double radius) {
		this.radius = radius;
	}


}
