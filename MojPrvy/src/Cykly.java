
public class Cykly {

	public static void main(String[] args) {
		
		//cyklus s pevnym poctom opakovani
		
		for(int i = 0; i < 5; i++) {
			System.out.println((i + 1) + ". Ahoj!");
			//System.out.println("i = " + i);
		}
		System.out.println("Ako sa mas?");
		
		//0:10
		//1:9
		//2:8
		//3:7
		//4:6
		//5:5
		//...
		//10:0
		
		for(int i = 0, j = 10; i < 11; i++, j--) {
			System.out.println(i + ":" + j);
		}
		
		//0:0
		//1:0
		//2:0
		//0:1
		//1:1
		//...
		//2:2

		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				System.out.println(j + ":" + i);
			}
				
		}
		System.out.println("-------------");
		int k = 1; 
		while(k < 11) {
			System.out.print(k + ", ");
			k++;
		}
		
		System.out.println();
		k = -10;
		do {
			System.out.print(k + ", ");
			k--;
		}while(k > 0);
		
	}

}
