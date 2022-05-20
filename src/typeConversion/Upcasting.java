package typeConversion;

public class Upcasting {

	public static void main(String[] args) {
		//Converting a higher data type into a lower one is called narrowing type casting/ExplicitConversion/ up-casting
		// double -> float -> long -> int -> char -> short -> byte  (lower datatype)
		double d= 3.4;
		System.out.println(d);
		
		// converting to lower data type
		long l=(long)d;
		System.out.println(l);
		
		float f= (float)d;
		System.out.println(l);
		
		int a=(int)d;
		System.out.println(a);
	}

}
