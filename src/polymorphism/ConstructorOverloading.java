package polymorphism;

public class ConstructorOverloading {
	public ConstructorOverloading() {
		System.out.println("Default constructor");
	}
	public ConstructorOverloading(int num) {
		System.out.println("parametized constructor value of number is: "+num);
	}
	
	
	
public static void main(String[] args) {
	ConstructorOverloading obj1= new ConstructorOverloading();
	ConstructorOverloading obj2= new ConstructorOverloading(800);
	
	System.out.println(obj1.equals(obj2));
}
}
