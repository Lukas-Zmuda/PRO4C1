package edu.dedicnost;

public class Tester {

	public static void main(String[] args) {


		Kruh k = new Kruh(1, 1, 10);
		k.x = 10;
		//k.info();
		
		Obdlznik o = new Obdlznik(0, 0, 12, 13);
		//o.info();
		
		Utvar uk = new Kruh(0, 0, 100);
		
		Utvar[] utvary = new Utvar[4];
		utvary[0] = k;
		utvary[1] = o;
		utvary[2] = new Kruh(12,12, 70);
		utvary[3] = new Obdlznik(11,11, 50, 100);
		
		for(Utvar u: utvary) {
			if(u instanceof Kruh) {
				System.out.println("Info o kruhu:");
			}else if(u instanceof Obdlznik) {
				System.out.println("Info o obdlzniku:");
			}else {
				System.out.println("Neznamy typ:");
			}
			u.info();
			
		}
		
		//utvary[2].info();
		
	}

}
