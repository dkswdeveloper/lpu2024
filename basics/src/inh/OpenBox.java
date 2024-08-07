package inh;

public class OpenBox extends Box {
	
	public OpenBox(double len, double wid, double ht) {
//		System.out.println("consructor called"); //error : super must be first statment in the constructor
		super(len, wid, ht); // call the super class constructor
	}

	// len wid ht
	//getLen getWid getHt setLen setWid setHt
	// volume() get it from base class
	//surfaceArea() write my own
	// Overriding : phenomenon of defining a method in derived class with same
	// name and same arguments as there is in the base class
	// defining a method of base class again
	@Override 
	public double surfaceArea() {
		return len*wid + 2*(wid*ht + ht * len);
	}

}
