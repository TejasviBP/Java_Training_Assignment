package stringDemo;

public class StringBuilderClass {

	public static void main(String[] args) {
		StringBuilder st = new StringBuilder("School");
		System.out.println(st.capacity());
		StringBuilder str=st.append(" Nursury");
		System.out.println(str);
		System.out.println(st.append('T'));
		System.out.println(st.reverse());

	}

}
