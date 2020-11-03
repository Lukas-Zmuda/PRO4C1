import java.util.Scanner;

public class Vstup {

	public static void main(String[] args) {
		
		Scanner sc;
		
		sc = new Scanner(System.in);
		
		String meno = "";
		System.out.println("Zadaj meno: ");
		
		//nacitanie mena z klavesnice do premennej meno
		meno = sc.next();
		
		int rokNarodenia = 0;
		System.out.println("Zadaj rok narodenia: ");
		//nacitanie roku narodenia ako cele cislo
		rokNarodenia = sc.nextInt();		
		
		double priemer = sc.nextDouble();
		
		System.out.println("Ahoj \"" + meno + "\"!\nMas " + (2020 - rokNarodenia) + " rokov.");
		
		
		

	}

}
