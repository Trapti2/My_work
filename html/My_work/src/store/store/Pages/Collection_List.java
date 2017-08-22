package store.store.Pages;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class Collection_List {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("*************Array List******************");
		/*
		 *  
		 * List<String> list = Arrays.asList("Lars", "Simon");

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
        }*/

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
		System.out.println("contains? " + al.containsAll(al));
		al.forEach(System.out::println );
		al.add(2, "Anita");  
		System.out.println("contains? " + al.contains("Trapti"));
		System.out.println(al);
		System.out.println(al.remove(1));
		System.out.println(al);
		al.forEach(s->System.out.println(s));
		System.out.println("*************Array List******************");

		/*************************************************************************************/		
		
		System.out.println("*************Linked List******************");
		
		LinkedList<String> arrl = new LinkedList<String>();
        //adding elements to the end
        arrl.add("First");
        arrl.add("Second");
        arrl.add("Third");
        arrl.add("Random");
        System.out.println("Actual LinkedList:"+arrl);
        arrl.add(1, "rnd");
        arrl.addFirst("rnc");
        System.out.println("LinkedList:"+arrl);
        arrl.subList(0,2);
        System.out.println("Sub List: "+ arrl.subList(1,6));
        Iterator<String> itr = arrl.iterator();
       while(itr.hasNext()){
    	   itr.next();
       // System.out.println(itr.next());
       }
       
        List<String> list = new ArrayList<String>();
        list.add("one");
        list.add("two");
        arrl.addAll(list);
        System.out.println("After Copy: "+arrl);
        
        
        System.out.println("*************HashSet******************");
//     HashSet    
        HashSet<String> set=new HashSet<String>();  
        set.add("Ravi");  
        set.add("Vijay");  
        set.add("Ravi");  
        set.add("Ajay");  
        //Traversing elements  
        Iterator<String> itr2=set.iterator();  
        while(itr2.hasNext()){  
         System.out.println(itr2.next());  
        } 
        
        HashSet<String> hs = new HashSet<String>();
        //add elements to HashSet
        hs.add("first");
        hs.add("second");
        hs.add("third");
        System.out.println(hs);
        System.out.println("Is HashSet empty? "+hs.isEmpty());
        hs.remove("third");
        System.out.println(hs);
        System.out.println("Size of the HashSet: "+hs.size());
        System.out.println("Does HashSet contains first element? "+hs.contains("first"));
    
        System.out.println("*************Linked Hashset******************");
        //Linked Hashset
        LinkedHashSet<String> alr=new LinkedHashSet<String>();  
        alr.add("Ravi");  
        alr.add("Vijay");  
        alr.add("Ravi");  
        alr.add("Ajay");  
        Iterator<String> itr3=alr.iterator();  
        while(itr3.hasNext()){  
         System.out.println(itr3.next());  
        }  
        
        System.out.println("*************Tree set******************");
        //Tree set
        List<String> li = new ArrayList<String>();
        li.add("one");
        li.add("two");
        li.add("three");
        li.add("four");
        li.add("two");
        System.out.println("List: "+li);
        //create a treeset with the list
        TreeSet<String> myset = new TreeSet<String>(li);
        System.out.println("Set: "+myset);
        
        System.out.println("*************Hash map******************");
        //hashmap
        HashMap<String, String> hm = new HashMap<String, String>();
        //add key-value pair to hashmap
        hm.put("first", "FIRST INSERTED");
        hm.put("second", "SECOND INSERTED");
        hm.put("third","THIRD INSERTED");
        System.out.println(hm);
        if(hm.containsKey("first")){
            System.out.println("The hashmap contains key first");
        } else {
            System.out.println("The hashmap does not contains key first");
        }
        if(hm.containsKey("fifth")){
            System.out.println("The hashmap contains key fifth");
        } else {
            System.out.println("The hashmap does not contains key fifth");
        }
        
        System.out.println("*************TreeMap******************");
        TreeMap<String, String> hm1 = new TreeMap<String, String>();
        //add key-value pair to TreeMap
        hm1.put("first", "FIRST INSERTED");
        hm1.put("second", "SECOND INSERTED");
        hm1.put("third","THIRD INSERTED");
        System.out.println(hm1);
        Set<String> keys = hm1.keySet();
        for(String key: keys){
            System.out.println("Value of "+key+" is: "+hm1.get(key));
        }
        
        System.out.println("*************LinkedHashMap******************");
        LinkedHashMap<String, String> lhm = new LinkedHashMap<String, String>();
        lhm.put("one", "This is first element");
        lhm.put("two", "This is second element");
        lhm.put("four", "Element inserted at 3rd position");
        Set<String> keys1 = lhm.keySet();
        for(String k:keys1){
            System.out.println(k+" -- "+lhm.get(k));
        }
        
        
       
        // hashtable
        //Create hashtable instance
        Hashtable<String,String> ht = new Hashtable<String,String>();
        //add key-value pair to hashtable
        ht.put("first", "FIRST INSERTED");
        ht.put("second", "SECOND INSERTED");
        ht.put("third","THIRD INSERTED");
        System.out.println(ht);
        //getting value for the given key from hashtable
        System.out.println("Value of key 'second': "+ht.get("second"));
        System.out.println("Is Hashtable empty? "+ht.isEmpty());
        ht.remove("third");
        System.out.println(ht);
        System.out.println("Size of the Hashtable: "+ht.size());
	}

}
