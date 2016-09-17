package cs601.shapes;

import java.util.Comparator;

public class VolumeComparator implements Comparator<Shape3D> {

	@Override
	public int compare(Shape3D o1, Shape3D o2) {
		// TODO Auto-generated method stub
		if(Math.abs(o1.volume() - o2.volume()) < 0.001){
			return 0;
		} else if(o1.volume() < o2.volume()){
			return -1;			
		} else if (o1.volume() > o2.volume()){
			return 1;
		} else {
			return 0;
		}
	}

}
