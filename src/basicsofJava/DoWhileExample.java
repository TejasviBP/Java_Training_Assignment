package basicsofJava;

import java.util.Scanner;

public class DoWhileExample {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int a;
		do {
			System.out.print("Enter a number between 1 and 10: ");
			a= sc.nextInt();
			
		}while(a<1 || a>10);
		System.out.println(a+" is between 1 and 10 ");

	}

}
