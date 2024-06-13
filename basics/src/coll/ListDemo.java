package coll;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class ListDemo {
	public static void main(String[] args) {
//		List<Integer> list = new ArrayList<>();
		List<Integer> list = new LinkedList<>();
		
		//insertions
		list.add(23); list.add(93); list.add(23); list.add(55); //repetitions are allowed
		System.out.println(list);
		list.add(0,  99); 
		System.out.println(list);
		list.set(0, 101);
		System.out.println(list);
		System.out.println(list);
		List<Integer> list2 = new ArrayList<>(); list2.add(87); list2.add(199);
		list.addAll(list2);
		System.out.println(list);

		//search
		int index = list.indexOf(199); System.out.println("index of 199 = " + index);
		index = list.indexOf(1995); System.out.println("index of 1995 = " + index);
		boolean contains87 = list.contains(87);
		System.out.println(contains87);
		list.containsAll(list2);
		int indexOf = list.indexOf(23);
		int lastIndexOf = list.lastIndexOf(23);
		System.out.println(indexOf + ","  + lastIndexOf);

		//deletion from a list
		list.remove(2);
		System.out.println(list);
		//		list.remove(199); //assume 199 is the index  //error
		list.remove(new Integer(199));
		System.out.println(list);
		list.removeAll(list2);
		for(int i  = 1; i<= 30; i++ ) list.add(i);
		System.out.println(list);
		//remove all multiple of 5 
		list.removeIf( (x) -> x %5 == 0);
		System.out.println(list);

		//Some other methods 
		System.out.println(list.get(2));
		System.out.println(list.size());
		//		list.sort((a,b) -> a - b );
		Collections.sort(list);

		System.out.println(list);
		for(int i = 0 ;i<list.size(); i++) System.out.println(list.get(i));

		for(int x : list) System.out.println(x);

		list.forEach(x -> System.out.println(x));

		//		1. print the repeated elements in the list
		//		2. remove all alternate elements from the list 1 2 3 4 5 6 7 8 =>  1 3 5 7 
		//		3. Remove all repeated elements from the list so that each eleemnt is once only
		//			1 2 3 2 3 4 5 6 7 7 => 1 2 3 4 5 6 7
	}

	public static void practice(String[] args) {
		String words[]  = { "Java", "DBMS", "Interface", "class", "List", "Set" };
		String[] smallWords = findSmallWords(words, 4); //all words with length<= 4
		System.out.println(Arrays.toString(smallWords));
		String word = "class";
		int index = indexOfWord(words, word); 
		//search word, if found return index else reutrn -1 

	}
	private static int indexOfWord(String[] words, String word) {
		for(int i = 0;i<words.length; i++)
		{
			if(words[i].equals(word) ) return i;
		}
		return -1;
	}
	private static String[] findSmallWords(String[] words, int len) {
		String smallWords[] = new String[words.length];
		int i  = 0;
		for(String w : words)
		{
			if(w.length() <= len) smallWords[i++] = w;
		}
		return Arrays.copyOf(smallWords, i);
	}

}
