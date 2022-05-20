package exceptionHandling;

public class FinalizeUse {
	 final int a=8;
	void divide(){
		int b=a/8;
		throw new ArithmeticException("Exception caught");
	}
	
	
 public static void main(String[] args) throws Throwable {
	 FinalizeUse fs= new FinalizeUse();
	 fs.divide();
	 fs.finalize();
}
}
