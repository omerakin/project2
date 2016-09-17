package cs601.shapes;

import java.util.Comparator;

/** A comparator that compares Shapes based on the area */
public class AreaComparator implements Comparator<Shape> {
	
	private final static double EPS = 0.001;

	/** Compare the two shapes by comparing their areas (or surface areas). 
	 * @param o1
	 * 		The first shape
	 * @param o2
	 * 		The second shape 
	 * @return An integer result. A negative number is returned if o1 is less than o2,
	 * a positive number means o2 is less than o1. 0 if both shapes are "equal".
	 * */
	@Override
	public int compare(Shape o1, Shape o2) {
		// FILL IN CODE
		if(Math.abs(o1.area() - o2.area()) < EPS){
			return 0;
		} else if(o1.area() < o2.area()){
			return -1;			
		} else if (o1.area() > o2.area()){
			return 1;
		} else {
			return 0;
		}
	}

}
