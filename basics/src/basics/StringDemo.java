package basics;

public class StringDemo {
	public static void main(String[] args) {
		String s1 = "java";
		String s2 = "java";
		String s3 = "JAVA";
		String s4 = new String ("java");
		String s5 = new String ("java");
		
		System.out.println(s1 == s2);
		System.out.println(s2 == s3);
		System.out.println(s4 == s5);
		System.out.println(s1 == s4);
		System.out.println();
		System.out.println(s1.equals(s2));
		System.out.println(s2.equals(s3));
		System.out.println(s4.equals(s5));
		System.out.println(s1.equals(s4));
	}

}
