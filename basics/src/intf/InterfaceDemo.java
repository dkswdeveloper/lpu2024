package intf;
//Interface is a contract in the form of methods 
//a class that impleements the interface must override all the abstract
//methods of the interface
//interface contains 
//	1. Declaration of methods (Abstract methods: incomplete methods) that subclass
//		will implement
//	2. public static final DATA (Constants)
//	3. Default Methods (Methods with definintion, subclass can or can not override them)
//	4. Static methods 
// backlog class (11/6/2024)
// 12111592 Aditya Sharma ECE216 11 TO 12
// 12202255 Mourya Kumar PFA306R 11 TO 12

import inh.Figure;

interface Picture
{
	public static final int BLACK = 0, WHITE = 1; //
	public void draw();
	public void printDimensions();
	public default void show() {
		System.out.println("Default method to show picture");
	}
	public static void showAll() {
		System.out.println("Static method to show all pictures");
	}
}
class RectangularPicture implements Picture
{
	public void draw()
	{
		System.out.println("Rectangle is drawn");
	}
	public void printDimensions() {
		System.out.println("len and wid");
	}
}
class CircularPicture extends Figure implements Picture
{
	public void draw()
	{
		System.out.println("Cicle is drawn");
	}
	public void printDimensions() {
		System.out.println("rad");
	}
}
public class InterfaceDemo {
	public static void main(String[] args) {
//		Picture p = new Picture(); //error
		Picture p = new RectangularPicture();
		p.draw();
		p = new CircularPicture();
		p.draw();
	}
}
