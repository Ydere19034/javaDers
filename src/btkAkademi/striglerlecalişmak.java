package btkAkademi;

public class striglerlecalişmak {

	public static void main(String[] args) {
	String mesaj="Bugün hava çok güzel";
		System.out.println(mesaj);

		//charAt belli bir kelime grubu içerisinde kolay bulunmaya yardımcı oluyor
		// concat birleştirmek
		// startswith cümlenin baş harfini dogrular true false olarak
		// endswith cümlenin sonundaki dogrular
		// büyük küçük harf yazımı noktalama ısaretlerıne dıkkat et dogru ıse yanlıs yanlıs ıse dogru gosterebılır
		// getchars karakterleri al
		//indexof belirtilen cumlenın basından kaçıncı eleman oldugunu gösterir
		//lastındexof cumlenın sonundan belırtılen karakterı aramaya baslar
		// replace degıstırme anlamına gelıyor
		// substring bir metnin içerisinden parça almaktır
		// split bir metni belli bir karakter dizisine göre parcalar ayırır
		//tolowercase cumleyı kucuk harfe cevırır kelıme aramalarda sıklıkla kullanılır
		//touppercase butun harflerı buyutur kelıme aramalarda sıklıkla kullanılır
		//trim cumlede bulunan boslukları kaldırır
		
		
		/*
		System.out.println("Eleman sayısı:" + mesaj.length() );
		System.out.println("5.eleman:"+mesaj.charAt(4));
		System.out.println(mesaj.concat(" yaşasın!"));
		System.out.println(mesaj.startsWith("B"));
		System.out.println(mesaj.endsWith("l"));
		
		char[] karakterler =new char[5];
		mesaj.getChars(0, 5, karakterler,0 );
		System.out.println(karakterler);
		
		System.out.println(mesaj.indexOf("av"));
		System.out.println(mesaj.lastIndexOf('a'));
		*/
		
		String yeniMesaj= mesaj.replace(' ' , '-');
		System.out.println(yeniMesaj);
		System.out.println(mesaj.substring(2));
		System.out.println(mesaj.substring(2,4));
		
		for(String kelime : mesaj.split(" ")) {
			System.out.println(kelime);
		}
		
		System.out.println(mesaj.toLowerCase());
		System.out.println(mesaj.toUpperCase());
		System.out.println(mesaj.trim());
		
		
	}
}
