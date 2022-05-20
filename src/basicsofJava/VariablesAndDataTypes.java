package basicsofJava;

public class VariablesAndDataTypes {
	// variable is the name of reserved area allocated in memory
	//Types of variable: local, instance and static
	static int num1; // static variable
	int num2;  // instance variable


	public int add() {
		int sum; // local variable
		num1=10;
		num2=90;
		sum= num1+num2;
		System.out.println();
		System.out.println("Sum = "+sum);
		return sum;
	
	}


	public static void main(String args[]) {
		// different data types: primitive and Non-Primitive

		int age= 10;
		String name="Tejasvi";
		boolean isDisplayed= true;
		char c= 'c';
		short s;
		byte b;
		long l=667788990098766L;
		double d= 2.3d;
		float num = 3.4f;

		System.out.println(age+" "+ name+" "+isDisplayed);
		System.out.println(c+" "+d+" "+l+" "+num);

		VariablesAndDataTypes obj1 = new VariablesAndDataTypes();
		obj1.add();


	}
}
