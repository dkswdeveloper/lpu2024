package coll;

import java.io.Console;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

// 12/6
// 12106580 Shri Krishna Sales & Marketing class at 3 to 4 

public class SetDemo {
	
	public static void main(String[] args) {
//		Set<Integer> set = new HashSet<>();
		Set<Integer> set = new TreeSet<>();
//		List is ordered collection, Set is unordered collection 
		//insert in set
		boolean added = set.add(23); System.out.println(added); 
		added = set.add(98);  System.out.println(added);
		set.add(54); set.add(53); 
		added = set.add(23);  System.out.println(added);
		added = set.add(98); System.out.println(added);
		System.out.println(set.size());
		
		System.out.println(set);
		for(int x : set)
			System.out.println(x);
		Iterator<Integer> iterator = set.iterator(); //Control 2 + L
		while(iterator.hasNext())
		{
			int x = iterator.next();
			System.out.println(x);
		}
		List list = new ArrayList<>(); list.add(25); list.add(83); list.add(83); 
		set.addAll(list);
		System.out.println(set);
		
		set.remove(83);
		System.out.println(set);
		
//		Read a string from Console. Find number of different characters used to create
//		this string. 
//		ostentatious
//		o s t e n a i u
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the word");
		String word = sc.nextLine();
		Set<Character> setc = new HashSet<>();
		for(int i = 0; i<word.length(); i++)
		{
			char ch = word.charAt(i);
			setc.add(ch);
		}
		System.out.println(setc);
		
		
		
//		Read a line from the user. Find the number of characters used 
//		this is java for young guys.
//		t h i s j a v f o r y u n g . space 
//		
//		this is java for young guys. it is secure, distributed object oriented
//		programming .
//		java is compiled and the interpreted.
//		after compilation we get byte code and JVM is java interpretor that interprets
//		this code.
//		
//		set of common words : is am are have has this that and for in to out
//		Remove all duplicate words and unnecessory words from the input.
		
	}

}
