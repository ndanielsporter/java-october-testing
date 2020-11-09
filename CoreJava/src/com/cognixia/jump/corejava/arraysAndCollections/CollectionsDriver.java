package com.cognixia.jump.corejava.arraysAndCollections;

import java.util.*;

public class CollectionsDriver {

	public static void main(String[] args) {
		
		// Collections Framework - with Collection Interface and Map Interface as roots
		
		// Collection Interface
	
			// List
				// ArrayList - at EOD we must use a Concrete Class to do the work
				ArrayList<Integer> arrList = new ArrayList<Integer>();
				
				List<String> arrList2 = new ArrayList<String>();
				
				// adds to the end
				arrList.add(7);
				System.out.println(arrList);
				// adds 4 to element 0
				arrList.add(0, 4);
				System.out.println(arrList + " " + arrList.size());
				
				arrList.add(100);
				// remove based on index
				arrList.remove(2);
				
				arrList2.add("First");
				arrList2.add("Second");
				
				// remove based on contents
				boolean passed = arrList2.remove("Second");
				System.out.println(arrList);
				System.out.println(passed);
				System.out.println(arrList2);
	
				// LinkedList
				LinkedList<String> linkList = new LinkedList<>();
				List<Integer> linkList2 = new LinkedList<Integer>(arrList);
				
				linkList.add("Hello");
				linkList.add(0, "World");
				System.out.println(linkList);
				
				// Read - or access
				System.out.println(linkList.contains("Hello"));
				System.out.println(linkList.get(1));
				System.out.println(linkList.indexOf("World"));
				linkList.add("place");
				linkList.add("holder");
				
				// Update existing data
				linkList.set(0, "New");
				System.out.println(linkList);
	
			// Set
				linkList.add("Hello");
				HashSet<String> hs = new HashSet<>();
				HashSet<Integer> iSet = new HashSet<Integer>(8, 0.4f);
				HashSet<String> noDup = new HashSet<String>(linkList);
				
				System.out.println(linkList);
				System.out.println(noDup);
				
				// to loop or even just read from a set we use iterator
				// for each loop is read only
				for (String string : noDup) {
					if(string.equalsIgnoreCase("Hello")) {
						string = "World";
						System.out.println("We found the word");
					}
				}
				
				// we need a iterator with a while loop to do our update operations
				Iterator<String> value = noDup.iterator();
				while(value.hasNext()) {
					System.out.println(value.next());
				}
				System.out.println(noDup);
				
				List<String> LinkedList = new LinkedList<>(noDup);
				
//				noDup.remove("New");
//				noDup.add("World");
//				System.out.println(noDup);
				
			// Queue & Dequeue
				// LinkedList - polymorphism (change the LL behavior with
				Queue<String> qLinkList = new LinkedList<>(linkList);
				
				System.out.println(qLinkList);
				System.out.println(qLinkList.remove("place"));
				
				Deque<String> dQLinkList = new LinkedList<>(linkList);
					// Interfaces
	
		// Map Interface
	
			// HashMap and TreeMap (classes)
				
				Map<String, Integer> hashMap = new HashMap<String, Integer>();
				
				hashMap.put("nickel", 5);
				hashMap.put("penny", 5);
				hashMap.put("dime", 5);
				hashMap.put("quarter", 25);
				hashMap.put("nickel", 12);
				//hashMap.put(null, 5);
				
				System.out.println(hashMap.get("penny"));
				
				for (String key : hashMap.keySet()) {
					//System.out.println(string);
					if(key.equals("quarter") && key != null) {
						System.out.println("Found it!");
						System.out.println(hashMap.get(key));
					}
					System.out.println(key + " " + hashMap.get(key));
				}
				
				TreeMap<String, Integer> treeMap = new TreeMap<>(hashMap);
				
//				for (Integer entry : treeMap.entrySet()) {
//					System.out.println(entry);
//				}
	}
	
}
