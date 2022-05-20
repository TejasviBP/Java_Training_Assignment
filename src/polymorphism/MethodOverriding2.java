package polymorphism;

public class MethodOverriding2 extends MethodOverriding {

	void display(){
		System.out.println("display simple method 2");
			}
	
	
	public static void main(String[] args) {
		 MethodOverriding2 obj= new MethodOverriding2();
		 obj.display();
		
}
}
