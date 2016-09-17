package cs601.shapes;

public class Parallelogram extends Shape2D{

	private double side1;
	private double side2;
	private double angle;
	
	public Parallelogram(double side1, double side2, double angle) {
		// TODO Auto-generated constructor stub
		
		this.side1 = side1;
		this.side2 = side2;
		this.angle = angle;
		
	}

	@Override
	public double perimeter() {
		// TODO Auto-generated method stub
		return 2*(side1+side2);
	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return side1*side2*(Math.sin(Math.toRadians(angle)));
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

	public double getAngle() {
		return angle;
	}

	public void setAngle(double angle) {
		this.angle = angle;
	}

}
