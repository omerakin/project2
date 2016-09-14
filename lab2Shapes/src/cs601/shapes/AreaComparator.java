package cs601.shapes;

import java.util.Comparator;

/** A comparator that compares Shapes based on the area */
public class AreaComparator implements Comparator<Shape> {

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
		return 0; // don't forget to change it
	}

}
