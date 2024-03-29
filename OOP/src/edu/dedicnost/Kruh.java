package edu.dedicnost;

public class Kruh extends Utvar {
	
	double polomer;
	
	public Kruh(double x, double y, double polomer) {
		super(x, y);
		this.polomer = polomer;
	}
	
		
	public void info() {
		System.out.println("Kruh na suradniciach[" + x + "," + y + "]r=" + polomer);
	}


	@Override
	public double obsah() {
		return Math.PI * this.polomer * this.polomer;
	}


	@Override
	public double obvod() {
		return 2 * Math.PI * this.polomer;
	}

}
