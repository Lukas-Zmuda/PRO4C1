package edu.modifikatory;

public class TesterUcet {

	public static void main(String[] args) {
		
		Ucet moj = new Ucet("Moj paradny ucet", 120);
		
		moj.info();
		moj.vklad(100);
		moj.info();
		
		moj.vyber(100);
		moj.info();
		
		//moj.zostatok = -2000;
		moj.info();
		
		UcetZap m = new UcetZap("Moj ucet", 1000);
		System.out.println(m.getNazov());
		m.setNazov("Moj druhy ucet");

		System.out.println(m.getNazov());
	}

}
