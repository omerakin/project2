package cs601.shapes;

import java.util.Comparator;

public class NameComparator implements Comparator<Shape>{

	/** Compare the two shapes by comparing their names. 
	 * @param o1
	 * 		The first name
	 * @param o2
	 * 		The second name 
	 * @return 0 if both shapes name are "equal". otherwise positive or negative number.
	 * */
	@Override
	public int compare(Shape o1, Shape o2) {
		// TODO Auto-generated method stub
		return o1.getClass().getSimpleName().compareTo(o2.getClass().getSimpleName());
	}

}
