package abstractionAndEncapsulation;


//Abstraction is a process of hiding the implementation details and showing only functionality to the user.
	// abstraction can be done in two ways: 1. abstract class(0-100%)   2. interface(100%)


abstract class Shape{
	abstract double area();
}
class Square extends Shape{
	double side=10;
	double area() {
		return side*side;
	}
	}
class Circle extends Shape{
	double r=5;
	double area() {
		return 3.14*r*r;
	}
}

public class AbstractDemo {
 public static void main(String[] args) {
	Square s= new Square();
	System.out.println("area of square = "+s.area()+" sq. unit");
	Circle c= new Circle();
	System.out.println("area of Circle = "+c.area()+" sq. unit");
}
}
