package inh;

public class RuntimePolyFigure {
	public static void main(String[] args) {
		Figure f = new Figure();
		Figure f2 = new Figure();
		Rectangle r1 = new Rectangle (5,3);
		Rectangle r2 = new Rectangle (5,4);
		Circle c1 = new Circle(5);
		Circle c2 = new Circle(4);
		
		System.out.println(f.area());
		System.out.println(r1.area());
		System.out.println(c1.area());
		
		f = r1; System.out.println(f.area());
		f = c1; System.out.println(f.area());
		
		System.out.println("sum=" + sum(f,f2));
		System.out.println("sum=" + sum(r1,r2));
		System.out.println("sum=" + sum(r1,c1));
		System.out.println("sum=" + sum(c1,c2));
		
		f = r1;
		System.out.println(f.area());
		double s = sum(3.5, 6.5);
		s = sum(3.5, 6.5, 23);
//		create an array of Figure of size 5
		Figure[] ar = new Figure[5];
		
//		Initialize the array with some 1 fugire 2 rectangle 2 circle
		ar[0] = new Figure(); ar[1] = new Rectangle(6,4);
		ar[2] = r1;
		ar[3] = new Circle(8);
		ar[4] = c1;
		
		s = sum(ar);
		System.out.println("sum of all figures in array = " +s);
		
//		overload sum method   public static double sum(Figure[] ar) 
//		that returns the sum of all the figures in the array.
		
	}
	public static double sum(Figure[] ar) {
		double s = 0;
		for(int i = 0; i<ar.length ; i++)
		{ s = s + ar[i].area(); }
		return s;
	}
	public static double sum(double d1, double d2) { return d1 + d2; }
	public static double sum(double d1, double d2, double d3) { return d1 + d2 + d3; }
	
	public static double sum(Figure f1, Figure f2)
	{
		return f1.area() + f2.area();
	}

}
