package exceptionHandling;

public class NullPointerExceptionDemo {
	public static void main(String[] args) {
		String str="Hello";
		String str1 = null;
		str=str1;
		System.out.println("Program starts");
		try {
			System.out.println(str.concat(str1));
		}
		catch(NullPointerException ex){
			System.out.println(ex);
		}
		System.out.println("Program ends");
	}
}
