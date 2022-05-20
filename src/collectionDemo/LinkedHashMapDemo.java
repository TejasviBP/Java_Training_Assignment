package collectionDemo;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapDemo {
 public static void main(String[] args) {
		Map<Integer, Integer> linkMap= new LinkedHashMap<>();
		linkMap.put(1, 20);
		linkMap.put(5, 18);
		linkMap.put(7, 17);
		linkMap.put(8, 14);
		linkMap.put(4, 19);
		System.out.println(linkMap.entrySet());
}
}
