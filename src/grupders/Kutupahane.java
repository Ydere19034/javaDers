package grupders;
import java.util.ArrayList;
import java.util.Scanner;
public class Kutupahane {

	public static void main(String[] args) {
		
		Kitap kitap1 = new Kitap(" Lupin ", 230 ," Maurıce Leblanc "," Polisiye " );
		
		Kitap kitap2 = new Kitap(" Harry Potter ve Ateş Kadehi ", 660 ," J.K.Rowling "," Bilim Kurgu ");
		
		Kitap kitap3 = new Kitap(" Küçük Prens ", 90 ," Antoıne de saınt-exupery "," Modern Klasik ");
		
		System.out.println();

		ArrayList<Kitap> kutuphane = new ArrayList<>();

		Scanner tara = new Scanner(System.in);
		
		kutuphane.add(kitap1);
		kutuphane.add(kitap2);
		kutuphane.add(kitap3);
		
		String kullaniciKitap ;
		int kullaniciSayfa ;
		String kullaniciYazar ;
		String kullaniciTuru ;
		
		System.out.print("Lütfen kitap adını giriniz:");
			kullaniciKitap = tara.next();
		System.out.print("Lütfen sayfa sayısını giriniz:");
			kullaniciSayfa = tara.nextInt();
		System.out.print("Lütfen yazarın adını giriniz:");
			kullaniciYazar = tara.next();
		System.out.print("Lütfen kitabın türünü giriniz:");
			kullaniciTuru = tara.next();
					
					Kitap kitap4 = new Kitap(kullaniciKitap,kullaniciSayfa,kullaniciYazar,kullaniciTuru);
					
					System.out.println(kitap1.kitabiTanit());
					System.out.println(kitap2.kitabiTanit());
					System.out.println(kitap3.kitabiTanit());
					System.out.println(kitap4.kitabiTanit());
		
	}

}
