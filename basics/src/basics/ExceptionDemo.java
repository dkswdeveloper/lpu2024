package basics;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOError;
import java.io.IOException;
import java.util.Scanner;
class NumberNotFoundException extends Exception
{
	
}
class NumberOutOfRangeException extends Exception 
{
	
}
public class ExceptionDemo {
	public static void main(String[] args) 
			throws NumberOutOfRangeException, FileNotFoundException, IOException
	{
		Scanner sc = null ; 
		try
		{
			sc = new Scanner(System.in);
			System.out.println("enter 2 integers between 1 to 10");
			int x = sc.nextInt();
			int y = sc.nextInt();
			if(x > 10 || y > 10)
			{
				NumberOutOfRangeException obj = new NumberOutOfRangeException();
				throw obj;
			}
			int z = x/y;
			System.out.println("quotient = " + z);

			String str = "java";
			String str2 = str;
			System.out.println("len = " + str2.length());
			int a[] = { 1,2,3,4};
			System.out.println("enter index of element in array");
			int i = sc.nextInt();
			System.out.println(a[i]);
			
 		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e);
		}
		catch(NullPointerException e)
		{
			System.out.println(e);
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
//		catch(Exception e)
//		{
//			System.out.println("some other exception " + e);
//		}
		finally 
		{
			sc.close(); //Scanner must always be closed either exception occurs or not
			System.out.println("scanner is closed");
		}
		
		
		printFile("./src/basics/ArrayQuestions.java");
		System.out.println("bye");
		
		try {
			int index = find(new int[] {1,2,3,4,5}, 3);
			System.out.println("found at " + index);
		} catch (NumberNotFoundException e) {
			e.printStackTrace();
		}
		try {
			f1();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		
	}
	public static void printFile(String fileName) throws FileNotFoundException, IOException
	{
		FileReader fr = new FileReader(fileName);
		int ch = 0;
		while(ch != -1)
		{
			ch = fr.read();
			System.out.print((char) ch);
		}
		fr.close();
	}
	
	public static int find(int a[], int x) throws NumberNotFoundException
	{
		//write a function to searrch x in the array and return its index, if not found
		//  throw an exception NumberNotFoundException
		// call it in main
		for(int i = 0 ;i<a.length; i++)
		{
			if(x == a[i]) return i;
		}
		NumberNotFoundException e = new NumberNotFoundException();
		throw e;
	}
	public static void f1()
	{
		f2();
	}
	public static void f2()
	{
		f3();
	}
	public static void f3()
	{
		f4();
	}
	public static void f4()
	{
		throw new RuntimeException("exception in f4()");
	}

}














