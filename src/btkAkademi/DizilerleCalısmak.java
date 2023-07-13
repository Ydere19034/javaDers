package btkAkademi;

public class DizilerleCalısmak {

	public static void main(String[] args) {
		String ogrenci1="asude";
		String ogrenci2="yasin";
		String ogrenci3="sezer";
		String ogrenci4="ahmet";
		
		System.out.println(ogrenci1);
		System.out.println(ogrenci2);
		System.out.println(ogrenci3);
		System.out.println(ogrenci4);
		
		System.out.println("---------------");
		
		String[] ogrenciler= new String[4];
		ogrenciler[0]="asude";
		ogrenciler[1]="yasin";
		ogrenciler[2]="sezer";
		ogrenciler[3]="ahmet";
		
		for (int i=0;i<ogrenciler.length;i++) {
			System.out.println(ogrenciler[i]);
			
		}
		System.out.println("---------------");
		
		
		for(String ogrenci:ogrenciler) {
			System.out.println(ogrenci);
		}
		System.out.println("---------------");
	
		double[] myList = {1.2,6.3,4.3,5.6};
		
		double total=0;
		
		double max= myList[0];
		
		for(double number:myList) {
			if(max<number) {
				max = number;
			}
			total= total + number;
			System.out.println(number);
		}
		System.out.println("Toplam =" + total );
		System.out.println("En Büyük"+ max);
		
		// çok boyutlu dizeler
		
		String[][] sehirler= new String[3][3];
		
		sehirler[0][0]="İstanbul";
		sehirler[0][1]="Bursa";
		sehirler[0][2]="Bilecik";
		sehirler[1][0]="Ankara";
		sehirler[1][1]="Konya";
		sehirler[1][2]="Kayseri";
		sehirler[2][0]="Diyarbakır";
		sehirler[2][1]="Şanlıurfa";
		sehirler[2][2]="Gaziantep";
		
		for( int i = 0; i<=2;i++) {
			System.out.println("-------------");
		for(int j=0; j<=2; j++) {
				System.out.println(sehirler[i] [j]);
			}
		}
	}
}
	
