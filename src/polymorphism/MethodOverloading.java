package polymorphism;

public class MethodOverloading {
	void display(){
System.out.println("display simple method");
	}
	void display(int num) {
		System.out.println("display method with 1 argument "+num);
	}
	void display(int num1, int num2) {
		System.out.println("display method with 2 arguments "+num1+" and "+num2);
	}
void display(float num1, int num2) {
	System.out.println("display method with 2 arguments "+num1+" and "+num2);
	}
	
	public static void main(String[] args) {
		
		MethodOverloading mg= new MethodOverloading();
		mg.display();
		mg.display(7);
		mg.display(8.7f, 8);
		mg.display(6, 9);
	}
}
