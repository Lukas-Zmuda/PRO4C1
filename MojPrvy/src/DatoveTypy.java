
public class DatoveTypy {

	public static void main(String[] args) {
		
		//celociselne DT
		//deklaracia premennej
		int den;
		int prvyDenVTyzdni;
		
		den = 4;
		short x = 10, y = 10, z = 10;
		
		System.out.println("Lukas" + "Zmuda");
		System.out.println(den);
		System.out.println("den");
		
		System.out.println("den = " + den);
		System.out.println(den + x);
		System.out.println("den" + "x");
		System.out.println("10 + 5 = " + (10 + 5));
		
		int a = x;
		
		short mala =(short)a;
		
		System.out.println(mala);
		
		a = 123456789;
		
		mala = (short) a;
		System.out.println(mala);
		
		//desatinne DT
		float priemer = 12.36f;
		double priemer2 = 12.458;
		
		//znaky
		char zavinac = '@';
		
		zavinac = 64;
		System.out.println(zavinac);
		System.out.println("l.zmuda" + zavinac + "ostrovskeho.com");
		
		char unicode = '\u0123';
		System.out.println(unicode);
		
		//logicke hodnoty
		
		boolean prsi = false;
		prsi = true;
		System.out.println("prsi? " + prsi);
		
		//retazce
		String meno = "Lukas";
		System.out.println(meno);
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
