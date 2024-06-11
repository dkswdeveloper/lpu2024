package inh;

public class Circle extends Figure 
{
	double rad;

	public Circle(double rad) {
		super();
		this.rad = rad;
	}
	@Override
	public double area()
	{
		return Math.PI * rad *rad;
	}
}
