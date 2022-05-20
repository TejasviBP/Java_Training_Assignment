package accessModifiers;

public class UseOfDefault {

	static void factorial(int a){
	
		int result = 1;
		for(int i=1;i<=a;i++) {
			result= result*i;
		}
		System.out.println("Factorial of a number = "+result);
	}
	
	public static void main(String[] args) {
		
       factorial(5);
	}

}
