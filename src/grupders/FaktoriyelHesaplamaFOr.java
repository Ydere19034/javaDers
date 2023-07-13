package grupders;
import java.util.Scanner;

public class FaktoriyelHesaplamaFOr {
	 public static void main(String[] args) {
         
	
		 
		try (// for ( int 1 = başlangıç ; koşul ; arttrma ) {  }
			Scanner scan = new Scanner(System.in)) {
				int faktoriyel = 1;
				 
				System.out.print("Bir sayi giriniz: ");
				int sayi = scan.nextInt();
				 
				for(int y = 1; y <= sayi; y++)
				{
				    faktoriyel = faktoriyel * y;
				}
				System.out.print(sayi  + faktoriyel);
			}
	    }

}
