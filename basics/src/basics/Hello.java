package basics;

import java.util.Arrays;
import java.util.Scanner;

public class Hello {

	public static void main(String[] args) {
		System.out.println("Hello LPU !!!!!!!");
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the word");
		String word= sc.next();
		printPattern(word); //control click 
		printPattern("Meenal");
		printPattern("Sumit");
		printPattern("Narendra");

		int[] a = { 2,3,4,5,1,2,3,7,8,3,10};
		int[] b = sumConsecutive(a);
		System.out.println(Arrays.toString(b));

		int ar[] = { 2,4,5,6,23,45,67, 0,0,0,0, 0, 0, 0};
		int n = 7, pos = 2, x = 99;
		insertInArray(ar, n, pos, x); // in array ar of n elements insert x at pos
		System.out.println("after insertion ");
		System.out.println(ar);
		
		int kr[] = {234,435,324,465,7,455,4,67,45,3,0,0,0};
		System.out.println("enter the index to be deleted");
		int index = sc.nextInt();
		System.out.println("before deleteion : " + Arrays.toString(kr));
		
		deleteFromArray(kr, index);
		System.out.println("after deleteion : " + Arrays.toString(kr));
//		int set1 = {324,5,34,54,87,65,5,4,,6,54,546,576,65}
//		int set2 = {324,55,34,574,,675,57,47,7,67,54,5746,576,65}
//		int intersection[] = new int[??]
		
	}

	private static void deleteFromArray(int[] kr, int index) {
		// loop to shift all elements 1 step ahead starting from index
		if(index >= kr.length) {
			ArrayIndexOutOfBoundsException e = new ArrayIndexOutOfBoundsException();
			throw e;
		}
		for(int i = index; i<kr.length-1; i++)
		{
			kr[i] = kr[i+1];
		}
		kr[kr.length - 1] = 0;
	
		
	}

	private static void insertInArray(int[] ar, int n, int pos, int x) {
		// loop to shift all elements by 1
		// insert x at proper position
		
		
	}

	private static int[] sumConsecutive(int[] a) {
		// adds first 2 and pustins array b, addes next 2, next 2, next 2 and keeps on adding in array b
		int len;
		if(a.length %2 == 0) len = a.length/2;
		else len = a.length/2 + 1;
		
		int[] b = new int[len];
		//write a loop to copy the elements
		for(int i = 0; i<len; i++)
		{
			if(2*i+1 < a.length)
				b[i] = a[2*i] + a[2*i+1];
			else b[i] = a[2*i];
			
		}
		return b;
	}

	private static void printPattern(String word) {
		for(int k = 1; k<= word.length(); k++)
		{
			//print k letters from the word
			for(int i = 0; i<k; i++)
			{
				System.out.print(word.charAt(i));
			}
			System.out.println();
		}
	}
	
//	 consider the array : int a[] = { 234,324,0,0,23, 0 , 0, 10, 12, 0 , 56, 0, 0 }
//	 countZeros(ar)
//	 countElementsBeforeFirstZero(ar)
//	 shiftZerosToEnd(ar)
//	 countZeorsInDigits(ar) count total zeros in all the digits [ 101, 10, 30, 33, 0, 100 ] => 6
	
	
	
	
	
	
	
	
	
	
	
	
	

}
