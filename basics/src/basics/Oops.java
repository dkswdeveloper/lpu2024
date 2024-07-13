/*
 * package basics;
 * 
 * import java.sql.Date; import java.time.LocalDate; // public class Oops {
 * 
 * // Abstraction : view , my view of the class, interface or module // Problem
 * : Hostel Accomodation // Collection of common data and behaviour of the
 * objects // My view of a class to solve a particular problem Abstraction
 * changes with problem, person solving it, class Student { int roll; String
 * name; String fatherName; String email; String phone; int hostelNum; int
 * roomNum; private Date dob; private int age;
 * 
 * //return age in years public int getAge() { // return age; Date today =
 * Date.valueOf(LocalDate.now());
 * 
 * } } // Encapsulation : to put in capsule Implementation of abstraction (what
 * data and what behaviour (methods)) Hide the data and provide the
 * implementation of the function
 * 
 * Inheirtance : Phenomenon where one class inherits the properties and
 * behaviour of another class. Super class Base class Sub class : Derived class
 * Every object of the sub class contains the super class portion Order of
 * Constructor Calls: Ist Super class constructor Subclass class constructor We
 * use the keyword super to call the constructor super must be the 1st statement
 * in sub class constructor Reusablity of a class
 * 
 * Polymorphism : Same name : Different Implementation Compile Time
 * Polymorhphism : implemented using Overloading: Overloading : same name of
 * function , but differnt arguments int sum(int a, int b) int sum(int a[]) int
 * sum(int a[], int n) sum(2,3) sum(new int[] {3,4,5}) sum(new int[] {3,4,5}, 2)
 * 
 * Run time polymorphism is implemented by Overriding
 * 
 * Overriding : Defining a function with same name and same arguments as there
 * is one in super class
 * 
 * Inheritance : sub class has same method as in the base class e.g. Object :
 * toString() class Student { public String toString() { //overriding return
 * "Student " + name + "," + roll; } } Object ob = new Student(12, "Dinesh");
 * Super class variable = Derived class object allowed Person p = new
 * Student(12, "Sumit"); p.toString() : it will call derived class (sub class)
 * method
 * 
 * 
 * 
 * public int calculateSum(int a[]) { int s= 0; for(int x : a) s += x;
 * System.out.println(s); // bad return s; } Same for one class : class
 * SavingAccount { int balance ; int acno; } class GovtBond { int acno; int
 * balance; int custid;
 * 
 * } SavingAc, FD, LoanAccount ... int sum(Account ac[]) { ac.getBalance(); keep
 * on adding it } code : closed for changes open for new features Item Book
 * Magzine Report Member Student Faculty Clerk issue(Item item, Member member) {
 * 
 * } Account Bond similar data and behaviour (NOT SAME) WRONG INHERITANCE
 * 
 * INTERFACE BookDao : find, findAll, findByAuthor MagzineDao :
 * compareBookAndMagzine() Not Relevant
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * }
 */