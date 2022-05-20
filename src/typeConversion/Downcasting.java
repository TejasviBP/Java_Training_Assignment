package typeConversion;

public class Downcasting {
// Convert a value from one data type to another data type is known as type casting.
// there are two types: 
	
	public static void main(String[] args) {
		// (lower)  byte -> short -> char -> int -> long -> float -> double  (Higher)
		//Converting a lower data type into a higher one is called widening type casting or down-Casting/implicit conversion 

		int a= 7;
		System.out.println("int value "+a);
		long l= a;
		System.out.println("long value "+a);
		float f= a;
		System.out.println("float value  "+a);
		double d=a;
		System.out.println("double value "+a);

		
	}

}
