package edu.dedicnost;

public class Obdlznik extends Utvar{
	
	double dlzka, sirka;
	
	public Obdlznik(double x, double y, double dlzka, double sirka) {
		super(x, y);
		this.dlzka = dlzka;
		this.sirka = sirka;
	}
	
	public double obvod() {
		return 2 * (this.dlzka + this.sirka);
	}
	
	public void info() {
		System.out.println("Obdlznik na suradniciach[" + x + "," + y + "]d=" + dlzka + ", s = " + sirka);
	}

	@Override
	public double obsah() {
		return this.dlzka * this.sirka;
	}
	
	

}
