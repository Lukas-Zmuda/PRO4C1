import java.util.Scanner;

public class U_Priemer2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("--- Program na vypocet aritmetickeho priemeru ---");
		int pocet = 0;
		
		double sucet = 0;
		double cislo = 0;
		
		while(true) {
			System.out.println("Zadaj cislo:");
			cislo = sc.nextDouble();
			if(cislo == 0) {
				break;
			}
			sucet += cislo;
			pocet++;			
		}		
		System.out.println("Aritmeticky priemer je " + (sucet / pocet));

	}

}
