package collectionDemo;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorDemo {
	public static void main(String[] args) {
		List list= new LinkedList();
		list.add(10);
		list.add(20);
		list.add(30);
		
		System.out.println("original list is "+list);
	ListIterator it = list.listIterator();
	
	// Traversing elements in forwarding direction.
	  System.out.println("Forward Direction Iteration:");

	while(it.hasNext())
	{
	  System.out.println(it.next());			
	}
	// Traversing elements in the backward direction. The ListIterator cursor is at just after the last element.
	   System.out.println("Backward Direction Iteration:");

	while(it.hasPrevious())
	{
	  System.out.println(it.previous());			
	}

	}
}
