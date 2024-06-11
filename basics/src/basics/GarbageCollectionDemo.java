package basics;

public class GarbageCollectionDemo {
//	main control space
	public static void main(String[] args) {
		// with control pressed all variable, class, methods become link
		Student student = new Student();
		student.name = "Dinesh";
		student.roll = 234;
		student.branch = "CSE";
		Student student2 = new Student();
		student2.name = "Akash";
		student2.roll = 235;
		student2.branch = "CSE";
		
		student = student2;
		System.gc();
		
		
	}

}
