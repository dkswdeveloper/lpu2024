package basics;

import java.util.Arrays;

import javax.management.RuntimeErrorException;

public class StringDemo2 {
	public static void main(String[] args) {
		String str = "    this is a string in java   ";
		System.out.println(str.charAt(10));
		System.out.println(str.charAt(11));
		System.out.println(str.charAt(23));
		System.out.println(str.length());
		char[] charArray = str.toCharArray();
		System.out.println(str.toCharArray());
		
		str = str.trim();
		System.out.println(str);
		
		System.out.println(str.startsWith("th"));
		int indexOf = str.indexOf('i');
		System.out.println(indexOf);
		int indexOf2 = str.indexOf("Java");
		System.out.println(indexOf2);
		String another = "this is another string ";
		System.out.println(another);
		int diff = str.compareTo(another);
		System.out.println(diff);
		System.out.println("apple".compareTo("aptech"));
		
		System.out.println(str.replace('i', 'Z'));
		System.out.println(str.lastIndexOf('i'));
		System.out.println(str.toUpperCase());
		
		String substring = str.substring(6);
		System.out.println(substring);
		String substring2 = str.substring(5, 11);
		System.out.println(substring2);
		
		String names = "Prathibha Jyoti Krishna Sambhav Aditya";
		String[] split = names.split(" ");
		System.out.println(Arrays.toString(split));
		System.out.println("words = " + split.length);
		names = "saching chawla, amit gupta, aditya, vivek";
		String[] split2 = names.split(",");
		System.out.println(Arrays.toString(split2));
		
		names = "Prathibha   Jyoti    Krishna Sambhav Aditya";
		System.out.println(names.split(" ").length);
		System.out.println(Arrays.toString(names.split(" ")));
		String teams = "sumit-amit, rajan-srishti-kartik, geeta-sunil";
		
		System.out.println(convertDate("12 - 4 - 1978"));
		System.out.println(convertDate("12.5.02"));
		System.out.println(convertDate("30-10- 05"));
		
		
		
	}
	public static String convertDate(String date)
	{
		String parts[] = null;
		if(date.contains("-"))
		{
			parts = date.split("-");
		}
		else if(date.contains("."))
		{
			parts = date.split("\\.");
		}
		else throw new RuntimeException("date invalid no . or - ");
		String day = parts[0].trim();
		if(day.length() < 2) day = "0" + day;
		
		String month = parts[1].trim();
		if(month.length() < 2) month = "0" + month;
		
		String year = parts[2].trim();
		if(year.length() == 2) 
		{
			int y = Integer.parseInt(year);
			if(y > 24) year = "19" + year;
			else year = "20" + year;
		}
		
		return day+month+year;
	}
	public static String toTitleCase(String str)
	{
		// I am Dinesh -> I Am Dinesh
		return null;
	}
}








