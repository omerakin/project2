package cs601.shapes;

import java.util.Comparator;

public class PerimeterComparator implements Comparator<Shape> {

	private final static double EPS = 0.001;
	
	@Override
	public int compare(Shape o1, Shape o2) {
		// TODO Auto-generated method stub
		if(Math.abs(((Shape2D)o1).perimeter() - ((Shape2D)o2).perimeter()) < EPS){
			return 0;
		} else if(((Shape2D)o1).perimeter() < ((Shape2D)o2).perimeter()){
			return -1;			
		} else if (((Shape2D)o1).perimeter() > ((Shape2D)o2).perimeter()){
			return 1;
		} else {
			return 0;
		}
	}

}
