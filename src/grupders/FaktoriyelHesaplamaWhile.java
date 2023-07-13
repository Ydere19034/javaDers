package grupders;
import java.util.Scanner;
public class FaktoriyelHesaplamaWhile {

	public static void main(String[] args) {
		
		//döngü başlatılıcak
		// while(koşul) { arttırma } 
		
	
		
		try (Scanner scan = new Scanner(System.in)) {
			int faktoriyel = 1;
			 
			System.out.print("Bir sayi giriniz: ");
			int sayi = scan.nextInt();
			 
			while(sayi > 0) {
	            faktoriyel *= sayi;
	            sayi--;
			}	
			 System.out.print(sayi * faktoriyel);
		}
    }
}

		

	


