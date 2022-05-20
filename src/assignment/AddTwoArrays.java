package assignment;

import java.util.Arrays;

public class AddTwoArrays {

	public static void main(String[] args) {
		int array1 [] = {5,6,7,8};
		int array2 [] = {1,2,3,4};
		int sum[]=new int[array1.length+array2.length];
	
		System.arraycopy(array2, 0, sum, 0,array2.length);
		System.arraycopy(array1, 0, sum, array2.length,array1.length);
		System.out.println(Arrays.toString(sum));
	
		 
	}

}
