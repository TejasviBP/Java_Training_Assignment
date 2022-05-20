package assignment;

import java.util.Arrays;

public class LargestElementOfArray {
public static void main(String[] args) {
	 int array[]= {12,34,5,78,90,23,45,67};
	Arrays.sort(array);
	System.out.println(Arrays.toString(array));
	System.out.println("Largest number of list is: "+array[array.length-1]);
}
}
