package accessModifiers;

public class UseOfPrivate {
 private void add(int a,int b) {
	int sum=a+b;
	System.out.println("Sum of a and b ="+sum);
 }
	
	 static void main(String[] args) {
	UseOfPrivate priv= new UseOfPrivate();
	priv.add(566677, 8899);

	}

}
