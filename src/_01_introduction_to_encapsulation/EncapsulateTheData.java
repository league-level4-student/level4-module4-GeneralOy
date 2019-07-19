package _01_introduction_to_encapsulation;

/**
 * Encapsulation is a way of protecting the data in a class from being
 * unintentionally altered from another class.
 * 
 * To encapsulate a member variable, follow these three steps:
 * 
 * 1. Make the member variable private (or protected)
 * 
 * 2. Make a getter and setter method (accessor and mutator) for the variable.
 * 
 * 3. Add restrictions to the setter method so the member variable cannot be 
 * 	  adversely altered
 * 
 * */

public class EncapsulateTheData {
	/**
	 * 1. Encapsulate the member variables. // Add restrictions to the setters
	 * according to the comment.
	 */

	/**
	 * 2. Create a new JUnit Test case and write tests to verify that // the member
	 * variables' getters and setters are working
	 */

	private int itemsReceived;

	/** must not be negative. All negative arguments get set to 0. */

	public int getItemsReceived() {
		return itemsReceived;
	}

	public void receiveItems(int numberOfItems) {
		if (numberOfItems < 0) {
			itemsReceived = 0;
		} else {
			itemsReceived = numberOfItems;
		}
	}

	private float degreesTurned;

	/** must be locked between 0.0 and 360.0 inclusive. */
	/** ^wants abs. value of degrees turned or current orientation with ref?*/

	public float getDegreesTurned() {
		return degreesTurned;
	}

	public void turnXDegrees(float X) {
		if(Math.abs(X) > 360) {
			X = X % 360;
		}
		if (X < 0) {
			X = 360 + X;
		}
		// ^current orientation w/ ref
		degreesTurned = X;
	}

	private String nomenclature = " "; 
	
	/** must not be set to a blank string. Blank Strings get set to a space */

	public String getNomenclature() {
		/*
		 * if (nomenclature.isEmpty()) { return " "; } else { return nomenclature; }
		 */
		return nomenclature;

	}

	public void setNomenclature(String newNomenclature) {
		if (newNomenclature.isEmpty()) {
			nomenclature = " ";
		} else {
			nomenclature = newNomenclature;
		}
	}

	private Object memberObj; 
	
	/** must not be a String. If it is a String, set it equal to a new Object(); */
	
	public Object getObj() {
		return memberObj;
	}
	
	public void setMemObj(Object newObject) {
		String test = "a";
		if(newObject.getClass() == test.getClass()) {
			memberObj = new Object();
		} else {
			memberObj = newObject;
		}
	}

	public static void main(String[] args) {

	}
}
