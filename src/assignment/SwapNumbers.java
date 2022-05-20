package assignment;

import java.util.Scanner;

public class SwapNumbers {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter number 1");
		int num1= sc.nextInt();
		System.out.println("Enter number 2");
		int num2= sc.nextInt();
		System.out.println("Before swapping : num1= "+num1+" num2 = "+num2);
		int num3= num1+num2; 
		num1=num2;
		num2=num3-num1; 
		num1=num3-num2;
		System.out.println("After swapping : num1= "+num1+" num2 = "+num2);



	}
}
