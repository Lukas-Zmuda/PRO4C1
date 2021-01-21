
public class Cykly2 {

	public static void main(String[] args) {
		
		
		int i = 0;
		while(true) {
			if(i == 5) {
				i++;
				continue;
			}
			System.out.print(i + ", ");
			i++;
			if(i > 10) {
				break;
			}
		}
		System.out.println("\nProgram pokracuje dalej ...");
	}

}
