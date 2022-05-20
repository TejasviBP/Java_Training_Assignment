package basicsofJava;

import java.util.Arrays;

public class Loops {

	public static void main(String[] args) {
		int num1=20;
		//If-else statement
		if(num1>0) {
			System.out.println("Number is even");
		}
		else {
			System.out.println("NUmber is odd");
		}

		//For loop
		for(int i=0; i<10;i++) {
			num1++;
			System.out.println(num1);
		}
		
		int arr[]= {10,30,5,80,70};
		for(int a:arr) {
			
			System.out.println(Arrays.toString(arr));
		}
		
	}

}
