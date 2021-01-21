
public class Pole {

	public static void main(String[] args) {

		//deklaracia pola
		int[] cisla;
		
		//inicializacia prazdneho pola
		cisla = new int[5];
		
		cisla[0] = 12;
		cisla[1] = cisla[0] + 10;
		cisla[2] = cisla[1] * 8;
		cisla[3] = -789;
		cisla[4] = 22;
		
		System.out.println("3. prvok pola cisla ma hodnotu: " + cisla[2]);
		
		for(int i = 0; i < 5; i++) {
			System.out.print(cisla[i] + ", ");
		}
		
		int[] cisla2 = new int[10];
		
		//deklaracia pola vymenovanim prvkov
		int[] cisla3 = {10, 12, 987, 1};
		
		String[] mena = {"Lukas", "Jan", "Katarina", "Tomas", "Petra"};
		int[] vyska = {186, 190, 178, 181, 177};
		
		
		System.out.println("\nPocet mien v zozname: " + mena.length);
		System.out.println("\nZoznam mien:");
		for(int i = 0; i < mena.length; i++) {
			System.out.println((i + 1) + ". " + mena[i] + ": " + vyska[i] + " cm");
		}
		
		
		

	}

}
