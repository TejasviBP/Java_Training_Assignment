package exceptionHandling;

public class MultiExceptions {
     public static void main(String[] args) {
		int[] array= {12,23,34,45,56};
		int a= array.length;
		System.out.println(a);
		int b= array[4];
		try {
			System.out.println(array[7]);
			System.out.println(b/0);
			}
		catch(ArithmeticException ex) {
			System.out.println(ex);
		}catch(ArrayIndexOutOfBoundsException ex) {
			System.out.println(ex);
		}finally {
			System.out.println("Finally block always executes");
		}
		 
     }
     }

