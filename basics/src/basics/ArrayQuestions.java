package basics;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayQuestions {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number of elements");
		int n = sc.nextInt();
		int[] a = new int[n];
		readArray(a, sc);
		printSumAvg(a);
		printLargerThanPrevAndNext(a);
		printLargerThanPrevAndNext(a);
		searchPositions(a, 1);
//		LocalDate class 12 12 2023 ,   1 3 2024  => 90 days
		
		
	}
	private static void printLargerThanPrevAndNext(int[] a) {
		// TODO Auto-generated method stub
		
	}
	private static int[] searchPositions(int[] a, int x) {
		int pos[] = new int[a.length];
		int index = 0;
		for(int i = 0 ;i<a.length; i++)
		{
			if(a[i] == x) pos[index++] = i;
		}
		pos  = Arrays.copyOf(pos, index);
		return pos;
		
	}
	private static void printSumAvg(int[] a) {
		int s = 0;
		double avg;
		for(int i = 0; i<a.length; i++)
		{
			s = s + a[i];
		}
		avg = (double)s/a.length;
		System.out.println("sum = " + s + ",avg=" + avg);
		
	}
	public static void readArray(int a[], Scanner sc)
	{
		for(int i = 0; i<a.length; i++)
		{
			a[i] =sc.nextInt();
		}
	}

}
