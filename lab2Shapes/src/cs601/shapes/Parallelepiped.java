package cs601.shapes;

public class Parallelepiped extends Shape3D {

	private double side1;
	private double side2;
	private double side3;
	private double angle1;
	private double angle2;
	private double angle3;
	
	public Parallelepiped(double side1, double side2, double side3, double angle1, double angle2) {
		// TODO Auto-generated constructor stub
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
		this.angle1 = angle1;
		this.angle2 = angle2;
		this.angle3 = angle2;
	}

	@Override
	public double volume() {
		// TODO Auto-generated method stub
		return side1*side2*side3*Math.sqrt(1.0 + 2.0*Math.cos(Math.toRadians(angle1))*
				Math.cos(Math.toRadians(angle2))* Math.cos(Math.toRadians(angle3))-
				Math.cos(Math.toRadians(angle1))* Math.cos(Math.toRadians(angle1))-
				Math.cos(Math.toRadians(angle2))* Math.cos(Math.toRadians(angle2))-
				Math.cos(Math.toRadians(angle2))* Math.cos(Math.toRadians(angle2)));
	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return 2.0*side1*side2*Math.sin(Math.toRadians(angle1)) + 
				2.0*side2*side3*Math.sin(Math.toRadians(angle2)) +
				2.0*side1*side3*Math.sin(Math.toRadians(angle2));
	}

	public double getSide1() {
		return side1;
	}

	public void setSide1(double side1) {
		this.side1 = side1;
	}

	public double getSide2() {
		return side2;
	}

	public void setSide2(double side2) {
		this.side2 = side2;
	}

	public double getSide3() {
		return side3;
	}

	public void setSide3(double side3) {
		this.side3 = side3;
	}

	public double getAngle1() {
		return angle1;
	}

	public void setAngle1(double angle1) {
		this.angle1 = angle1;
	}

	public double getAngle2() {
		return angle2;
	}

	public void setAngle2(double angle2) {
		this.angle2 = angle2;
	}
}
