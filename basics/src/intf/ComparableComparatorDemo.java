package intf;
import java.util.Arrays;
import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
class Student implements Comparable<Student>
{
	int roll;
	String name;
	int marks;
	public Student(int roll, String name, int marks) {
		this.roll = roll;
		this.name = name;
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", marks=" + marks + "]";
	}
	@Override
	public int compareTo(Student o) {
		// 2 students : this and o 
		if(this.roll < o.roll) return -1;
		if(this.roll > o.roll) return 1;
		return 0;
	};

}
class StudentMarksComparator implements Comparator<Student>
{
	@Override
	public int compare(Student o1, Student o2) {
		return o1.marks - o2.marks;
	}
}
class StudentNameComparator implements Comparator<Student>
{
	@Override
	public int compare(Student o1, Student o2) {
		return o1.name.compareTo(o2.name);
	}
}

public class ComparableComparatorDemo {
	public static void main(String[] args) {
		Student s1 = new Student(123, "Sumit", 34);
		Student s2 = new Student(127, "Kishor", 32);
		Student s3 = new Student(124, "Geet", 12);
		Student s4 = new Student(126, "Amit", 44);

		Student[] ar = { s1,s2,s3,s4};
		Arrays.sort(ar);
		System.out.println(Arrays.toString(ar));
		StudentMarksComparator comparator = new StudentMarksComparator();
		Comparator<Student> comparatorLambda = (Student o1, Student o2) -> {
			return o1.marks - o2.marks;
		};

		Comparator<Student> comparatorLambda2 = (o1, o2) -> o1.marks - o2.marks ;
		// java.util.function Predicate Function Consumer Create an object of each and call methods on them
		Consumer<String>  consumer = new Consumer<String> () { 
			public void accept(String t) {
				System.out.println(t);
			}
		};
		Consumer<String>  consumer2 = (t) -> {
				System.out.println(t);
		};
		Consumer<String>  consumer3 = (t) -> System.out.println(t) ;
		Consumer<String>  consumer4 = t -> System.out.println(t) ;
		
		consumer3.accept("Java");
		consumer3.accept("Lambda");
		
		
		consumer.accept("hello");

		Predicate<String> predicate = new Predicate<String>() {

			@Override
			public boolean test(String t) {
				if(t.length() > 5 ) return true;
				else return false; 
			}
		};
		Predicate<String> predicate2 = (String t) -> {
			if(t.length() > 5 ) return true;
			else return false;
		} ;
		Predicate<String> predicate3 = (t) -> t.length() > 5  ;
		
		
		boolean value = predicate.test("hello");
		System.out.println("value=" + value);

		Function<String, Integer> function = (str) -> { return str.length(); } ;
		Function<String, Integer> funStrToLen = str -> str.length() ;
		
		int ans = function.apply("hello");
		System.out.println("ans=" + ans);



		Arrays.sort(ar, comparator);
		System.out.println(Arrays.toString(ar));
		StudentNameComparator comparator2 = new StudentNameComparator();
		Arrays.sort(ar, comparator2);
		System.out.println(Arrays.toString(ar));
		Arrays.sort(ar, comparator2.reversed());
		System.out.println(Arrays.toString(ar));

		//Sort them using names, sort them using names in reverse order


	}
}
