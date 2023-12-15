package grupders;

import models.OtobusModel;

public class OtobusBıletOtomasyonu {
		
	public static void main(String[] args) {
		
		OtobusModel abc = new OtobusModel();
		
		abc.setId(1);
		abc.setKoltukSayisi(52);
		abc.setMuavin("sezer");
		abc.setPlaka("34 abc 789");
		abc.setSofor("sahmet");
		abc.setHost("mehmet");
		
		OtobusModel otobus1 = new OtobusModel(2, 52, "burak", "selma", "halim","34 plk 1903" );
		
		System.out.println("Birinci otobüsün kaptanı: " + abc.getSofor());
		System.out.println("İkinci orobüs kaptanı: " + otobus1.getSofor());
		
		
	}
	

	
	
	
}
