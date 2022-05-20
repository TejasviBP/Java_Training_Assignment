package basicsofJava;

public class DoWhileLoop {
	
	//Do while loop
	
	public static void main(String[] args) {
	
		int a=3;
		int i=1;
		int result;
		System.out.println("Table of 3");
		do {
			
			result=a*i;
			System.out.println(a+" * "+i+" = "+result);
			i++;
		}while(i<11) ;
			
		

	}

}
