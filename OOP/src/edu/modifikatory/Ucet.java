package edu.modifikatory;

public class Ucet {
	
	//modifikatory pristupu: public, private, protected, ziaden
	//instancne premenne
	String nazov;
	private double zostatok;
	
	//konstruktory
	Ucet(String nazov, double zostatok) {
		this.nazov = nazov;
		this.zostatok = zostatok;
	}
	
	public Ucet(){
		this("prisne tajny", 0);
	}
	
	//metody	
	public void info() {
		System.out.println("Ucet: " + this.nazov + " | zostatok: " + this.zostatok);		
	}
	
	void vklad(double suma) {
		if(suma > 0) {
			this.zostatok += suma;
			System.out.println("Vklad na ucet: " + this.nazov + " | " + suma);
		}else {
			System.out.println("Nepovolena operacia! (vklad=" + suma + ")");
		}
	}
	
	void vyber(double suma) {
		if(suma > 0) {
			if(suma > this.zostatok) {
				System.out.println("Nedostatocne prostriedky na ucte!(" + suma + ")");
			}else {
				this.zostatok -= suma;
				System.out.println("Vyber z uctu: " + this.nazov + " | " + suma);
			}
		}else {
			System.out.println("Nepovolena operacia! (vyber=" + suma + ")");
		}
	}
	
	
}
