package cs601.shapes;

import java.util.Comparator;

public class VolumeComparator implements Comparator<Shape> {

	/** Compare the two shapes by comparing their volume. 
	 * @param o1
	 * 		The first volume
	 * @param o2
	 * 		The second volume 
	 * @return An integer result. A negative number is returned if o1 is less than o2,
	 * a positive number means o2 is less than o1. 0 if both volumes are "equal".
	 * */
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
