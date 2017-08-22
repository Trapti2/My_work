package script_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.TreeSet;

public class Java_Framework {

	public Java_Framework() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("*************Array List******************");


		List<String> list = Arrays.asList("Lars", "Simon");

		// alternatively
		List<String> anotherList = new ArrayList<>();
		anotherList.add("La");
		anotherList.add("Sim");


		// print each element to the console using method references
		list.forEach(System.out::println );

		anotherList.forEach(System.out::println );


		ArrayList<String> alist = new ArrayList<String>();  
		alist.add("Tutorials");  
		alist.add("Point");  
		alist.add("India PVT Limited");

		for(String s:alist) { 
			System.out.println(s);  
		}

		ArrayList<String> al = new ArrayList<>();
		al.add("Trapti");
		al.add("Ankit");
		al.add("Monika");
		al.add("Swati");
		al.size();
		al.get(1);
		System.out.println(al.size());
		System.out.println("at index 1 " + al.get(1));

		for(String s:al){
			System.out.println(s);
		}

		al.containsAll(al);
		al.forEach(System.out::println );
		al.add(2, "Anita");  
		System.out.println("contains? " + al.contains("Trapti"));
		System.out.println(al);
		System.out.println(al.remove(1));
		System.out.println(al);
		al.forEach(s->System.out.println(s));
		System.out.println("*************Array List******************");


		//linked list
		System.out.println("*************Linked List******************");
		LinkedList<String> ll = new LinkedList<String>();
		ll.add("Orange");
		ll.add("Apple");
		ll.add("Grape");
		ll.add("Banana");
		System.out.println(ll);
		System.out.println("Size of the linked list: "+ll.size());
		System.out.println("Is LinkedList empty? "+ll.isEmpty());
		System.out.println("Does LinkedList contains 'Grape'? "+ll.contains("Grape"));
		System.out.println("*************Linked List******************");


		//iterator
		String removeElem = "Perl";
		List<String> myList = new ArrayList<String>();
		myList.add("Java");
		myList.add("Unix");
		myList.add("Oracle");
		myList.add("C++");
		myList.add("Perl");
		System.out.println("Before remove: " + myList);
		Iterator<String> itr = myList.iterator();
		while(itr.hasNext()){
			System.out.println(itr.hasNext());
		}
		
		while(itr.hasNext()){
			
			if(removeElem.equals(itr.next())){
				itr.remove();
			}
		}
		System.out.println("After remove: " + myList);

		
		//tree set
		List<String> li = new ArrayList<String>();
        li.add("one");
        li.add("two");
        li.add("three");
        li.add("four");
        System.out.println("List: "+li);
        //create a treeset with the list
        TreeSet<String> myset = new TreeSet<String>(li);
        System.out.println("Set: "+myset);
        
        
        //tree set2
        TreeSet<String> ts = new TreeSet<String>();
        ts.add("one");
        ts.add("two");
        ts.add("three");
        System.out.println("Elements: "+ts);
        //check is set empty?
        System.out.println("Is set empty: "+ts.isEmpty());
        //delete all elements from set
        ts.clear();
        System.out.println("Is set empty: "+ts.isEmpty());
        ts.add("one");
        ts.add("two");
        ts.add("three");
        System.out.println("Size of the set: "+ts.size());
        //remove one string
        ts.remove("two");
        System.out.println("Elements: "+ts);
        
        
        //linked hashset
        LinkedHashSet<String> lhs = new LinkedHashSet<String>();
        //add elements to HashSet
        lhs.add("first");
        lhs.add("second");
        lhs.add("third");
        System.out.println("My LinkedHashSet content:");
        System.out.println(lhs);
        System.out.println("size: "+ lhs.size());
        System.out.println("Clearing LinkedHashSet:");
        lhs.clear();
        System.out.println("Content After clear:");
        System.out.println(lhs);


		// create a hash set
		HashSet hs = new HashSet();

		// add elements to the hash set
		hs.add("B");
		hs.add("A");
		hs.add("D");
		hs.add("E");
		hs.add("C");
		hs.add("F");
		System.out.println(hs);

	}


}
