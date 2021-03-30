package edu.dedicnost;

public abstract class Utvar {
	
	double x,y;
	
		
	public Utvar(double x, double y) {
		this.x = x;
		this.y = y;
	}


	public abstract double obsah();
	
	public abstract double obvod();
	

	public void info() {
		System.out.println("Utvar na suradniciach[" + x + "," + y + "]");
	}

}
