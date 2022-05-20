package collectionDemo;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {
// set is basically an interface 
	// hashset and treeset (sorted) are its implementation
	/* 
	set properties: unordered collection
	               duplicates are not allowed
	               has implementation such as HashSet, TreeSet, linkedHashSet
	*/
	public static void main(String[] args) {
		Set <Integer> hash = new HashSet<>();
		hash.add(10);
		hash.add(34);
		hash.add(45);
		hash.add(78);
		hash.add(56);
		hash.add(34);
		System.out.println(hash+" ");
		
		Set<String> tree= new TreeSet<>();
		tree.add("ABC");
		tree.add("DEF");
		tree.add("GHI");
		tree.add("JKL");
		tree.add("JKL");
		System.out.println(tree+" ");
		
		Set<Character> linkedHash= new LinkedHashSet<>();
		linkedHash.add('A');
		linkedHash.add('B');
		linkedHash.add('B');
		linkedHash.add('C');
		linkedHash.add('D');
		for(char c:linkedHash) {
			System.out.println(c +" ");
		}
		System.out.println(linkedHash +" ");
	}

}
