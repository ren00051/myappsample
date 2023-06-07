package Task1;

public class WrapperClass {

	public static void main(String[] args) {
		System.out.println("Java Primitive Data Types Information: ");
		
		// Display information for the byte wrapper class
		System.out.printf("byte, SIZE: %d, BYTES: %d, MIN_VALUE: %d, MAX_VALUE: %d %n", 
				Byte.SIZE,Byte.BYTES, Byte.MIN_VALUE, Byte.MAX_VALUE);
		
		// Display information for the short wrapper class
		System.out.printf("short, SIZE: %d, BYTES: %d, MIN_VALUE: %d, MAX_VALUE: %d %n", 
				Short.SIZE,Short.BYTES, Short.MIN_VALUE, Short.MAX_VALUE);
		
		// Display information for the int wrapper class
		System.out.printf("int, SIZE: %d, BYTES: %d, MIN_VALUE: %d, MAX_VALUE: %d %n", 
				Integer.SIZE,Integer.BYTES, Integer.MIN_VALUE, Integer.MAX_VALUE);
		
		// Display information for the long wrapper class
		System.out.printf("long, SIZE: %d, BYTES: %d, MIN_VALUE: %d, MAX_VALUE: %d %n", 
				Long.SIZE,Long.BYTES, Long.MIN_VALUE, Long.MAX_VALUE);
		
		// Display information for the float wrapper class
		System.out.printf("float, SIZE: %d, BYTES: %d, MIN_VALUE: %e, MAX_VALUE: %e %n", 
				Float.SIZE,Float.BYTES, Float.MIN_VALUE, Float.MAX_VALUE);
		
		// Display information for the double wrapper class
		System.out.printf("double, SIZE: %d, BYTES: %d, MIN_VALUE: %e, MAX_VALUE: %e %n", 
				Double.SIZE,Double.BYTES, Double.MIN_VALUE, Double.MAX_VALUE);
		
		// Display information for the char wrapper class
		System.out.printf("char, SIZE: %d, BYTES: %d, MIN_VALUE: %d, MAX_VALUE: %d %n", 
				Character.SIZE, Character.BYTES, (int)Character.MIN_VALUE, (int)Character.MAX_VALUE);

		// Display programmer information
		System.out.println("Program by Shanshan Ren");
		System.out.println("Student number : 041009519");
		System.out.println("Course name - Computer Programming");
		
	}

}
