package accessModifiers;

public class UseOfPublic {
public static void square(double a) {
	
	
	System.out.println("Square of number = "+a*a);
}
public static void main(String[] args) {
	square(5);
	UseOfProtected.cube(5);
	UseOfDefault.factorial(5);
	UseOfPrivate priv= new UseOfPrivate();
	//priv.add(566677, 8899);
}
}
