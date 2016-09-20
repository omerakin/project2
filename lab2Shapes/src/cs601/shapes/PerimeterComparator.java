package cs601.shapes;

import java.util.Comparator;

public class PerimeterComparator implements Comparator<Shape> {

	private final static double EPS = 0.001;
	
	/** Compare the two shapes by comparing their perimeters. 
	 * @param o1
	 * 		The first perimeter
	 * @param o2
	 * 		The second perimeter 
	 * @return An integer result. A negative number is returned if o1 is less than o2,
	 * a positive number means o2 is less than o1. 0 if both perimeters are "equal".
	 * */
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
