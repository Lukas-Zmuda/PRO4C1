package edu.zaklady;
public class Tester {

	public static void main(String[] args) {
		
		//deklaracia a inicializacia objektu
		Ziak z = new Ziak();
		
		z.meno = "Jan";
		z.priezvisko = "Hrasko";
		z.trieda = "1.A";
		
		Ziak z2 = new Ziak();
		z2.meno = "Fero";
		
		System.out.println(z.celeMeno());
		//System.out.println(z2.celeMeno());
		
		z.info();
		
		z.zmenTriedu("3.A");
		z.info();
		z2.info();
		
		Ziak z3 = new Ziak("Peter", "Pan", "1.C");
		z3.info();
		
		Ziak z4 = new Ziak("Jan", "Hus");
		z4.info();
		
	}

}
