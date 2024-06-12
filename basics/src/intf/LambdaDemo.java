package intf;

//Functional Interface : an interface with only ONE ABSTRACT METHOD
interface Adder
{
	public int add(int a, int b);
}
class MyAdder implements Adder
{
	@Override
	public int add(int a, int b) {
		return a+b;
	}
}
public class LambdaDemo {
	public static void main(String[] args) {
		Adder adder = new MyAdder();
		System.out.println(adder.getClass());
		System.out.println(adder.add(4, 5));
		// ANONYMOUS CLASS
		Adder adder2 = new Adder() {
			public int add(int a, int b) { return a + b; }
		};
		adder2.add(4, 4);
		adder2.add(9, 9);
		System.out.println(adder2.getClass());
		
		Adder adder3 = (int a,int b) -> { return a + b; } ;
		Adder adder4 = (a,b) -> { return a + b; } ;
		Adder adder5 = (a,b) -> a + b    ;
		
		
	}
}







