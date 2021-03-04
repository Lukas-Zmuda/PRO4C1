package edu.retazce;

public class StringDemo {

	public static void main(String[] args) {

		String sprava = "Vitajte na programovani";
		
		String s = new String("Kratka sprava");
		System.out.println(s);
		
		String m1 = "Lukas";
		String m2 = "Lukas";
		String m3 = "Alexander";
		
		String m4 = "   LUKAS ";
		System.out.println(m1 == m2);
		String m10 = new String("Lukas");
		String m11 = new String("Lukas");
		System.out.println(m1 == m10);
		System.out.println(m11 == m10);
		
		System.out.println(m11.equals(m10));
		System.out.println(m1.equals(m10));
		
		System.out.println("Lukas zacina na Lu: " + m1.startsWith("Lu"));
		
		System.out.println("Lukas konci na Kas:" + m1.endsWith("Kas"));
		
		System.out.println(m2.compareTo(m1));
		
		System.out.println("Dlzka spravy je: " + sprava.length());
		
		System.out.println("Meno zacina pismenom: " + m1.charAt(0));
		
		for(int i = (m1.length() - 1); i >= 0; i--) {
			System.out.print(m1.charAt(i));
		}
		System.out.println();
		
		String celeMeno = "Fero Hrasko";
		
		System.out.println("Priezvisko: " + celeMeno.substring(6));
		String priezvisko = celeMeno.substring(6);
		System.out.println(celeMeno.substring(6, 9));
		
		System.out.println(celeMeno);
		
		System.out.println(m1.equals(m4));
		System.out.println(m1.toLowerCase());
		System.out.println(m1.toUpperCase());
		
		System.out.println(m1.toLowerCase().equals(m4.toLowerCase()));
		System.out.println(m1.equalsIgnoreCase(m4));
		
		System.out.println(m4);
		System.out.println(m4.trim());
		System.out.println(m4);
		
		System.out.println(m1.trim().equalsIgnoreCase(m4.trim()));
		String mena = "Jan,Fero,Michal,Ivana,Peter,Igor";
		
		String[] mm = mena.split(",");
		for(int i = (mm.length - 1); i >= 0;i--) {
			System.out.println(mm[i]);
		}
		
		System.out.println(m1.indexOf('r'));
		
		System.out.println("Spravne priezvisko: " + celeMeno.substring(celeMeno.indexOf(' ') + 1));
		
	}

}
