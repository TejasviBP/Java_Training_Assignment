package accessModifiers;

public class UseOfProtected {
// protected can be access with in the same package and outside of package by inheritance
	protected static void cube(double a) {
		System.out.println("Cube of number = "+a*a*a);
	}


}
