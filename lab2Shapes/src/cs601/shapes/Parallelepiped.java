package cs601.shapes;

/**
 * @author akin_
 *
 */
public class Parallelepiped extends Shape3D {

	private double side1;
	private double side2;
	private double side3;
	private double angle1;
	private double angle2;
	private double angle3;
	
	/**
	 * 
	 * @param side1 one of the lengths of the three sides
	 * @param side2 one of the lengths of the three sides
	 * @param side3 one of the lengths of the three sides
	 * @param angle1  the angle between side1 and side2
	 * @param angle2  the angle between side2 and side3
	 */
	public Parallelepiped(double side1, double side2, double side3, double angle1, double angle2) {
		// TODO Auto-generated constructor stub
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
		this.angle1 = angle1;
		this.angle2 = angle2;
		this.angle3 = angle2;
	}

	/**
	 * An abstract method for computing the volume of the shape.
	 * @return A volume of the 3D shape.
	 */
	@Override
	public double volume() {
		// TODO Auto-generated method stub
		return side1*side2*side3*Math.sqrt(1.0 + 2.0*Math.cos(Math.toRadians(angle1))*
				Math.cos(Math.toRadians(angle2))* Math.cos(Math.toRadians(angle3))-
				Math.cos(Math.toRadians(angle1))* Math.cos(Math.toRadians(angle1))-
				Math.cos(Math.toRadians(angle2))* Math.cos(Math.toRadians(angle2))-
				Math.cos(Math.toRadians(angle2))* Math.cos(Math.toRadians(angle2)));
	}

	/**
	 * An abstract method for computing the area or the surface area of the shape.
	 * @return area of the shape
	 */
	@Override
	public double area() {
		// TODO Auto-generated method stub
		return 2.0*side1*side2*Math.sin(Math.toRadians(angle1)) + 
				2.0*side2*side3*Math.sin(Math.toRadians(angle2)) +
				2.0*side1*side3*Math.sin(Math.toRadians(angle2));
	}

	/**
	 * 
	 * @return side1 lengths of the three sides
	 */
	public double getSide1() {
		return side1;
	}

	/**
	 * 
	 * @param set side1 lengths of the three sides
	 */
	public void setSide1(double side1) {
		this.side1 = side1;
	}

	/**
	 * 
	 * @return side2 lengths of the three sides
	 */
	public double getSide2() {
		return side2;
	}

	/**
	 * 
	 * @param  set side2 lengths of the three sides
	 */
	public void setSide2(double side2) {
		this.side2 = side2;
	}

	/**
	 * 
	 * @return side3 lengths of the three sides
	 */
	public double getSide3() {
		return side3;
	}

	/**
	 * 
	 * @param set side3 lengths of the three sides
	 */
	public void setSide3(double side3) {
		this.side3 = side3;
	}

	/**
	 * 
	 * @return the angle between side1 and side2
	 */
	public double getAngle1() {
		return angle1;
	}

	/**
	 * 
	 * @param angle1
	 */
	public void setAngle1(double angle1) {
		this.angle1 = angle1;
	}

	/**
	 * 
	 * @return the angle between side2 and side3
	 */
	public double getAngle2() {
		return angle2;
	}

	/**
	 * 
	 * @param angle2
	 */
	public void setAngle2(double angle2) {
		this.angle2 = angle2;
	}
}
