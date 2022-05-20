package exceptionHandling;

public class ArithmeticExceptionDemo {

	//there are 3 ways to handle exception 1. using try-catch
	public static void main(String[] args) {

		int a=8;
		System.out.println(a);
		try{
			int result= a/0;
			System.out.println(result);
		}catch(ArithmeticException ex){
			ex.printStackTrace();
		}
		System.out.println("program ends");
	}

}
