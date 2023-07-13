package grupders;


	
public class Kitap{
	private String isim;
	private int sayfa;
	private String yazar;
	private String tur;
	
	public String getIsim() {
		return isim;
	}
	public void setIsim(String isim) {
		this.isim = isim;
	}
	public int getSayfa() {
		return sayfa;
	}
	public void setSayfa(int sayfa) {
		this.sayfa = sayfa;
	}
	public String getYazar() {
		return yazar;
	}
	public void setYazar(String yazar) {
		this.yazar = yazar;
	}
	public String getTur() {
		return tur;
	}
	public void setTur(String tur) {
		this.tur = tur;
	}
	public Kitap() {
		
	}
	public Kitap(String isim,int sayfa,String yazar,String tur) {
		
		setIsim(isim);
		setSayfa(sayfa);
		setYazar(yazar);
		setTur(tur);
		
	}
	public Kitap(String isim,String yazar) {
		
	}
	
	public String kitabiTanit() {
		String result = "Kitabın adı"+ getIsim()+ "."
				+ getSayfa() + "sayfa." + "Yazarı"
				+ getYazar() + "Türü" 
				+ getTur();
		System.out.println(result);
		return result;
		
	}
	
}



