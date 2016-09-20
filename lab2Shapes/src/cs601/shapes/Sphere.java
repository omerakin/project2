package cs601.shapes;

/**
 * @author akin_
 *
 */
public class Sphere extends Shape3D {

	private double radius;
	
	/**
	 * 
	 * @param radius Object's radius value
	 */
	public Sphere(double radius) {
		// TODO Auto-generated constructor stub
		this.radius = radius;
	}

	/**
	 * An abstract method for computing the volume of the shape.
	 * @return A volume of the 3D shape.
	 */
	@Override
	public double volume() {
		// TODO Auto-generated method stub
		return (4.0/3)*Math.PI*(radius*radius*radius);
	}

	/**
	 * An abstract method for computing the area or the surface area of the shape.
	 * @return area of the shape
	 */
	@Override
	public double area() {
		// TODO Auto-generated method stub
		return 4*Math.PI*(radius*radius);
	}

	/**
	 * 
	 * @return radius of sphere
	 */
	public double getRadius() {
		return radius;
	}

	/**
	 * 
	 * @param radius
	 */
	public void setRadius(double radius) {
		this.radius = radius;
	}
}
