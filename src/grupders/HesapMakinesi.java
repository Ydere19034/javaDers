package grupders;
import java.util.Scanner;

public class HesapMakinesi {

	public static void main(String[] args) {
		int birinciSayi;
		int ikinciSayi;
		int secim;
		Scanner tarayaci = new Scanner(System.in);
		
//print = yanına yazdırır
//println = alt satıra yazdırır
		

		
		
		System.out.print("1. Sayınızı Giriniz :  ");
		birinciSayi=tarayaci.nextInt();
		System.out.print("2. Sayınızı Giriniz : ");
		ikinciSayi=tarayaci.nextInt();
		System.out.println("****İSLEMİNİZİ SEÇİNİZ***");
		System.out.println(" 1. TOPLAMA");
		System.out.println(" 2. ÇIKARMA");
		System.out.println(" 3. ÇARPMA");
		System.out.println(" 4. BÖLME");
		System.out.print("Seciminizi giriniz :");
		secim=tarayaci.nextInt();
		
		if(secim == 1) {
			System.out.print("Toplama İsleminin sonucu =" + (birinciSayi + ikinciSayi) );
		}
		else if(secim == 2) {
			System.out.print("Çıkarma İşleminin sonucu =" + (birinciSayi - ikinciSayi));
		}
		else if (secim == 3) {
			System.out.print("Çarpma İşleminin sonucu =" + (birinciSayi * ikinciSayi));
		}
		else if  (secim  == 4)	{
			if (ikinciSayi == 0  ) {
				System.out.println("Bir Sayının Sıfıra Bölümü Tanımsızdır..");
			}else {				
				double sonuc = (birinciSayi * 1.0)  / ikinciSayi ;
				System.out.print("Bölme İşleminin sonucu = " + sonuc );
			}
		}
		
		
		
			
	
				

		
		
		
				
		
		
		
	}

}
