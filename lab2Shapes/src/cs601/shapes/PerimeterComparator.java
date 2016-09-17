package cs601.shapes;

import java.util.Comparator;

public class PerimeterComparator implements Comparator<Shape2D> {

	private final static double EPS = 0.001;
	
	@Override
	public int compare(Shape2D o1, Shape2D o2) {
		// TODO Auto-generated method stub
		if(Math.abs(o1.perimeter() - o2.perimeter()) < EPS){
			return 0;
		} else if(o1.perimeter() < o2.perimeter()){
			return -1;			
		} else if (o1.perimeter() > o2.perimeter()){
			return 1;
		} else {
			return 0;
		}
	}

}
