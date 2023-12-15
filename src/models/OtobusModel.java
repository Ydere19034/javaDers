package models;

public class OtobusModel {
	
	private int id ;
	private int koltukSayisi  ;
	private String sofor ;
	private String muavin ;
	private String host ;
	private String plaka ;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getKoltukSayisi() {
		return koltukSayisi;
	}
	public void setKoltukSayisi(int koltukSayisi) {
		this.koltukSayisi = koltukSayisi;
	}
	public String getSofor() {
		return sofor;
	}
	public void setSofor(String sofor) {
		this.sofor = sofor;
	}
	public String getMuavin() {
		return muavin;
	}
	public void setMuavin(String muavin) {
		this.muavin = muavin;
	}
	public String getHost() {
		return host;
	}
	public void setHost(String host) {
		this.host = host;
	}
	public String getPlaka() {
		return plaka;
	}
	public void setPlaka(String plaka) {
		this.plaka = plaka;
	}
	public OtobusModel() {
		super();
	}
	public OtobusModel(int id, int koltukSayisi, String sofor, String muavin, String host, String plaka) {
		super();
		this.id = id;
		this.setId(id);
		this.koltukSayisi = koltukSayisi;
		this.sofor = sofor;
		this.muavin = muavin;
		this.host = host;
		this.plaka = plaka;
		
	}
	
	
	
		
}
