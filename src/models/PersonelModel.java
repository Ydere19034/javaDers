package models;

public class PersonelModel {

	private int id ;
	private String personelAdi ;
	private String personelSoyadi ;
	private String cinsiyet ;
	private String dogumTarıhı ;
	private String departman ;
	private double maas ;
	private int telefonNumarası ;
	private String postaAdresi ;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPersonelAdi() {
		return personelAdi;
	}
	public void setPersonelAdi(String personelAdi) {
		this.personelAdi = personelAdi;
	}
	public String getPersonelSoyadi() {
		return personelSoyadi;
	}
	public void setPersonelSoyadi(String personelSoyadi) {
		this.personelSoyadi = personelSoyadi;
	}
	public String getCinsiyet() {
		return cinsiyet;
	}
	public void setCinsiyet(String cinsiyet) {
		this.cinsiyet = cinsiyet;
	}
	public String getDogumTarıhı() {
		return dogumTarıhı;
	}
	public void setDogumTarıhı(String dogumTarıhı) {
		this.dogumTarıhı = dogumTarıhı;
	}
	public String getDepartman() {
		return departman;
	}
	public void setDepartman(String departman) {
		this.departman = departman;
	}
	public double getMaas() {
		return maas;
	}
	public void setMaas(double maas) {
		this.maas = maas;
	}
	public int getTelefonNumarası() {
		return telefonNumarası;
	}
	public void setTelefonNumarası(int telefonNumarası) {
		this.telefonNumarası = telefonNumarası;
	}
	public String getPostaAdresi() {
		return postaAdresi;
	}
	public void setPostaAdresi(String postaAdresi) {
		this.postaAdresi = postaAdresi;
	}
	public PersonelModel(int id, String personelAdi, String personelSoyadi, String cinsiyet, String dogumTarıhı,
			String departman, double maas, int telefonNumarası, String postaAdresi) {
		super();
		this.id = id;
		this.personelAdi = personelAdi;
		this.personelSoyadi = personelSoyadi;
		this.cinsiyet = cinsiyet;
		this.dogumTarıhı = dogumTarıhı;
		this.departman = departman;
		this.maas = maas;
		this.telefonNumarası = telefonNumarası;
		this.postaAdresi = postaAdresi;
	}
	public PersonelModel() {
		super();
	}	
}
