package assignment;

public class CalculateAverageUsingArray {

	public static void main(String[] args) {
		int array[]= {12,5,6,89,0,7,56,43};
	    double average;
	    int sum=0;
		for(int i=0;i<array.length;i++) {
			sum=sum+array[i];	
		}
		average=sum/array.length;
		System.out.println(" Average of all elements in array is: "+average);
	}

}
