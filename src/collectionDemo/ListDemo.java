package collectionDemo;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {

	public static void main(String[] args) {
		List list1= new ArrayList();
		list1.add("abc");
		list1.add(10);
		list1.add(90);
		list1.add(80);
		list1.add(40);
		
		List list2= new ArrayList();
		list2.add("abc");
		list2.add("pqr");
		list2.add("xyz");
	
		int a=list1.size(); //5
		int b= list2.size();
		System.out.println(list1);
		System.out.println(list2);

	
		
	}

}
