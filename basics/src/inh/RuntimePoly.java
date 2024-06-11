package inh;

public class RuntimePoly {
	public static void main(String[] args) {
		Person p = new Person("Amit", 20);
		Student s= new Student("Sumit", 23, 405, "CSE");
		
		p = s; // allowed BASE = DERIVED, SUPER CLASS VARIABLE = SUBCLASS OBJECT
//		s = p; //Error
		
		System.out.println(p.getName());
		System.out.println(p.getAge());
		p.show();
		s.show();
	}

}
