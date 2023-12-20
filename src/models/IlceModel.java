package models;

public class IlceModel {
	
	private int id ;
	private String adi ;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAdi() {
		return adi;
	}
	public void setAdi(String adi) {
		this.adi = adi;
	}
	public IlceModel(int id, String adi) {
		super();
		this.id = id;
		this.adi = adi;
	}
	
	public IlceModel() {
		super();
	}
	
}
