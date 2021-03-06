package cs601.shapes;

import java.util.Locale;

/** An abstract class Shape2D. Extends Shape. 
 * A direct parent of all two-dimensional shape classes. 
 */
public abstract class Shape2D extends Shape {
	
	/**
	 * An abstract method for computing the perimeter of the shape.
	 * @return The perimeter of the shape
	 */
	public abstract double perimeter();
	
	/**
	 * Overrides toString() from class Shape. Adds information about the perimeter of the shape.
	 * Format: The name of the shape, 1 tab, the area (formatted so that it only shows 
	 * two digits after the decimal point), 1 tab, the perimeter(formatted so that it only shows 
	 * two digits after the decimal point).	
	 * @return String
	 */
	@Override
	public String toString() {
		// FILL IN CODE
		// to convert my computer default value to general value  , --> . and remove 0 before the dot.
		return  super.toString() + "	" + String.format(Locale.US,"%.2f", perimeter()).replaceFirst("^0\\.", ".");
	}
	
}
