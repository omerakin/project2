package cs601.shapes;

public class Sphere extends Shape3D {

	private double radius;
	
	public Sphere(double radius) {
		// TODO Auto-generated constructor stub
		this.radius = radius;
	}

	@Override
	public double volume() {
		// TODO Auto-generated method stub
		return (4.0/3)*Math.PI*(radius*radius*radius);
	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return 4*Math.PI*(radius*radius);
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
}
