package edu.modifikatory;

public class UcetZap {
	
	//instancne premenne private
	private String nazov;
	private double zostatok;
	
		
	public double getZostatok() {
		return zostatok;
	}

	public void setZostatok(double zostatok) {
		this.zostatok = zostatok;
	}

	public String getNazov() {
		return nazov;
	}

	public void setNazov(String nazov) {
		this.nazov = nazov;
	}

	public UcetZap(String nazov, double zostatok) {
		this.nazov = nazov;
		this.zostatok = zostatok;
	}
	
	public void vklad(double suma) {
		if(suma > 0) {
			this.zostatok += suma;
			System.out.println("Vklad na ucet: " + this.nazov + " | " + suma);
		}else {
			System.out.println("Nepovolena operacia! (vklad=" + suma + ")");
		}
	}
	
	public void vyber(double suma) {
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
