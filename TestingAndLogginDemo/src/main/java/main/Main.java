package main;

import algo.StringAlgo;

public class Main {
	public static void main(String[] args) {
		StringAlgo algo = new StringAlgo();
		String input = "hello";
		String output = algo.shiftBy2Chars(input);
		System.out.println(output);
		
		input = "program";
		output = algo.shiftBy2Chars(input);
		System.out.println(output);

		input = "ab";
		output = algo.shiftBy2Chars(input);
		System.out.println(output);
		
		input = "a";
//		output = algo.shiftBy2Chars(input);
		System.out.println(output);
		
		int x = 1500000000;
		int y = 1500000000;
		System.out.println(x + y);
		
		
		
	}

}
