package collectionDemo;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapDemo {
	
void student(){
	Map<String, Character> treemap= new TreeMap<>();
	treemap.put("Revati", 'A');
	treemap.put("Pooja", 'B');
	treemap.put("Mahesh", 'C');
	treemap.put("Suresh", 'D');
	treemap.put("Amar", 'E');
	for(Map.Entry mp: treemap.entrySet()) {
	
		System.out.println("Student "+mp.getKey()+" is belongs to "+mp.getValue()+" division");	
	}
}
	
public static void main(String[] args) {
	TreeMapDemo demo= new TreeMapDemo();
	demo.student();
}
}
