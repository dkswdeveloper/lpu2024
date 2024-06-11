package inh;

public class Rectangle extends Figure {
	double len , wid;
	
	public Rectangle(double len, double wid) {
		super();
		this.len = len;
		this.wid = wid;
	}

	@Override
	public double area()
	{
		return len*wid;
	}

}
