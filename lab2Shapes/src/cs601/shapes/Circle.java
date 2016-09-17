package cs601.shapes;

public class Circle extends Shape2D {
	
	private double radius;
	

	public Circle(double radius) {
		// TODO Auto-generated constructor stub
		this.radius = radius;
	}

	@Override
	public double perimeter() {
		// TODO Auto-generated method stub
		return 2*Math.PI*radius;
	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return Math.PI*radius*radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}


}
