import java.util.Scanner;

public class U_Priemer {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("--- Program na vypocet aritmetickeho priemeru ---");
		int pocet = 0;
		
		System.out.println("Zadaj pocet cisel: ");
		pocet = sc.nextInt();
		double sucet = 0;
		double cislo = 0;
		
		for(int i = 0; i < pocet; i++) {
			System.out.println("Zadaj cislo[" + (i+1) + "/" + pocet + "]:");
			cislo = sc.nextDouble();
			sucet += cislo;
		}
		
		System.out.println("Aritmeticky priemer je " + (sucet / pocet));

	}

}
