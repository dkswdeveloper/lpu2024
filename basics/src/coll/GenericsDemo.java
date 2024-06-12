//package coll;
//class MyStack<T>
//{
//	Object[] a;
//	int top;
//
//	public MyStack() {
//		super();
//		a = new Object[10];
//		top = -1;
//	}
//
//	public void push(T x) throws Exception
//	{
//		if(top >= a.length-1) throw new Exception("Overflow");
//		a[++top] = x;
//	}
//	public T pop() throws Exception
//	{
//		if(top == -1) throw new Exception("Underflow");
//		return (T) a[top--];
//	}
//}
//public class GenericsDemo {
//	public static void main(String[] args) {
//		int i = 4; 
////		boolean, byte, char, short, int, long, float , double
//		Boolean, Byte, Character, Short, Integer, Long, Float, Double : Wrapper classes
//		with Generics, We can NOT use BASIC DATA TYPES
//		GENERICS : WRAPPER CLASSES for Basic Data Types
//		
//		String str = "Dinesh";
//		Integer j = 4 ; // Integer j = new Integr4) ; AUTOBOXING
//		int a ; //default value 0
//		Integer b; // default value : null
//		MyStack<Integer> stki  = new MyStack<>();
//		MyStack<String> stks = new MyStack<>();
//		try
//		{
//			stki.push(23);
//			stki.push(24);
//			stki.push(236);
//			stki.push(231);
//			
//			stks.push("java");
//			stks.pop();
//			stks.pop();
//			
//		}
//		catch(Exception e)
//		{
//			System.out.println(e);
//		}
//
//	}
//}
//
//
//
//
//
//
//
//
//
//
//
