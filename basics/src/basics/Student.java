package basics;
// constructor, static, this

public class Student {
	public String name;
	public int roll;
	public String branch;
	public int age;
	
	public static int nextRoll = 101;
	
	
	public Student(String name, int roll, String branch, int age) {
		super();
		this.name = name;
//		this.roll = roll;
		this.roll =nextRoll; nextRoll++;
		this.branch = branch;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", roll=" + roll + ", branch=" + branch + "]";
	}
	
	@Override
	public void finalize()
	{
		System.out.println("Student with name " + name + " collected in garbage");
	}

	public Student(String name, int roll, String branch) {
		super();
		this.name = name;
//		this.roll = roll;
		this.roll =nextRoll; nextRoll++;
		this.branch = branch;
	}

	public Student() {
		super();
		this.roll =nextRoll; nextRoll++;
	}
	public void show()
	{
		System.out.println("name=" + name + ",roll=" + roll + ",branch=" + branch);
	}
	public Student older(Student s1) {
		//compare the age and return the older
		// 2 students : this , s1
		if(this.age > s1.age) return this;
		else return s1;
	}
	
	public static int getNextRoll() // not dependent on any object
	//will NOT be called by object
	{
		return nextRoll;
	}
}







