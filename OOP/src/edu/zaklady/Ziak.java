package edu.zaklady;

class Ziak {

	//instancne premenne - fields
	String meno;
	String priezvisko;
	String trieda;
		
	//konstruktor
	Ziak(){
		meno = "nezname";
		priezvisko = "nezname";
		trieda = "neznama";
	}
	
	Ziak(String meno, String priezvisko, String trieda){
		this.meno = meno;
		this.priezvisko = priezvisko;
		this.trieda = trieda;
	}
	
	Ziak(String meno, String priezvisko){
		this(meno, priezvisko, "nepriradena");
	}
	
	//metody - schopnosti objektu
	
	/**
	 * Metoda vrati cele meno ziaka
	 * @return cele meno
	 */
	String celeMeno() {
		return meno + " " + priezvisko;
	}
	
	/**
	 * Metoda vypise kompletne informacie o ziakovi na konzolu:
	 * Meno a priezvisko:
	 * Trieda:
	 */
	void info() {
		System.out.println("Meno a priezvisko: " + celeMeno());
		System.out.println("Trieda: " + trieda);
	}
	
	/**
	 * Metoda zmeni triedu ziaka
	 * @param novaTrieda
	 */
	void zmenTriedu(String novaTrieda) {
		trieda = novaTrieda;
	}
	
}
