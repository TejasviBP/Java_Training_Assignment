package basicsofJava;

public class Operators {

	static int num1=80;
	static int num2=20;

	public int add() {
		int sum;
		sum=num1+num2;
		return sum;
	}
	public int subtract() {
		int subtract;
		subtract=num1-num2;
		return subtract;
	}

	public static void main(String[] args) {
		//arthimetic operator
		int multiple;
		int divide;
		Operators operate=new Operators();
		operate.add();
		operate.subtract();
		System.out.println("num1= "+num1);
		System.out.println("num12= "+num2);
		System.out.println(num1*num2);
		System.out.println(num1/num2);

		//unary operator
		num1++;// increment
		num2++;
		multiple=num1*num2;
		System.out.println(num1+" * "+num2 +" = "+multiple);
		System.out.println(multiple);
		num1--; // decrement
		++num2;
		multiple=num1*num2;
		System.out.println(num1+" * "+num2 +" = "+multiple);

		//shift operator
		System.out.println(2<<3);//left shift 
		System.out.println(10<<4); 
		System.out.println(" "+(64>>5));//64/2^5=100/25=

		// ternary operator
		int min=(num1<num2)?num1:num2; 
		System.out.println(min); 
	}

}
