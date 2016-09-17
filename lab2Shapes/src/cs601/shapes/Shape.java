package cs601.shapes;

import java.text.DecimalFormat;

/** An abstract class Shape. At the top of the shape hierarchy. */
public abstract class Shape {
	
	/**
	 * An abstract method for computing the area or the surface area of the shape.
	 * @return area of the shape
	 */
	public abstract double area();
	
	
	/**
	 * Returns a string representation of the shape in the following format:
	 * The name of the shape, 1 tab, the area (formatted so that it only shows 
	 * two digits after the decimal point)
	 * @return String
	 */
	@Override
	public String toString() {
		// FILL IN CODE
		return  getClass().getSimpleName() + "	" + (new DecimalFormat("#.##").format(area())) ;
	}
	
}
