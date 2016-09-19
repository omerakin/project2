package cs601.shapes;

import java.util.Comparator;

public class VolumeComparator implements Comparator<Shape> {

	@Override
	public int compare(Shape o1, Shape o2) {
		// TODO Auto-generated method stub
		if(Math.abs( ((Shape3D)o1).volume() - ((Shape3D)o2).volume()) < 0.001){
			return 0;
		} else if(((Shape3D)o1).volume() < ((Shape3D)o2).volume()){
			return -1;			
		} else if (((Shape3D)o1).volume() > ((Shape3D)o2).volume()){
			return 1;
		} else {
			return 0;
		}
	}

}
