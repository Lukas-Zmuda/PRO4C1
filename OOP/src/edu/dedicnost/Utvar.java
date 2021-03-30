package edu.dedicnost;

public class Utvar {
	
	double x,y;
	
		
	public Utvar(double x, double y) {
		this.x = x;
		this.y = y;
	}



	public void info() {
		System.out.println("Utvar na suradniciach[" + x + "," + y + "]");
	}

}
