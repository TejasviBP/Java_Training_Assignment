package arrayDemo;

public class ArrayReverse {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char temp;
		String str="";
String [] array = {"rahul", "saurabh", "gaurav"};
for(int i=0; i<=2; i++) {
	System.out.println(array[i]);
	String array1=array[i];
	char [] ch= array1.toCharArray();
	i++;
	
	for(int j=0; j<= ch.length-1; j++) {
	temp= ch[j];
	str= temp+ str;
	str= str.toString();

	}

	System.out.println(str);
		
}
	
}
}