package cs601.shapes;

import java.util.Locale;

/** An abstract class Shape3D. Extends Shape. 
 * A direct parent of all three-dimensional shape classes. 
 */
public abstract class Shape3D extends Shape {
	
	/**
	 * An abstract method for computing the volume of the shape.
	 * @return A volume of the 3D shape.
	 */
	public abstract double volume();
	
	
	/**
	 * Overrides toString() from class Shape. Adds information about the volume of the 3D shape.
	 * Format: The name of the shape, 1 tab, the area (formatted so that it only shows 
	 * two digits after the decimal point), 1 tab, the volume (formatted so that it only shows 
	 * two digits after the decimal point).	
	 * @return String
	 */
	@Override
	public String toString() {
		// FILL IN CODE
		// to convert my computer default value to general value  , --> . and remove 0 before the dot.
		return  super.toString() + "	" + String.format(Locale.US,"%.2f",volume()).replaceFirst("^0\\.", ".");
	}
}
