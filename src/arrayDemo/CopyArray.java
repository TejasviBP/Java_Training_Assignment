package arrayDemo;

public class CopyArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
char [] array =  {'a', 'b', 'c', 'd', 'e'};
System.out.println(array);
char [] arraycopied = new char[5];
System.out.println("copying element");
System.arraycopy(array, 0, arraycopied, 0, 4);
System.out.println(arraycopied);

//deleting array elements

System.out.println("deleting element");
int delete=1;
for(int i=0; i<array.length; i++) {
	if(delete==i) {
	for(int j=i+1;j<array.length; j++) {	
		array[i]=array[j];
		}
	System.out.println(array);
	}

}

}
	}
