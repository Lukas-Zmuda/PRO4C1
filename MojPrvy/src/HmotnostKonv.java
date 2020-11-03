import java.util.Scanner;

public class HmotnostKonv {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);		
		System.out.println("Zadaj hmotnost v librach: ");		
		int kolko_pound = sc.nextInt();
		double pound = 0.45359237;
		double kila = pound * kolko_pound ;
		System.out.println(kolko_pound + " lb = " + kila + " kg");

	}

}
 