package coll;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class MapDemo {

	public static void main(String[] args) {
		//		interface Map
		Map<String, Integer> map = new HashMap<>();
		map.put("Yogendra", 30);
		map.put("Jairaj", 65);
		map.put("Jyoti",  87);
		map.put("Harman", 77);
		System.out.println(map);
		map.put("Jyoti", 65);
		System.out.println(map);
		boolean containsKey = map.containsKey("Jyoti");
		System.out.println(containsKey);
		Integer marksy = map.get("Yogendra");
		Set<String> keySet = map.keySet(); //Control 2 + L
		System.out.println(keySet);
		boolean containsValue = map.containsValue(65);
		System.out.println(containsValue);
		Collection<Integer> values = map.values();
		System.out.println(values);
		class Student { 
			int roll; String name; String branch;
			public String toString() { return "Student ( " + roll + "," + name + "," + branch + ")"; } 
			public Student(int roll, String name, String branch) {
				super();
				this.roll = roll;
				this.name = name;
				this.branch = branch;
			} 

		}
		Map<Integer, Student> mapStudents = new HashMap<>();
		Scanner sc = new Scanner(System.in);
		for(int i = 1; i<=1; i++)
		{
			System.out.println("enter roll " );
			int roll = sc.nextInt(); sc.nextLine();
			System.out.println("enter name");
			String name = sc.nextLine();
			System.out.println("enter branch");
			String branch = sc.nextLine();
			Student s = new Student(roll, name, branch);
			mapStudents.put(roll,  s);
		}
		System.out.println(mapStudents);
		//Student : enter roll 123 
		// enter name : Dinesh Kumar
		// enter branch : CSE
		//				Student s = new Student(roll, name, branch);
		//				map.put(123, student);

		//		1. 
		//		2. Map of frequency 
		//		critical
		//		c 2  		r 1		i 2		t 1		a 1		l 1
		//		3. Check a string can be palidrome or not
		System.out.println("enter a word");
		String word = sc.next();
		Map<Character, Integer> fmap = new HashMap<>();
		for(int i=0; i<word.length(); i++)
		{
			char ch = word.charAt(i);
			if(fmap.containsKey(ch))
			{
				fmap.put(ch, fmap.get(ch) + 1);
			}
			else fmap.put(ch, 1);
		}
		System.out.println(fmap);
		Collection<Integer> values2 = fmap.values();
		int countOdd= 0;
		for(int x : values2)
		{
			if(x%2 == 1) countOdd++;
		}
		if(countOdd < 2) System.out.println("yes can be palindrom");
		else System.out.println("NO");

	}

}
