package models;

import java.util.ArrayList;
import java.util.List;

public class IlModel {
	
	private int plaka ;
	private String adi ;
	private  List<IlceModel> ilçeListesi ;
	/**
	 * @param plaka
	 * @param adi
	 * @param ilçeListesi
	 */
	public IlModel(int plaka, String adi, List<IlceModel> ilçeListesi) {
		super();
		this.plaka = plaka;
		this.adi = adi;
		this.ilçeListesi = ilçeListesi;
	}
	
	public IlModel() {
		super();
	}

	public int getPlaka() {
		return plaka;
	}

	public void setPlaka(int plaka) {
		this.plaka = plaka;
	}

	public String getAdi() {
		return adi;
	}

	public void setAdi(String adi) {
		this.adi = adi;
	}

	public List<IlceModel> getIlçeListesi() {
		return ilçeListesi;
	}

	public void setIlçeListesi(List<IlceModel> ilçeListesi) {
		this.ilçeListesi = ilçeListesi;
	}
	
	public void addIlce(int id ,String ilceAdi) {
		if (this.ilçeListesi == null) {
			this.ilçeListesi = new ArrayList<>();
		}
		IlceModel ilce = new IlceModel(id , ilceAdi);
		this.ilçeListesi.add(ilce);
	}
	
}
