
public class Metody {

	public static void main(String[] args) {
		
		vlozCiaru();
		
		pozdravSa("Lukas");
		
		vlozCiaru();
		vlozCiaru('*', 20);
		
		System.out.println(mocnina(12));
		int x = mocnina(13);
		System.out.println(mocnina(x + 1.12));
		
		String[] mena = vytvorPole(12, "nezname");
		vypisPole(mena);
		
	}
	
	//metoda bez navratoveho typu
	static void vlozCiaru() {
		System.out.println("----------");
	}
	
	static void pozdravSa(String meno) {
		vlozCiaru();
		System.out.println("Ahoj " + meno + "!");
		vlozCiaru();
	}
	
	static void vlozCiaru(String znak, int dlzka) {
		for(int i = 0; i < dlzka; i++) {
			System.out.print(znak);
		}
		System.out.println();
	}
	
	static void vlozCiaru(char znak, int dlzka) {
		for(int i = 0; i < dlzka; i++) {
			System.out.print(znak);
		}
		System.out.println();
	}
	
	static void vypisPole(String[] pole) {
		for(String prvok: pole) {
			System.out.print(prvok + ", ");
		}
		System.out.println();
	}
	
	//metody s navratovym typom
	
	static int mocnina(int cislo) {
		int vysledok = 0;
		vysledok = cislo * cislo;
		return vysledok;
	}
	
	static double mocnina(double cislo) {
		return cislo * cislo;
	}
	
	static String[] vytvorPole(int dlzka, String hodnota) {
		String[] pole = new String[dlzka];
		for(int i = 0; i < pole.length; i++) {
			pole[i] = hodnota;
		}
		return pole;
	}
	
	static int scitaj(int a, int b) {
		return a + b;
	}

}
