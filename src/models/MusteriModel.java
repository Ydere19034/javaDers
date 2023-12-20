package models;

public class MusteriModel {

	private int id ;
	private String ad ;
	private String soyad ;
	private String cınsıyet ;
	private String dogumTarıhı ;
	private int telefonNumarasi ;
	private String postaAdresi ;
	private String odemeBilgisi ;
	private String biletilgileri ;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAd() {
		return ad;
	}
	public void setAd(String ad) {
		this.ad = ad;
	}
	public String getSoyad() {
		return soyad;
	}
	public void setSoyad(String soyad) {
		this.soyad = soyad;
	}
	public String getCınsıyet() {
		return cınsıyet;
	}
	public void setCınsıyet(String cınsıyet) {
		this.cınsıyet = cınsıyet;
	}
	public String getDogumTarıhı() {
		return dogumTarıhı;
	}
	public void setDogumTarıhı(String dogumTarıhı) {
		this.dogumTarıhı = dogumTarıhı;
	}
	public int getTelefonNumarasi() {
		return telefonNumarasi;
	}
	public void setTelefonNumarasi(int telefonNumarasi) {
		this.telefonNumarasi = telefonNumarasi;
	}
	public String getPostaAdresi() {
		return postaAdresi;
	}
	public void setPostaAdresi(String postaAdresi) {
		this.postaAdresi = postaAdresi;
	}
	public String getOdemeBilgisi() {
		return odemeBilgisi;
	}
	public void setOdemeBilgisi(String odemeBilgisi) {
		this.odemeBilgisi = odemeBilgisi;
	}
	public String getBiletilgileri() {
		return biletilgileri;
	}
	public void setBiletilgileri(String biletilgileri) {
		this.biletilgileri = biletilgileri;
	}
	public MusteriModel(int id, String ad, String soyad, String cınsıyet, String dogumTarıhı, int telefonNumarasi,
			String postaAdresi, String odemeBilgisi, String biletilgileri) {
		super();
		this.id = id;
		this.ad = ad;
		this.soyad = soyad;
		this.cınsıyet = cınsıyet;
		this.dogumTarıhı = dogumTarıhı;
		this.telefonNumarasi = telefonNumarasi;
		this.postaAdresi = postaAdresi;
		this.odemeBilgisi = odemeBilgisi;
		this.biletilgileri = biletilgileri;
	}
	public MusteriModel() {
		super();
	}	
}
