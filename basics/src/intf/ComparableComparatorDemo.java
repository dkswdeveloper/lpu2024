package intf;
import java.util.Arrays;
import java.util.Comparator;
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
