package basics;

public class StaticDemo {
	public static void main(String[] args) {
		Student s1 = new Student("Akash", 10, "CSE");
		Student s2 = new Student("Prithvi", 10, "CSE");
		
		s1.nextRoll = 201; Student.nextRoll = 201;
		s2.nextRoll = 301; Student.nextRoll = 301;
		
		System.out.println(s1.nextRoll); 
		System.out.println(s2.nextRoll); 
		
		
		System.out.println(s1);
		System.out.println(s2);
		int next = Student.getNextRoll();
		
		
	}

}
