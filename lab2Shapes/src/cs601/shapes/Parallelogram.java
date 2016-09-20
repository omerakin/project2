package cs601.shapes;

public class Parallelogram extends Shape2D{

	private double side1;
	private double side2;
	private double angle;
	
	/**
	 * @param side1 one of the lengths of the two sides
	 * @param side2 one of the lengths of the two sides
	 * @param angle the angle between them
	 */
	public Parallelogram(double side1, double side2, double angle) {
		// TODO Auto-generated constructor stub
		
		this.side1 = side1;
		this.side2 = side2;
		this.angle = angle;
		
	}

	/**
	 * An abstract method for computing the perimeter of the shape.
	 * @return The perimeter of the shape
	 */
	@Override
	public double perimeter() {
		// TODO Auto-generated method stub
		return 2*(side1+side2);
	}

	/**
	 * An abstract method for computing the area or the surface area of the shape.
	 * @return area of the shape
	 */
	@Override
	public double area() {
		// TODO Auto-generated method stub
		return side1*side2*(Math.sin(Math.toRadians(angle)));
	}
	
	/**
	 * 
	 * @return the lengths of the side1
	 */
	public double getSide1() {
		return side1;
	}

	/**
	 * 
	 * @param side1
	 */
	public void setSide1(double side1) {
		this.side1 = side1;
	}

	/**
	 * 
	 * @return the lengths of the side2
	 */
	public double getSide2() {
		return side2;
	}

	/**
	 * 
	 * @param side2
	 */
	public void setSide2(double side2) {
		this.side2 = side2;
	}

	/**
	 * 
	 * @return the angle between them
	 */
	public double getAngle() {
		return angle;
	}

	/**
	 * 
	 * @param angle 
	 */
	public void setAngle(double angle) {
		this.angle = angle;
	}

}
