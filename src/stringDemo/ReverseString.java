package stringDemo;

public class ReverseString {

	public static void reverse(String str) {
		String original=str;
		String reverse="";
		for(int i=0;i<str.length();i++) {
			char c=str.charAt(i);
			reverse= c+reverse;
			reverse= reverse.toString();
		}
		System.out.println(reverse.toLowerCase());	
	}


	public static void main(String[] args) {
		reverse("HarrY");	
	}
}
