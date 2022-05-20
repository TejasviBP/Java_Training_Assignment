package collectionDemo;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {

	/* 
	 Map is an interface
	 Hashmap implements map
	 TreeMap, LinkedHashMap,hashtable are all implements map

	 */
	public static void main(String[] args) {
		Map<String, Integer> map= new HashMap<>();
		map.put("E", 82);
		map.put("A", 55);
		map.put("D", 73);
		map.put("C", 85);
		map.put("B", 95);
		
		for(Map.Entry entry:map.entrySet()) {
			System.out.println(entry.getKey()+" : "+entry.getValue());
		}

		map.containsKey("B");
		map.put("F", null);
		map.put("X", null);
		map.put(null, 78);
		map.put(null, 50);   // allows only 1 null key
		
		System.out.println(map.entrySet());
	}
}
