package cs601.shapes;

import java.util.Comparator;

public class NameComparator implements Comparator<Shape>{

	@Override
	public int compare(Shape o1, Shape o2) {
		// TODO Auto-generated method stub
		return o1.getClass().getSimpleName().compareTo(o2.getClass().getSimpleName());
	}

}
