package algo;

public class StringAlgo {
	// an algo that shifts first 2 characters of the string to the last
	//Input : non null string 
	// if string length is < 2 , throws IndexOutOfBoundsException  
	// if string length is < 2 , return the input string back 
	// else it returns it returns a string with first two chars replaced at last
	
	// hello -> llohe
	// program -> ogrampr
	// sumit -> mitsu
	
	// Test it for 3 conditions
	/*
	 * 1. normal 
	 * 2. Boundary Values test it for 0, 1, 100 
	 * 3. Test for exceptional conditions 0, null, required length < or > , 
	 */
	public String shiftBy2Chars(String str)
	{
		String start2 = str.substring(0, 2);
		String end = str.substring(2);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		String ans = end + start2;
		return ans;
	}

}
