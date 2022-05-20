package abstractionAndEncapsulation;



abstract class Perimeter{
	public abstract	double calculatePerimeter(double a);

}

class Circle1 extends Perimeter{

	@Override
	public double calculatePerimeter(double r) {
		double a=r;
		double circumference= 2*3.14*a;
		return circumference;
	}
}

class Square1 extends Perimeter{

	@Override
	public double calculatePerimeter(double a) {
		double side=a;
		double perimeter= 4*side;
		return perimeter;
	}

}

public class AbstractionDemo {

	public static void main(String[] args) {
		Square1 sq = new Square1();
		System.out.println("perimeter of square = "+sq.calculatePerimeter(8.5)+"unit");

		Circle1 cs= new Circle1();
		System.out.println("Circumference of Circle = "+ cs.calculatePerimeter(4.5)+"unit");

	}

}
