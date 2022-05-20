package stringDemo;

public class StringBufferDemo {
// StringBuffer()   => It creates an empty String buffer with the initial capacity of 16.
	// StringBuffer and StringBuilder classes are used for creating mutable strings
	public static void main(String[] args) {
	
StringBuffer sf= new StringBuffer("teju");

// ujet 
System.out.println(sf.capacity());
System.out.println(sf.charAt(3));
System.out.println(sf.codePointAt(0));    //t e j u 
System.out.println(sf.substring(0, 2));   //0 1 2 3
System.out.println(sf.length());

System.out.println(sf.reverse()); 

	}

}
