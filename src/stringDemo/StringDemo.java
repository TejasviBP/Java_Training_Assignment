package stringDemo;

public class StringDemo {
public static void main(String[] args) {
	//String can be created in two ways
	//using "new"  and using String literals
	String str= new String("   Hello World !");
	System.out.println(str);
	
	String str1= "Earth is beautiful planet";
	System.out.println(str1);
	//Handling Strings
	
	System.out.println(str.concat(str1)); //concat two strings
	System.out.println(str.trim()); // trim white spaces
	System.out.println(str.endsWith("!"));
	System.out.println(str.substring(4));
	System.out.println(str1.length());
	
 }
}
