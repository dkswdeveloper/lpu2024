package basics;

public class ThisDemo {
	public static void main(String[] args) {
		Student s1 =new Student("Dinesh", 23, "CSE", 45);
		Student s2 =new Student("Piyush", 24, "IT", 20);
		s1.show();
		s2.show();
		Student old = s1.older(s2);
		System.out.println(old);
		
		
	}

}
